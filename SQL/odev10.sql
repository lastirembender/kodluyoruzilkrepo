SELECT * FROM city LEFT JOIN country ON city.city_id = country.country_id;

SELECT payment.payment_id, customer.first_name, customer.last_name FROM customer RIGHT JOIN payment ON customer.customer_id = payment.customer_id;

SELECT rental.rental_id, customer.first_name, customer.last_name FROM rental FULL JOIN customer ON customer.customer_id = rental.customer_id;
