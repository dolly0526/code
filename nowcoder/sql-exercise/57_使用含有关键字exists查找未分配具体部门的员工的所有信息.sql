SELECT *
FROM employees e
WHERE NOT EXISTS (
    SELECT emp_no
    FROM dept_emp de
    WHERE de.emp_no = e.emp_no
);