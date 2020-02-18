#7. Create a class called First and two classes called Second and Third which inherit from First.
#  Create class called Fourth which inherits from Second and Third. 
# Create a common method called method1 in all the classes and provide the Method Resolution Order

class First():
   
    def method1(self):
        print("In First class")
        
class Second(First):

    def __method1(self):
        print("In Second class")
        
class Third(First):
    
    def __method1(self):
        print("In Third class")
        
class Fourth(Second,Third):
 
    def __method1(self):
        print("In Fourth class")
        
ins=Fourth()
print(ins.method1())

#Method Resolution order 
print(Fourth.__mro__)