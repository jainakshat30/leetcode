# Write your MySQL query statement below
SELECT name AS Employee
FROM Employee e
WHERE Salary > (
    SELECT salary 
    FROM employee m
    WHERE m.id = e.managerID
)