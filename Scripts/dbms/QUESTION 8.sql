-- PART A--------------

select len(null)
select len(' hello ')
select len('Blank')
select upper('Jay')
select lower('Jay')
select substring('Jay dave',1,3)
select substring('Jay Dave',3,6)
select replace('abc123efg','123','XYZ')
select replace('abc123efg','123','abc')
select replace('abc123efg','c','5')
select ascii('a'),ascii('A'),ascii('z'),ascii('Z')
select char(97),char(65),char(122),char(90),char(48),char(57)
select ltrim(' hello world ')
select rtrim(' hello world ')
select substring('SQL Server',1,4)
select substring('SQL Server',5,6)
select cast(1234.56 as char)
select cast(10.58 as int)
select convert(int,10.58)
select space(10)+'Jay'
select 'Jay'+'Dave'
select concat('Jay','abc')
select reverse('Darshan')
select replicate('Jay',3)



--------PART B------------

select len(Firstname),len(Lastname) from student
select upper(Firstname) as uppercase,upper(Lastname) as uppercase,lower(Firstname) as lowwercase,lower(Lastname)as lowwercase from student
select substring(website,3,8) from student


--------PART C------------

select space(10)+Firstname from student
select lastname+firstname from student
select concat(firstname,lastname) from student
select reverse(firstname) from student