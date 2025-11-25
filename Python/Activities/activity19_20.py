import pandas

#creating the dataset
data={
    "FirstName": ["Satvik", "Avinash", "lahari"],
    "LastName":["Shah", "Kati", "Rath"],
    "Email":["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
    "PhoneNumber": ["4537829158", "5892184058", "4528727830"]
}

df=pandas.DataFrame(data)

#wite the dataframe to an excel file
writer=pandas.ExcelWriter("./sample.xlsx")
df.to_excel(excel_writer=writer, sheet_name="Sheet1", index=False)

#to commit the data to the file
writer.close();

#activity20
input_file=pandas.read_excel("./sample.xlsx", 0, engine="openpyxl")

#Print the number of rows and columns
print("Rows:", input_file.shape[0], "columns:", input_file.shape[1])
#Print the data in the emails column only
print(input_file["Email"])
#Sort the data based on FirstName in ascending order and print the data
print(input_file.sort_values("FirstName"))