SELECT s1.emp_no, s1.salary, COUNT(DISTINCT s2.salary) rank
FROM salaries s1, salaries s2
WHERE s1.salary <= s2.salary
AND s1.to_date = '9999-01-01'
AND s2.to_date = '9999-01-01'
GROUP BY s1.emp_no
ORDER BY s1.salary DESC, s1.emp_no;