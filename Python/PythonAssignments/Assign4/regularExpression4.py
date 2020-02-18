# Translate each of the following English statements into a regular expression:
# a. digit at the beginning of the string and a digit at the end of the string
# b. A string that contains only whitespace characters or word characters
# c. A string containing no whitespace characters

import re
def reggFunction(x):
    if x==1 :
        pattern = '(^[0-9]+[a-zA-Z0-9]+[0-9]$)'
        val=input()
        result=re.match(pattern,val)
        print(result)
        if result==None :
            print("Pattern not found")
        else :
            print("Pattern found ",result)
    if x==2 :
        pattern = '(\D.*)'
        val=input()
        result=re.match(pattern,val)
        print(result)
        if result==None :
            print("Pattern not found")
        else :
            print("Pattern found ",result)
    if x==3 :
        pattern = '([\S]+)'
        val=input()
        length = len(val)
        result=re.match(pattern,val)
        print(length,result)
        if result==None :
            print("Pattern not found")
        elif length==result.end() :
            print("Pattern found ",result)
        else :
            print("Pattern not found",result.end())




reggFunction(3)