#Implement a decorator that quantifies and returns the execution time of any function 


import time 
import math 
   
def calculate_time(func): 
      
    def inner1(*args): 
        begin = time.time() 
        print("Start time :",begin)
        func(*args) 
        end = time.time() 
        print("End time :",end)
        print("Total time taken in : ", func.__name__, end - begin) 
    return inner1 
 
@calculate_time
def startMethod(a): 
   
    time.sleep(a) 
    print(a,"Waiting for ", a,"secs") 
  
 
startMethod(5) 