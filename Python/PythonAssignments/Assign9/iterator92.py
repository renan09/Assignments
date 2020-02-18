#9. Write an iterator class that iterators over a sequence of values in the reverse direction

class ReverseIterator2:

    def __init__(self, val):
        self.val=val
        #print("init method")
        self.limit =len(val)
        #print("self limit ",self.limit)

    def __iter__(self): 
        self.x = 0
        return self

    def __next__(self): 
        x = self.x 
        if self.limit<= x: 
            raise StopIteration 
        self.limit = self.limit - 1; 
        return self.val[self.limit]    

    


print("---------------------")
for i in ReverseIterator2("Name"): 
    print(i) 
print("---------------------")
for i in ReverseIterator2("1234456"): 
    print(i) 
print("---------------------")
for i in ReverseIterator2([1,2,3,4,5,6,7,8,9,10]): 
    print(i) 
print("---------------------")
