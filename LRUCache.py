from collections import OrderedDict

class LRUCache:

    def __init__(self, capacity):
        self.capacity = capacity;
        self.myDict = OrderedDict()


    def get(self, key):
        if key in self.myDict:
            return self.myDict.get(key)

        else:
            return -1

    def set(self, key, value):

        if key in self.myDict:
            del self.myDict[key] 
        
        self.myDict[key] = value


        if (len(self.myDict.keys()) > self.capacity):
            del self.myDict[self.myDict.keys()[0]]
            


if __name__ == "__main__":
    lc = LRUCache(2)
    lc.set(10, 3)
    lc.set(2, 4)
    print lc.get(2)
    print lc.get(10)
    lc.set(1, 9)
    print lc.get(10)
