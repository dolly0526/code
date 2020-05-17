SELECT e.last_name, e.first_name, t.dept_name
FROM employees e
LEFT JOIN (
    SELECT d.dept_name,de.emp_no
    FROM dept_emp de
    LEFT JOIN departments d
    ON d.dept_no = de.dept_no
) t
ON e.emp_no = t.emp_no;
