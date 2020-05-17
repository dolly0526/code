select de.emp_no,dm.emp_no manager_no
from dept_emp de
left join dept_manager dm
on de.dept_no=dm.dept_no
where de.emp_no<>dm.emp_no
and de.to_date='9999-01-01'
and dm.to_date='9999-01-01';