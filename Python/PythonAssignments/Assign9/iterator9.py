#9. Write an iterator class that iterators over a sequence of values in the reverse direction

class ReverseIterator():
    def __int__(self):
        print("init method")

    def iterate(self,a):
        a=a
        print("List ",a)
        lengthA=len(a)
        print("length of list : ",lengthA)
        while(lengthA>0) :
            print(a[lengthA-1])
            lengthA=lengthA-1


ri = ReverseIterator()
#ri.iterate([1,2,3,4,5,6,7,8,9,10])
ri.iterate("That is the Matter")
