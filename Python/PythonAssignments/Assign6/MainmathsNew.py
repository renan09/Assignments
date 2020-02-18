#6. Implement a child class called mathnew and 
# parent classes as sqroot, addition, subtraction, multiplication and division. 
# Use the super () function to inherit the parent methods.

from addition import addition
from multiplication import multiplication
from substraction import substraction
from division import division
from sqroot import sqroot

class mathsnew(addition,substraction,multiplication,division,sqroot):
    def calValues(self):
        super().findAddition(8,9)
        super().findSubstraction(8,7)
        super().findMultiply(9,9)
        super().findDivision(9,9)
        super().findSqroot(16)

math = mathsnew()
math.calValues()