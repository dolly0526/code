SELECT de.emp_no, dm.emp_no manager_no, s1.salary emp_salary, s2.salary manager_salary
FROM dept_emp de
INNER JOIN dept_manager dm
ON de.dept_no = dm.dept_no
INNER JOIN salaries s1
ON de.emp_no = s1.emp_no
INNER JOIN salaries s2
ON dm.emp_no = s2.emp_no
WHERE s1.salary > s2.salary
AND de.to_date = '9999-01-01'
AND dm.to_date = '9999-01-01'
AND s1.to_date = '9999-01-01'
AND s2.to_date = '9999-01-01';