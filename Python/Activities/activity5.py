#taking num as input
num=int(input("Enter a number to genearate multiplication table: "))

#using for loop to genenarate
for i in range(1,11):
    print(num, '*', i, '=', num*i)