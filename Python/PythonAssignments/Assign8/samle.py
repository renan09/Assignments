def squarer(list1):
    values = list(map(lambda x:x**2,list1))
    print("1 : ",values)
    values1 = zip(list1,values)
    print("2 : ",str(values1))
    squares = list(values1)
    print("3 : ",squares)
    return squares

numbers =[1,2,3,4,5]
values2 =squarer(numbers)
print("4 :",values2)
z,y = zip(*values2)
print(z,y)