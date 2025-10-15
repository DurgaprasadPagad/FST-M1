#Taking input as number
numList=input("Enter list of numbers to check first and last element are same or not separated by comma: ").split(",")

#converting string input to integer
numList=[int(num.strip()) for num in numList]

#numList= [10, 20, 30, 50, 10]
print("Given list is: ",numList)

firstElement= numList[0]
lastElement=numList[-1]

if(firstElement==lastElement):
    print(True)
else:
    print(False)
