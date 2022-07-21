SELECT COUNT(*) FROM film WHERE length > ( SELECT AVG(length) FROM film )

SELECT COUNT(*) FROM film WHERE rental_rate = ( SELECT MAX(rental_rate) FROM film )

SELECT title FROM film WHERE rental_rate = ( SELECT rental_rate FROM film WHERE MIN(rental_rate) ) AND replacement_cost = ( SELECT replacement_cost FROM film WHERE MIN(replacement_cost) )

SELECT COUNT(payment_id), (customer_id) FROM payment GROUP BY customer_id ORDER BY COUNT(payment_id) DESC
