--- QESTION 7 ----

-----   PART A

select 30*5 
select abs(-25),abs(25),abs(-50),abs(50)
select  ceiling (25.2), ceiling (25.7), ceiling (-25.2)
select FLOOR (25.2),FLOOR(25.7),FLOOR(-25.2)
select (5%2),(5%3)
select POWER(3,2),POWER(4,3)
select SQRT(25),SQRT(30),SQRT(50)
select SQUARE(5),SQUARE(15),SQUARE(25)
select PI()
select ROUND(157.732,2),ROUND(157.732,0),ROUND(157.732,-2)
select EXP(2),EXP(3)
SELECT LOG10(5) ,LOG10(100) 
SELECT SIN(-25) ,SIN(0) ,SIN(25) 
SELECT SIGN(-25) ,SIGN(0) ,SIGN(25) 
SELECT RAND(1) 

----- PART B -----------


CREATE TABLE Employee
(EMPNO INT,
EMPNAME VARCHAR(30),
JOININGDATE DATETIME,
SALARY DECIMAL(8,2),
COMMISSION INT,
CITY VARCHAR(30))

INSERT INTO Employee
VALUES
(101, 'Keyur', '5-Jan-02', '12000.00', 4500, 'Rajkot'),
(102, 'Hardik', '15-Feb-04', '14000.00', 2500, 'Ahmedabad'),
(103, 'Kajal', '14-Mar-06', '15000.00', 3000, 'Baroda'),
(104, 'Bhoomi', '23-Jun-05', '12500.00', 1000, 'Ahmedabad'),
(102, 'Harmit', '15-Feb-04', '14000.00', 2000, 'Rajkot')

SELECT (SALARY+COMMISSION) FROM Employee
SELECT CEILING(55.2) ,CEILING(35.7) ,CEILING(-55.2) 
SELECT FLOOR(55.2) ,FLOOR(35.7) ,FLOOR(-55.2) 
SELECT (55%2) ,(55%3) 
SELECT POWER(23,2) ,POWER(14,3) 

--Part C:
SELECT SQRT(36) ,SQRT(49) ,SQRT(81) 
SELECT SQUARE(3) ,SQUARE(9) ,SQUARE(12) 
SELECT ROUND(280.8952,2) ,ROUND(280.8952,0) ,ROUND(280.8952,-2) 
SELECT SIN(4.2014) ,COS(4.2014) , TAN(4.2014) 
SELECT SIGN(-55),SIGN(0) ,SIGN(95) 


