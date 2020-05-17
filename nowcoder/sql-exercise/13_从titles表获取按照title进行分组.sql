SELECT title,COUNT(title) t
FROM titles
GROUP BY title
HAVING t>=2;