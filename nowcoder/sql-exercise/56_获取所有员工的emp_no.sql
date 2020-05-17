SELECT em.emp_no, de.dept_no, eb.btype, eb.recevied
FROM employees AS em INNER JOIN dept_emp AS de
ON em.emp_no = de.emp_no
LEFT JOIN emp_bonus AS eb 
ON de.emp_no = eb.emp_no;