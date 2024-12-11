----------------- q-14 -------------------------------------------------------

--------Part A-------------------------------------------
select * from city
select * from village

select v.name from city c full join village v on c.cid=v.cid where c.cname='rajkot'
select c.cname ,v.name ,pincode from city c inner join village v on c.cid=v.cid
select  c.cname  from city c inner join village v on c.cid=v.cid group by v.cid,c.cname having  count(v.cid)>1
select c.cname from city c left outer join village v on c.cid=v.cid group by c.cname having count(v.cid)=0
select count(c.cname) from city c inner join village v on c.cid=v.cid group by v.cid
select  count(*) from (select c.cname,count(v.vid) as total from city c inner join village v on c.cid=v.cid group by c.cname having  count(v.vid)>1)as t where total>1
