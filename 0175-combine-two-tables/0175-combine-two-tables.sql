# Write your MySQL query statement below
SELECT firstName,lastName,city,state
FROM Person as p
LEFT JOIN Address as a
On p.personId = a.personId;
