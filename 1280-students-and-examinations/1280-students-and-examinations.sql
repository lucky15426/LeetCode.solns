# Write your MySQL query statement below
SELECT a.student_id,a.student_name,b.subject_name,COUNT(c.subject_name)as attended_exams 
from Students a
JOIN Subjects b
LEFT JOIN Examinations c 
on a.student_id = c.student_id 
AND b.subject_name = c.subject_name 
Group by a.student_id,a.student_name,b.subject_name
ORDER BY a.student_id,a.student_name,b.subject_name;