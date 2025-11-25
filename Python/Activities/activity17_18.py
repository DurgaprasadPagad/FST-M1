import pandas

#Creating the database
data={
    "usernames": ["admin", "Charles", "Deku"],
    "passwords": ["password", "Charl13", "Allmight"]
    }

#Convert the data into DataFrame
df=pandas.DataFrame(data)

#Write the dataframe to a file
df.to_csv("./creds.csv")

#activity18
input_file=pandas.read_csv("./creds.csv")

#print only usernames column
print(input_file["usernames"])

#print the username and password of the second row
print("Second row value:", input_file["usernames"][1], input_file["passwords"][1])

#sort the usernames column data in ascending order and print data
print(input_file.sort_values("usernames"))

#sort the passwords column in descending order and print
print(input_file.sort_values("usernames", ascending=False))