




-----------------Practical 15---------------------
-----------------Part A---------------------------
Select s.name from Student1 s where s.did=(select d.did from department d where dname='Computer')
select s.name from Student1 s where s.rno in (select a.rno from Academic a where spi>8)
select * from Student1 s where s.did=(select d.did from Department d where dname='Computer'  and city='Rajkot')
select count(*)from Student1 s where s.did=(select did from Department where dname='electrical') 


select s.name from Student1 s where s.rno=(select rno from Academic 
where spi=(select max(spi) as Maxsalary from Academic))

select * from Student1 where rno in (select rno from Academic where Backlog>1)

