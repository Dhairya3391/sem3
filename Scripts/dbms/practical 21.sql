create procedure person_insert
@wid int,
@fname varchar(50),
@lname varchar(50),
@salary decimal(8,2),
@jdate datetime,
@dep_id int,
@des_id int
as
begin
insert into person1 values
(@wid ,@fname ,@lname ,@salary ,@jdate ,@dep_id,@des_id);
end

exec person_insert 101,'rahul','anshu',56000,'01-jan-1990',1,12
exec person_insert 102,'hardik','hinsu',18000,'25-sep-1980',2,11
exec person_insert 103,'Bhavin','Kamani',25000,'14-may-1991',null,11
exec person_insert 104,'Bhoomi','Patel',39000,'20-feb-2014',1,13
exec person_insert 105,'Rohit','Rajgor',17000,'23-jul-1990',2,15
exec person_insert 106,'Priya','Mehta',25000,'18-oct-1990',2,null
exec person_insert 107,'neha','trivedi',18000,'20-feb-2014',3,15
select * from person1

truncate table department

create procedure department_insert
@dep_id int,
@dep_name varchar(100)
as
begin
insert into department values
(@dep_id ,@dep_name);
end

exec department_insert 1,'admin'
exec department_insert 2,'it'
exec department_insert 3,'hr'
exec department_insert 4,'Account'



select * from [dbo].[designation]

create procedure designation_insert
@deid int,
@dname varchar(50)
as
begin
insert into [dbo].[designation] values(@deid,@dname);
end

exec designation_insert 11,'Jobber'
exec designation_insert 12,'welder'
exec designation_insert 13,'clerk'
exec designation_insert 14,'Manager'
exec designation_insert 15,'CEO'

create procedure delete_Person
@id int
as
begin
delete from person1 where w_id=@id;
end
exec delete_Person 101


create procedure delete_Department
@id int
as
begin
delete from department where dep_id=@id;
end

create procedure delete_designation
@id int
as
begin
delete from designation where des_id=@id;
end

create procedure Person_update
@id int,
@fname varchar(100),
@lname varchar(100),
@salary decimal(18,2),
@jdate datetime,
@did int,
@deid int
as
begin
update  person1 set f_name=@fname where w_id=@id;
update  person1 set l_name=@lname where w_id=@id;
update  person1 set salary=@salary where w_id=@id;
update  person1 set jdate=@jdate where w_id=@id;
update  person1 set dep_id=@did where w_id=@id;
update  person1 set des_id=@deid where w_id=@id;

end

create procedure Department_updte
@id int,
@dname varchar(50)
as
begin
update department set dep_name=@dname where dep_id=@id;
end

create procedure Designation_update
@id int,
@dname varchar(50)
as
begin
update designation set des_name=@dname where des_id=@id;
end




create procedure PersonPK
@id int
as
begin
select * from person1 where w_id=@id;
end

create procedure for_3
as
begin
select top 3 * from person1;
end
exec 