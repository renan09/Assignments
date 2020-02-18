import math
from math import radians
def calculator(func,val):
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
    radValue= radians(val)
    print("rad value of degree : ",radValue)

def findTrigFunction(val):
    value= radians(val)
    sinValue=math.sin(value)
    cosValue=math.cos(value)
    tanValue=math.tan(value)
    print("Trig values Sin : ",sinValue)
    print("Trig values Cos : ",cosValue)
    print("Trig values Tan : ",tanValue)

def findTrigFunc_2(val):
    sinValue = lambda x:math.sin(radians(val))
    print("sinValue : ", str(sinValue(val)))

    cosValue = lambda x:math.cos(radians(val))
    print("cosValue : ", str(cosValue(val)))

    tanValue = lambda x:math.tan(radians(val))
    print("tanValue : ", str(tanValue(val)))