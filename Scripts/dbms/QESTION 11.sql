---- Q 11 -------

-- PART A ----------------

create table cricket(Name varchar(30),City varchar(30),Age int)
insert into cricket values ('Sachin Tendulkar','Mumbai',30)
insert into cricket values('Rahul Dravid','Bombay',35)
insert into cricket values('M. S. Dhoni','Jharkhand',31)
insert into cricket values('Suresh Raina ','Gujarat',30)
SELECT * FROM CRICKET

SELECT * INTO worldcup FROM cricket where 1=2
SELECT Name, City INTO T20 FROM cricket WHERE 1=2
select * into IPL from cricket where 1 = 2
INSERT INTO IPL SELECT * FROM cricket WHERE Name like '_A%' And Len(Name) >= 7
Delete from IPL
Delete from cricket where city = 'Jharkhand'
EXEC sp_rename 'IPL' , 'IPL2018'
Drop table T20


---- PART B---------

create table Employee(Name varchar(30),City varchar(30),Age int)
insert into Employee values ('Jay Patel', 'Rajkot ', 30)
insert into Employee values('Rahul Dave', 'Baroda', 35) 
insert into Employee values('Jeet Patel ', 'Surat', 31)
insert into Employee values('Vijay Raval', 'Rajkot', 30)

select * into Employee_detail from Employee
select Name , City into Employee_data from Employee
select * into Employee_info from Employee
INSERT INTO Employee_info SELECT * FROM Employee WHERE Name like '_A%' And Len(Name) >= 7
insert into Employee_info select * from Employee where Age > 32

------------ PART C ---------------------------


Delete from Employee_info
Delete from Employee where City = 'Rajkot'
EXEC SP_Rename 'Employee' , 'New_Employee'
Delete from New_Employee
Drop table New_Employee



++++