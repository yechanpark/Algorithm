SELECT
    Name AS Customers
FROM
    Customers
WHERE
    Customers.Id NOT IN (
        SELECT
            CustomerId
        FROM
            Orders LEFT JOIN Customers
            ON Orders.CustomerId = Customers.Id
    );