#take name and age as input
name=input("Enter your name: ")
age=int(input("Enter your age: "))

year_100= (100-age)+2025

print("You will turn 100 in " +str(year_100))

print(f"You will turn 100 in {year_100}")

print("You will turn 100 in {}".format(year_100))

#Or
#age=input("Enter your age: ")      //replace line 3
#year_100=(100-int(age))+2025       //replace line 5