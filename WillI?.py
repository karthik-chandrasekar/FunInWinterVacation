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
        #self.second_phase()
        #self.third_phase()
        self.fourth_phase()
        self.fifth_phase()

    def first_phase(self):
        
        #Just submits the credentials and performs authentication. It does not move to any page by its own. We have to direct it to go to a specific url. 
 
        sign_in = self.br.open("")
        self.br.select_form(name="")
        self.br[""] = ""
        self.br[""] = ""
        self.br.submit()


    def second_phase(self):
        
        #Check if the course is available. If yes go ahead, submit and go to third phase. Else keep looping in second phase. 
        courses_html = self.br.open("")
        self.br.select_form(name="")
        #if course count is > 0 go ahead. Else go back to second phase beginning
        self.br[""] = "CSE"
        self.br.submit()

    def third_phase(self):
    
        # Just press the next button

        add_to_cart = self.br.open("")
        self.br.select_form(name="")  # next button
        self.br.submit()


    #Step two and third can be skipped  and directly come to fourth and fifth phase. Please verify if this is okay. 

    def fourth_phase(self):
               
        #Just proceed to step 2 of 3

        self.br.open("")
        self.br.select_form(name="") #Pressing proceed to step 2 of 3
        self.br.submit()

    def fifth_phase(self):
        
        #Just finish enrolling

        self.br.open("")
        self.br_select_form(name="") #Finish enrolling
        self.br.submit()



if __name__ == "__main__":
    e_obj = emulate()
    e_obj.run_main()
