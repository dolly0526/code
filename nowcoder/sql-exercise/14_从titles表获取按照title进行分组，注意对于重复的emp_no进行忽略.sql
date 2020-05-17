SELECT title,COUNT(DISTINCT emp_no) t
FROM titles
GROUP BY title
HAVING t>=2;