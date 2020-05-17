SELECT curr.dept_no, curr.emp_no, curr.salary AS salary
FROM (
    SELECT d.dept_no,s.emp_no,s.salary
    FROM salaries s
    INNER JOIN dept_emp d
    ON d.emp_no=s.emp_no 
    WHERE d.to_date='9999-01-01'
    AND s.to_date='9999-01-01'
) curr
INNER JOIN (
    SELECT d.dept_no,MAX(s.salary) salary
    FROM salaries s
    INNER JOIN dept_emp d
    ON d.emp_no=s.emp_no 
    WHERE d.to_date='9999-01-01'
    AND s.to_date='9999-01-01'
    GROUP BY d.dept_no
) max 
WHERE curr.dept_no=max.dept_no
AND curr.salary=max.salary
ORDER BY curr.dept_no;