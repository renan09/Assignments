#Write a program using re module that loops through the lines of a file or
#standard input (where each line contains a single word) and prints all words
#containing two adjacent vowels

import re

def findWords() :
        f = open("Q5TestFile.txt","r")
        for x in f :
            line = x
            print(line)
  #  result= re.findall("([\S]+[a-zA-Z0-9]+[aeiou][aeiou]+[a-zA-Z0-9]+[\S])",line)
            result= re.findall("([\w]+[aeiou][aeiou]+[\w]+)",line)
            print(" Result print : ",result)


findWords()
