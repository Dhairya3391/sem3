-- Q 10 --

-- part a -----

create table computer (rollno int, name varchar(20))
create table electrical (rollno int, name varchar(20))
insert into computer values(101,'ajay')
insert into computer values(109,'haresh')
insert into computer values(115,'manish')
insert into electrical values(105,'ajay')
insert into electrical values(107,'mahesh')
insert into electrical values(115,'manish')
select * from computer
select * from electrical

SELECT NAME FROM COMPUTER UNION SELECT NAME FROM ELECTRICAL
SELECT NAME FROM COMPUTER UNION ALL SELECT NAME FROM ELECTRICAL
SELECT NAME FROM COMPUTER INTERSECT SELECT NAME FROM electrical
SELECT NAME FROM computer EXCEPT SELECT NAME FROM electrical
SELECT NAME FROM electrical EXCEPT SELECT NAME FROM computer
SELECT * FROM computer union SELECT * FROM electrical
SELECT * FROM computer intersect SELECT * FROM electrical


---- part b--------------

CREATE TABLE EMPLOYEE1(EID int, Name Varchar(50))
CREATE TABLE customer (CID int, Name Varchar(50))
INSERT INTO EMPLOYEE1 VALUES(1, 'Ajay'),(9, 'Haresh'),(5, 'Manish')
INSERT INTO customer VALUES(5, 'Ajay'),(7, 'Mahesh'),(5, 'Manish')
select * from EMPLOYEE1
select * from customer

select name from EMPLOYEE1 union select name from customer
SELECT NAME FROM EMPLOYEE1 UNION ALL SELECT NAME FROM customer
SELECT NAME FROM EMPLOYEE1 INTERSECT SELECT NAME FROM customer
select name from EMPLOYEE1 except select name from customer
select name from customer except select name from EMPLOYEE1

---- part c------

select * from EMPLOYEE1 union select * from customer
SELECT * FROM EMPLOYEE1 UNION ALL SELECT * FROM customer
SELECT * FROM EMPLOYEE1 INTERSECT SELECT * FROM customer
select * from EMPLOYEE1 except select * from customer
select * from customer except select *from EMPLOYEE1












