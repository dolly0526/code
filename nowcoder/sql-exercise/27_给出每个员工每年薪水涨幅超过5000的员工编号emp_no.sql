SELECT s2.emp_no, s2.from_date, (s2.salary - s1.salary) salary_growth
FROM salaries s1, salaries s2
WHERE s1.emp_no = s2.emp_no 
AND salary_growth > 5000
AND (
    strftime("%Y",s2.to_date) - strftime("%Y",s1.to_date) = 1 
    OR strftime("%Y",s2.from_date) - strftime("%Y",s1.from_date) = 1
)
ORDER BY salary_growth DESC;