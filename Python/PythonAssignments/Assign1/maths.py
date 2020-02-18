#1. Create file called “calc.py" which has following functions
#  a. function to find the factorial of a number 
# b. function to find the log10 of a number 
# c. function to convert degrees to radians 
# d. The sin, cos and tan trigonometric functions 
 
#Write a new program in file "maths.py" such that you import functions of file "calc.py" to your new program.
#  Use from <module> import <function> statement to import only functions a & d from the calc modul

from calc import findfacto,findTrigFunction,findTrigFunc_2
findfacto(10)
# Modified the code to use radians(val)
findTrigFunction(0)
#using lamda functions - passing radians(val)
findTrigFunc_2(60)
