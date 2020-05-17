SELECT e1.first_name
FROM employees AS e1
WHERE (
    SELECT COUNT(e2.first_name)
    FROM employees AS e2
    WHERE e1.first_name <= e2.first_name
) % 2 = 1;