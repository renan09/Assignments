#How do you handle exception for the following code? 
# c = 0 
# def f2(x):     
# c+= 1     
# b = x + c     
# print c     return b print f2(1) print 

c = 0 
def f2(x):     
    c+= 1     
    b = x + c     
    print(c)    
    return b 

try:
    print(f2(1))
except Exception as e :
    print("Issue with code : Exception ",e)
print(c)