--for reset or deleting the existing table
DROP TABLE salesman;
--Activity1
--create the salesman table
--UNIQUE to dont have duplicates and not null
CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20) NOT NULL, salesman_city varchar(20), commission int);
--to view the table schema
DESCRIBE salesman;

--Activity2
--Insert one row 
INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

--intert multiple row at once
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

--view data from all columns
SELECT * FROM salesman;


--activity3
--Show data from the salesman_id and salesman_city columns
SELECT salesman_id, salesman_city FROM salesman;

--Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';

--Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

--activity4
--adding a column with grade as integer
ALTER TABLE salesman ADD grade int;

--set the grade column value to 100
UPDATE salesman SET grade=100;

--to view new column
SELECT * FROM salesman;

--activity5
--Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

--Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

--Update the name McLyon to Pierre.
UPDATE salesman SET saleman_name='Pierre' WHERE salesman_name='McLyon';

--to view modified data
SELECT * FROM salesman;