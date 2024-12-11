/*Part A*/

create table Department(
DepartmentID Int Primary Key,
DepartmentName Varchar (100) Not Null Unique,
DepartmentCode Varchar (50) Not Null Unique,
Location Varchar (50) Not Null)

create table Person(
PersonID Int Primary Key,
PersonName Varchar(100) Not Null,
DepartmentID Int ,
Salary Decimal(8,2) Not Null,
JoiningDate Datetime Not Null,
City Varchar(100) Not Null,
Foreign Key(DepartmentID) references Department(DepartmentID));

insert into Person values 
(101,'Rahul Tripathi',2,56000,'01-jan-2000','Rajkot'),
(102,'Hardik Pandya',3,18000,'25-sep-2001','Ahmedabad'),
(103,'Bhavin Kanani',4,25000,'14-may-2000','Baroda'),
(104,'Bhoomi Vaishnav',1,39000,'08-feb-2005','Rajkot'),
(105,'Rohit Topiya',2,17000,'23-jul-2001','Jamnagar'),
(106,'Priya Menpara',NULL,9000,'18-oct-2000','Ahmedabad'),
(107,'Neha Sharma',2,34000,'25-dec-2002','Rajkot'),
(108,'Nayan Goswami',3,25000,'01-jul-2001','Rajkot'),
(109,'Mehul Bhundiya',4,13500,'09-jan-2005','Baroda'),
(110,'Mohit Maru',5,14000,'25-may-2000','Jamnagar')


insert into Department values
 (1,'Admin','Adm','A-Block'),
 (2,'Computer','CE','C-Block'),
 (3,'Civil','CI','G-Block'),
(4,'Electrical','EE','E-Block'),
(5,'Mechanical','ME','B-Block')

select * from Department
select * from Person

select p.PersonName,d.DepartmentName,d.DepartmentCode from Person p
inner join Department d on p.DepartmentID=d.DepartmentID; 

select min(p.Salary) as Min_Salary,max(p.Salary) as Max_Salary,d.DepartmentName from Person p 
inner join Department d on p.DepartmentID=d.DepartmentID
group By d.DepartmentName;

select DepartmentName from Department d inner join person p
on d.DepartmentID=p.DepartmentID where Salary=
(select SUM(Salary) from Person p inner join 
Department d on p.DepartmentID=d.DepartmentID
where Salary>100000 group By d.DepartmentName)