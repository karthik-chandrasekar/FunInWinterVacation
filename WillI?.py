import mechanize, cookielib

class emulate:
    def __init__(self):
        self.login_url = "https://weblogin.asu.edu/cas/login?"

    def run_main(self):
        self.initialize()
        self.run()

    def initialize(self):
        # Browser
        self.br = mechanize.Browser()

        # Cookie Jar
        cj = cookielib.LWPCookieJar()
        self.br.set_cookiejar(cj)

        # Browser options
        self.br.set_handle_equiv(True)
        self.br.set_handle_gzip(True)
        self.br.set_handle_redirect(True)
        self.br.set_handle_referer(True)
        self.br.set_handle_robots(False)

        # Follows refresh 0 but not hangs on refresh > 0
        self.br.set_handle_refresh(mechanize._http.HTTPRefreshProcessor(), max_time=1)

        # Want debugging messages?
        self.br.set_debug_http(True)
        self.br.set_debug_redirects(True)
        self.br.set_debug_responses(True)

        # User-Agent (this is cheating, ok?)
        self.br.addheaders = [('User-agent', 'Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.1) Gecko/2008071615 Fedora/3.0.1-1.fc9 Firefox/3.0.1')]

    def run(self):
        self.first_phase()
        self.second_phase()
        self.third_phase()


    def first_phase(self):
        # Open some site, let's pick a random one, the first that pops in mind:
        r = self.br.open('http://google.com')
        html = r.read()

        # Show the source
        print html
        # or
        print self.br.response().read()

        # Show the html title
        print self.br.title()

        # Show the response headers
        print r.info()
        # or
        print self.br.response().info()

        # Show the available forms
        for f in self.br.forms():
            print f

        # Select the first (index zero) form
        self.br.select_form(nr=0)

        # Let's search
        self.br.form['q']='weekend codes'
        self.br.submit()
        print self.br.response().read()

        # Looking at some results in link format
        for l in self.br.links(url_regex='stockrt'):
            print l   


    def second_phase(self):
        # If the protected site didn't receive the authentication data you would
        # end up with a 410 error in your face
        self.br.add_password('http://safe-site.domain', 'username', 'password')
        self.br.open('http://safe-site.domain')  
  

    def third_phase(self):
        # Testing presence of link (if the link is not found you would have to
        # handle a LinkNotFoundError exception)
        self.br.find_link(text='Weekend codes')

        # Actually clicking the link
        req = self.br.click_link(text='Weekend codes')
        self.br.open(req)
        print self.br.response().read()
        print self.br.geturl()

        # Back
        self.br.back()
        print self.br.response().read()
        print self.br.geturl() 

if __name__ == "__main__":
    e_obj = emulate()
    e_obj.run_main()
