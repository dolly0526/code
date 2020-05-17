SELECT de.dept_no, de.emp_no, s.salary
FROM dept_emp de
INNER JOIN salaries s
ON de.emp_no = s.emp_no
WHERE s.to_date = '9999-01-01'
AND de.to_date = '9999-01-01'
AND de.emp_no NOT IN (
    SELECT emp_no
    FROM dept_manager
    WHERE to_date = '9999-01-01'
);