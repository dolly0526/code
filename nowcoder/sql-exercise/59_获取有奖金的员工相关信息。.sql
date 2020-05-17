SELECT e.emp_no, e.first_name, e.last_name, eb.btype, s.salary, (s.salary * eb.btype / 10.0) AS bonus
FROM employees AS e
INNER JOIN emp_bonus AS eb
ON e.emp_no = eb.emp_no
INNER JOIN salaries AS s
ON e.emp_no = s.emp_no
AND s.to_date = '9999-01-01';