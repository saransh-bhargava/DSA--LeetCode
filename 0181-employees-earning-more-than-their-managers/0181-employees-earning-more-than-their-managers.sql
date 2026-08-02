# Write your MySQL query statement below
SELECT emp.name as Employee
FROM Employee as emp
JOIN Employee as mng
ON  emp.managerId = mng.id
WHERE emp.salary > mng.salary;