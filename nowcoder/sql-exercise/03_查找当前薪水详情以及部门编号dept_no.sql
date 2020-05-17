select s.emp_no,s.salary,s.from_date,s.to_date,d.dept_no 
from salaries s
join dept_manager d
on s.emp_no=d.emp_no
where s.to_date='9999-01-01'
and d.to_date='9999-01-01';