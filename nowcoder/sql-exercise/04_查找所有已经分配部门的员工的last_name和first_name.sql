select e.last_name,e.first_name,d.dept_no
from employees e
inner join dept_emp d
on e.emp_no=d.emp_no;