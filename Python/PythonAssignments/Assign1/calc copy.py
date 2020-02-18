def calcCopy(func,val):
    print("calc function")
    if(func=="factorial"):
        findfacto(val)
    if(func=="log"):
        findLog10(val)
    if(func=="radian"):
        findradian(val)
    if(func=="trig"):
        findTrigFunction(val)




def findfacto(val):
    facVal = math.factorial(val)
    print('factorial value : ',facVal)

def findLog10(val):
    logValue = math.log10(val)
    print("log value of : ", val," is ",logValue)

def findradian(val):
    radValue= math.radians(val)
    print("rad value of degree : ",radValue)

def findTrigFunction(val):
    sinValue=math.sin(val)
    cosValue=math.cos(val)
    tanValue=math.tan(val)
    print("Trig values Sin : ",sinValue)
    print("Trig values Cos : ",cosValue)
    print("Trig values Tan : ",tanValue)

import math
calc("log",10)