create table person 
(pid int primary key,
pname varchar(100) not null,
salary decimal(8,2) not null,
jdate datetime not null,
city varchar(100) not null,
age int ,
bdate datetime not null)

create table person_log
(plogid  int identity(1,1) primary key ,
pid int not null,
pname varchar(250) not null,
operation varchar(50) not null,
updatedate datetime not null)

--------------part a---------------------------

create trigger person_insert
on person
after insert
as 
begin
	print 'Record is inserted'
end

create trigger person_update
on person
after update
as 
begin
	print 'Record is updated'
end

create trigger person_delete
on person
after delete
as 
begin
	print 'Record is deleted'
end

insert into person values(1,'jay',200000,'8-feb-2020','jamnagar',25,'8-mar-2005')
select * from person
select * from person_log


----------------------------------------------------------------------------------------------------------

create trigger person_insert_log
on person
for insert
as 
begin
insert into person_log(pid,pname,operation,updatedate)
select pid,pname,'inserted',getdate() from inserted	
end

create trigger person_delete_log
on person
for delete
as 
begin
insert into person_log(pid,pname,operation,updatedate)
select pid,pname,'deleted',getdate()from deleted	
end

create trigger person_update_log
on person
for update
as 
begin
insert into person_log(pid,pname,operation,updatedate)
select pid,pname,'updated',getdate() from inserted	
end

------------------------part b---------------------

create trigger person_insof_log
on person
 instead of insert
as 
begin
insert into person_log(pid,pname,operation,updatedate)
select pid,pname,'inserted',getdate() from inserted	
end

create trigger person_delof_log
on person
instead of delete
as 
begin
insert into person_log(pid,pname,operation,updatedate)
select pid,pname,'deleted',getdate() from deleted	
end

create trigger person_upof_log
on person
instead of update
as 
begin
insert into person_log(pid,pname,operation,updatedate)
select pid,pname,'updated',getdate() from inserted	
end











