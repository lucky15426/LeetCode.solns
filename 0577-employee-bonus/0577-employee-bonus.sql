# Write your MySQL query statement below
SELECT name,bonus from Employee e
LEFT JOIN Bonus b
on e.empID=b.empId
WHERE bonus<1000 OR bonus is null;