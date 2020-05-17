SELECT c.name, COUNT(f.film_id)
FROM film_category fc
INNER JOIN film f
ON fc.film_id = f.film_id
INNER JOIN category c
ON fc.category_id = c.category_id
WHERE f.description LIKE '%robot%'
AND c.category_id IN (
    SELECT category_id
    FROM film_category
    GROUP BY category_id
    HAVING COUNT(film_id) >= 5
);