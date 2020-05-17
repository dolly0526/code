SELECT de.dept_no, d.dept_name, t.title, COUNT(t.emp_no) count
FROM dept_emp de
INNER JOIN departments d
ON de.dept_no = d.dept_no
INNER JOIN titles t
ON de.emp_no = t.emp_no
WHERE de.to_date = '9999-01-01'
AND t.to_date = '9999-01-01'
GROUP BY d.dept_no, t.title;