SELECT e.emp_no, (s1.salary - s2.salary) AS growth
FROM employees e
INNER JOIN salaries s1
ON e.emp_no = s1.emp_no
AND s1.to_date = '9999-01-01'
INNER JOIN salaries s2
ON e.emp_no = s2.emp_no
AND s2.from_date = e.hire_date
ORDER BY growth;