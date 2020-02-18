#
# 2. Write a program to handle the following exceptions            
# a) KeyboardInterrupt,           
#  b) NameError            
#  c) ArithmeticError     Note : make use of  Try, except, else and finally blocks#
import time
def tryException():
    print("...........................testing exceptions......................................")
    try:
        print("************starting execution**************")
###########################################################################################################
# # Please uncomment each of the line to trigger valid exception : Currently it throws Arithmetic Exception.

      #  print(10/0) # Arithmetic Error
       # findfacto(10) #Name Error
       # val="kind"+9 #Type Error

       # Please use "ctrl + c" to interrupt the execution, which throws an Keyboard Interrupt #Keyboard Interrupt
        time.sleep(5)
        print("Sleep 5 sec")

############################################################################################################
    except NameError:
        print("Name Error")
    except TypeError:
        print("In Type Error ")
    except ArithmeticError:
        print("Arithmetic Error")
    except KeyboardInterrupt:
        print("Keyboard Interrupt")
    
    else:
        print("In Else block : When there is no Exception")
    
    finally :
        print("************In finally block************")




tryException()