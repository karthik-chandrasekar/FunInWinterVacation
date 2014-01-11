
class RemoveDup:
    def __init__(self):
        self.a = "caaabbbacdddd"

    def run_main(self):
        self.remove_dup()
        print self.a

    def remove_dup(self):
        i = ''
        new_str = ''
        j = 0
        
        str_len = len(self.a)
        for x in xrange(str_len):

            if x < str_len -1 and self.a[x] == self.a[x+1]:
                i = self.a[x]
                j = 1
            else:
                if self.a[x] != i:
                    new_str += self.a[x]
                else:
                    i = ''

        self.a = new_str
        new_str = ''
 
        if not j:
            return
        else:
            self.remove_dup()
        

if __name__ == "__main__":
    rd = RemoveDup()
    rd.run_main()
