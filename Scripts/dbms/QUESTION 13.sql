create table student (rno int,name varchar(20),branch varchar(20))
insert into student values (101,'raju','ce')
insert into student values (102,'amit','ce')
insert into student values (103,'sanjay','me')
insert into student values (104,'neha','ec')
insert into student values (105,'meera','ee')
insert into student values (106,'mahesh','me')

create table result(rno int,spi decimal(8,2))
insert into result values(101,8.8)
insert into result values(102,9.2)
insert into result values(103,7.6)
insert into result values(104,8.2)
insert into result values(105,7.0)
insert into result values(107,8.9)

create table employee2(eno int,name varchar(20),managerno varchar(20))
insert into employee2 values('e01','tarun','null')
insert into employee2 values('e02','rohan','e02')
insert into employee2 values('e03','priya','e01')
insert into employee2 values('e04','milan','e03')
insert into employee2 values('e05','jay','e01')
insert into employee2 values('e06','anjana','e04')

select * from employee2
select * from student
select * from result

--------------- PART A ----------------------

select * from student s cross join  result r
select * from student s full join result r on s.rno=r.rno
select s.rno,name,branch,spi from student s inner join result r on s.rno=r.rno where branch='ce'
select s.rno,name,branch,spi from student s inner join result r on s.rno=r.rno where branch !='ec'
select avg(r.spi) from student s full join result r on s.rno=r.rno group by branch
select avg(r.spi) as aspi ,branch from student s full join result r on s.rno=r.rno group by branch order by aspi
select avg(r.spi) from student s full join result r on s.rno=r.rno where branch='ce' or branch='me' group by branch
select * from student s left join  result r on s.rno=r.rno
select * from student s right join  result r on s.rno=r.rno
select * from student s full join  result r on s.rno=r.rno
select e.name as Employee, s.name as Manager from employee2 e full join employee2 s on e.managerno=s.eno

-------------- PART B -----------------------------------

CREATE table person (pid int,pname varchar(30),did int,salary int,jdate date,city varchar(30))
insert into person values(101,'Rahul Tripathi',2,56000,'01-jan-2000','Rajkot')
insert into person values(102,'Hardik Pandya',3,18000,'25-sep-2001','Ahmedabad')
insert into person values(103,'Bhavin Kanani',4,25000,'14-may-2000','Baroda')
insert into person values(104,'Bhoomi Vaishnav',1,39000,'08-feb-2005','Rajkot')
insert into person values(105,'Rohit Topiya',2,17000,'23-jul-2001','Jamnagar')
insert into person values(106,'Priya Menpara',NULL,9000,'18-oct-2000','Ahmedabad')
insert into person values(107, 'Neha Sharma',2,34000,'25-dec-2002','Rajkot')
insert into person values(108, 'Nayan Goswami',3,25000,'01-jul-2001', 'Rajkot')
insert into person values(109, 'Mehul Bhundiya', 4, 13500, '09-jan-2005', 'Baroda')
insert into person values (110, 'Mohit Maru', 5, 14000, '25-may-2000' ,'Jamnagar')

create table department(did int,dname varchar(30),dcode varchar(20),location varchar(20))
insert into department values(1,'admin','adm','a-block')
insert into department values(2,'computer','ce','c-block')
insert into department values(3,'civil','cl','g-block')
insert into department values(4,'electrical','ee','e-block')
insert into department values(5,'mechanical','me','b-block')
select * from department
select * from person


select pname ,dname,dcode from person p full join department d on p.did=d.did

select dname,max(p.salary) as Maxsalary , min(p.salary) as Minsalary from 
person p full join department d on p.did=d.did
group by dname

select sum(p.salary) as salary ,dname as departmentname from person p full join department d on p.did=d.did group by dname having sum(p.salary)>100000

select p.pname,p.salary,d.dname from person p inner join department d on p.did=d.did where city='jamnagar'
select p.pname from person p   where did is null
select d.dname, count(pid) as count from person p inner join department d on p.did=d.did group by d.dname
select avg(salary) from person where city='ahmedabad'
select pname as earns,salary/12 as monthly ,dname  from person p inner join department d on p.did=d.did
select dname from person p full join department d  on p.did=d.did 
select sum(salary) as sumofsalary , avg(salary) as average ,max(salary) as maximum from person p inner join department d on p.did=d.did group by city,dname
