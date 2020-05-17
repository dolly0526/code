SELECT emp_no,birth_date,first_name,last_name,gender,hire_date
FROM employees 
WHERE hire_date=(
    SELECT hire_date
    FROM employees
    GROUP BY hire_date
    ORDER BY hire_date DESC 
    LIMIT 2,1
);