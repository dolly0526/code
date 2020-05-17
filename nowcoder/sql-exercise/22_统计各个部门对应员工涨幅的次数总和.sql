SELECT de.dept_no, d.dept_name, COUNT(s.salary) sum
FROM dept_emp de
INNER JOIN departments d
ON de.dept_no = d.dept_no
INNER JOIN salaries s
ON de.emp_no = s.emp_no
GROUP BY de.dept_no;