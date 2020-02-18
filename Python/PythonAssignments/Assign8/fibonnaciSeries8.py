#8. Implement a simple generator for Fibonacci series 

class generateFibonacciSeries():
    def __init__(self,n):
        self.n=n

    def generateFibonnacii(self) :
        n=self.n
        a = 0
        b = 1
        arra=[]
        if n < 0: 
            print("Incorrect input") 
        elif n == 0: 
            arra.append(0)
            return a 
        elif n == 1: 
            arra.append(0)
            arra.append(1)
            return b 
        else:
            arra.append(0)
            arra.append(1)
            for i in range(2,n+1): 
                c = a + b 
                a = b 
                b = c 
                arra.append(b)
                print("Arra ",arra)
            return b 
        print("Arra ",arra)
fs = generateFibonacciSeries(10)
print(fs.generateFibonnacii())