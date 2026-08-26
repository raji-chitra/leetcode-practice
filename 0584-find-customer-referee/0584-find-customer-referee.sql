# Write your MySQL query statement below
select c.name from Customer c  LEFT JOIN Customer m on c.referee_id=m.id where c.referee_id!=2
OR c.referee_id is NULL;