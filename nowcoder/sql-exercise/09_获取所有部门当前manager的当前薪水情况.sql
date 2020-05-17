select d.dept_no,d.emp_no,s.salary
from dept_manager d
inner join salaries s
on d.emp_no=s.emp_no
where d.to_date='9999-01-01'
and s.to_date='9999-01-01';