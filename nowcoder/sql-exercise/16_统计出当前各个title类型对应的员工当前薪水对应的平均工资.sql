SELECT t.title, AVG(s.salary) avg
FROM salaries s
INNER JOIN titles t
ON s.emp_no = t.emp_no
WHERE s.to_date = '9999-01-01'
AND t.to_date = '9999-01-01'
GROUP BY t.title;