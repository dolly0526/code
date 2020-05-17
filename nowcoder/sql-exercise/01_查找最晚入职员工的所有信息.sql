SELECT emp_no,birth_date,first_name,last_name,gender,hire_date
FROM employees
WHERE hire_date=(
    SELECT MAX(hire_date)
    FROM employees
);