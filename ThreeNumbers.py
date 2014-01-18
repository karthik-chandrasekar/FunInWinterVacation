from collections import Counter
from collections import defaultdict

class ThreeNumbers:
    def __init__(self):
        pass

    def run(self, numList):
        numMap = {}
       
           
        d = defaultdict(int)
        
        for num in numList:
            d[num] += 1 
        

        for key, value in d.iteritems():
            print key
            print value
            print "\n"

if __name__ == "__main__":
    tn = ThreeNumbers()
    tn.run([3,1,2,3,3,2,2])
