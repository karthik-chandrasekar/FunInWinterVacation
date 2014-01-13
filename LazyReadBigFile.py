
class LazyRead:
    def __init__(self):
        self.file_name = "sample";
        self.file_obj = open(self.file_name)

    def lazy_read(self, file_object, chunk_size=1024):

        while True:
            data = file_object.read(chunk_size)
            if not data:
                break
            yield data

    def run_main(self):
        self.method1()
        self.file_obj.close()
        self.file_obj = open(self.file_name)
        self.method2()
        self.file_obj.close()
        self.file_obj =open(self.file_name)
        self.method3()   

    def method1(self):
        #Using generators
        for data in self.lazy_read(self.file_obj):
            print data

    def method2(self):
        #Readlines
        for line in self.file_obj.readlines():
            print line

    def lazy_iter(self):
        return self.file_obj.read(1024)

    def method3(self):
        for data in iter(self.lazy_iter, ''):
            print data


if __name__ == "__main__":
    lr = LazyRead()
    lr.run_main()
