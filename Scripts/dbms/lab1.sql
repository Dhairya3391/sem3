---Lab-1 

--part A


select * from student

select name from student where sem in (3) or (sem in (5))
select Name , EnrollmentNo from student where Stuid>103 And Stuid<105 
select Name,EnrollmentNo,Email from student where sem=5
select Top(3) * from student
select top 30 percent name,enrollmentno from student where ContactNo like '%7' 
select Distinct sem from student
select * from student where EnrollmentNo is null 
select * from student where name like '%v'
select * from student where email like '3ag' and email like '______'
select * from student where name like 'f_r%'


-- part B ----

select * from student where ContactNo like '%877'
select * from student where sem=3 and ContactNo  not like '%8%9%'  
select * from student where BirthDate >'01-01-1990'
update student set Division='BCX-5' where stuid=102
update student set name='Firoz sherasiya' where email='Firoz.me@gmail.com' and Contactno='8885999922'

--part c---

alter table student add   city  varchar(50);
delete from student where division ='Bcx-3'
exec SP_RENAME 'STUDENT.EMAIL','EMAIL'
TRUNCATE TABLE STUDENT
SELECT * into student_new from student 

-- LAB 2---

create table Employee(eid int,ename varchar(100),gender varchar(10),joiningdate datetime,salary decimal(8,2),city varchar(100))
insert into Employee values
(1, 'Nick','Male', '01-JAN-13', 4000,'London')
insert into Employee values
(2, 'Julian', 'Female', '01-OCT-14', 3000, 'New York')
insert into Employee values
(3, 'Roy', 'male', '01-JUN-14', 3500, 'London')
insert into Employee values
(4, 'tom', 'male', null, 4500, 'lodon')
insert into Employee values
(5, 'Jerry','Male', '01-FEB-13', 2800 ,' Sydney')
insert into Employee values
(6, 'Philip',' Male',' 01-JAN-15', 7000,'New York')
insert into Employee values
(7, 'Sara',' Female', '01-AUG-17', 4800,' Sydney')
insert into Employee values
(8,' Emily',' Female', '01-JAN-15', '5500', 'New York')
insert into Employee values
(9, 'Michael', 'Male', NULL, 6500,' London')
insert into Employee values
(10 ,'John' ,'Male', '01-JAN-15', 8800, 'London') 


-- part A----

select * from employee where ename like 'm__h%'
select POWER(3,5) as 'output'
select GETDATE() -20
select * from Employee where ename like 'j%n%' 
select SUBSTRING('SQL Programming',2,9)

-- part B- ----


select * from employee where city like '%ney' and city like '_______'
select char(15)
alter table employee add department varchar(20)
update Employee set department ='marketing' where city='london'
select * from employee where ename like '%n' or ename like '%y'

-- part c ------


select FLOOR(63.1),FLOOR(63.8),FLOOR(-63.2)
select * from Employee where joiningdate is null
select UPPER(ename),LOWER(city) from Employee
alter table employee alter column ename char(30)
select MAX(salary) from employee group by city



-- LAB 3---

--- part A ----

select ename,salary,city from Employee group by city,ename,salary 

select COUNT(salary) from employee where salary>5000
select SUBSTRING(ename,1,4) , SUBSTRING ename  from Employee







