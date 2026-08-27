# Write your MySQL query statement below
select customer_id ,Count(*)as count_no_trans
from Visits v
where visit_id Not in (select distinct visit_id from Transactions )
Group by customer_id;
