select e.emp_no
from employees e
left join dept_manager d
on e.emp_no=d.emp_no
where d.dept_no is null;