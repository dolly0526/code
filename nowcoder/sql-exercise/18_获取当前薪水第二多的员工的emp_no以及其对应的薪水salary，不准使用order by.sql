SELECT s.emp_no, s.salary, e.last_name, e.first_name
FROM employees e
INNER JOIN salaries s
ON e.emp_no = s.emp_no
WHERE s.to_date = '9999-01-01'
AND s.salary = (
    SELECT MAX(salary)
    FROM salaries
    WHERE salary <> (
        SELECT MAX(salary)
        FROM salaries
        WHERE to_date = '9999-01-01'
    ) AND to_date = '9999-01-01'
);