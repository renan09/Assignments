from Second import Second
from Third import Third

class Fourth(Second,Third):
    def __init__(self) :
        print("Fourth init method")

    def __printClassName(self):
        print("Fourth Class")



fclass = Fourth()
fclass.printClassName()
print(Fourth.__mro__)