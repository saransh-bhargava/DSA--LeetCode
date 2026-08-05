# Write your MySQL query statement below

SELECT MAX(num) as num
FROM (SELECT num as num
    FROM MyNumbers 
    GROUP BY num
    HAVING count(*) = 1
        ) as sub;


