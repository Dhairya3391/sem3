
-----------p 20----------------

create table student (rno int primary key ,name varchar(20),branch varchar(20),spi decimal(5,2),bklog int)
insert into student values(101,'raju','ce',8.80,0)
insert into student values(102,'amit','ce',2.20,3)
insert into student values(103,'sanjay','me',1.50,6)
insert into student values(104,'neha','ec',7.65,1)
insert into student values(105,'meera','ee',5.52,2)
insert into student values(106,'mahesh','ec',4.50,3)
select * from student

-------------part A-----------------
create view personal as select * from student
select * from personal

create view student_details as select name,branch,spi from student
select * from student_details 

create view academic as select rno,name,branch from student
select * from academic

create view student_data as select * from student where bklog>2
select * from student_data

create view  Student_Pattern as 
select rno,name,branch from student where name like'____'
select * from  Student_Pattern

insert into academic values(107,'meet','me')
select * from academic

update student_details set branch='me' where name='amit'
select * from student_details

delete from academic where rno=104
select * from academic

drop table student

----------------Part B ---------------------------

create table student (rno int primary key ,
name varchar(50) not null,
branch varchar(50) not null,
spi decimal(4,2) not null,
bklog int not null)

insert into student values(101,'raju','ce',8.80,0)
insert into student values(102,'amit','ce',2.20,3)
insert into student values(103,'sanjay','me',1.50,6)
insert into student values(104,'neha','ec',7.65,1)
insert into student values(105,'meera','ee',5.52,2)
insert into student values(106,'mahesh','ec',4.50,3)
select * from student

create view personal1 as select * from student
select * from personal1

create view student_details1 as select name,branch,spi from student
select * from student_details1 

create view academic1 as select rno,name,branch from student
select * from academic1

create view student_data1 as select * from student where bklog>2
select * from student_data1

create view  Student_Pattern1 as 
select rno,name,branch from student where name like'____'
select * from  Student_Pattern1

insert into academic1 values(107,'meet','me')
select * from academic1

update student_details1 set branch='me' where name='amit'
select * from student_details1

delete from academic1 where rno=104
select * from academic1

-------------------- p-19-----------------------------------

create table person(PersonID Int Primary Key,
PersonName Varchar (100) Not Null,
DepartmentID Int Foreign Key, Null,
Salary Decimal(8,2) Not Null,
JoiningDate Datetime Not Null,
City Varchar(100) Not Null
Foreign key(DepartmentID) references)

insert into person values(101,'RahulTripathi' 2, 56000, '01-01-2000','Rajkot')
insert into person values(102,'Hardi Pandya '3 ,18000,'25-09-2001', 'Ahmedabad')
insert into person values(103,'Bhavi Kanani '4 ,25000'14-05-2000', 'Baroda')
insert into person values(104,'Bhoom Vaishnav',1,39000 ,'08-02-2005', 'Rajkot')
insert into person values(105,'RohitTopiya',2,17000, 23-07-2001 ,'Jamnagar')
insert into person values(106,'PriyaMenpara',NULL ,9000, '18-10-2000', 'Ahmedabad')
insert into person values()






