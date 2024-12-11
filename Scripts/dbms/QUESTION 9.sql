-- PART A--------------

select getdate()
select getdate()+365
select convert(varchar, getdate(),107)
select convert(varchar,getdate(),6)
select convert(varchar,getdate(),10)
select DATEDIFF(MONTH,'31-dec-08','31-mar-09')
select DATEDIFF(YEAR,'25-jan-12','14-sep-10')
select DATEDIFF(hour,'25-jan-12 7:00','26-jan-12 10:30')
select getdate()-'12-may-16'
select dateadd(year,5,getdate())
select dateadd(month,-2,getdate())
select datename(month,getdate())
select datepart(month,getdate())
select EOMONTH(getdate())
select datediff(year,'08-march-2005',getdate())



--------PART B------------

create table employee1(empno int,empname varchar(20),jdate date,salary decimal(8,2),city varchar(20))

insert into employee1 values(101,'Keyur','15-jan-02','12000.00','Rajkot')
insert into employee1 values(102,'Hardik','15-feb-04','14000.00','Ahmedabad')
insert into employee1 values(103,'Kajal','14-mar-06','15000.00','Baroda')
insert into employee1 values(104,'Bhoomi','23-jun-05','12500.00','Ahmedabad')
insert into employee1 values(102,'Harmit','15-feb-04','14000.00','Rajkot')
insert into employee1 values(105,'Jay','12-mar-07','12000.00','Surat')
select * from employee1
alter table employee1 alter column jdate datetime



select dateadd(day,365,jdate) from employee1
select convert(varchar,jdate,100) from employee1
select convert(varchar,jdate,106) from employee1
select convert(varchar,jdate,7) from employee1
select datediff(month,jdate,'31-mar-09') from employee1
select datediff(year,jdate,'14-sep-10') from employee1

-----------PART C--------------

select getdate()-jdate from employee1
select dateadd(year,5,jdate) from employee1
select dateadd(month,-2,jdate) from employee1
select convert(varchar,datediff(year,jdate,getdate()),100) from employee1
