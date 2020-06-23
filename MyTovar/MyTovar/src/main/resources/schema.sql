DROP TABLE IF EXISTS ORDERS;
CREATE TABLE ORDERS
(
order_id UUID PRIMARY KEY,
order_date VARCHAR(250),
order_name VARCHAR(250),
order_cost DOUBLE ,
amount INTEGER ,
customer_id UUID
);

CREATE TABLE CUSTOMERS
(
customer_id UUID PRIMARY KEY,
first_name VARCHAR(250),
last_name VARCHAR(250),
email VARCHAR(250),
address VARCHAR(250),
city VARCHAR(250)
);