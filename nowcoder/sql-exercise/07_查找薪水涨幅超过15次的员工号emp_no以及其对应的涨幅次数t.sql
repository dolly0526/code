select emp_no,count(emp_no) t
from salaries
group by emp_no
having t>15;