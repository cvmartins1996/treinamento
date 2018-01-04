/*https://www.tutorialspoint.com/execute_sql_online.php */
BEGIN TRANSACTION;

CREATE TABLE employees (
   employee_id   NUMERIC      NOT NULL,
   first_name    VARCHAR(255) NOT NULL,
   last_name     VARCHAR(255) NOT NULL,
   date_of_birth DATE                 ,
   phone_number  VARCHAR(255) NOT NULL,
   junk          CHAR(255)            ,
   CONSTRAINT employees_pk PRIMARY KEY (employee_id)
);

CREATE TABLE sales (
  sale_id       NUMERIC NOT NULL,
  employee_id   NUMERIC NOT NULL,
  subsidiary_id NUMERIC NOT NULL,
  sale_date     DATE   NOT NULL,
  eur_value     NUMERIC(17,2) NOT NULL,
  product_id    NUMERIC NOT NULL,
  quantity      NUMERIC NOT NULL,
  junk          CHAR(200),
  CONSTRAINT sales_pk     
     PRIMARY KEY (sale_id),
  CONSTRAINT sales_emp_fk 
     FOREIGN KEY          (subsidiary_id, employee_id)
      REFERENCES employees(subsidiary_id, employee_id)
);

.tables
COMMIT;

BEGIN TRANSACTION;

INSERT INTO employees(employee_id, first_name, last_name, phone_number) VALUES(1, "GIZELDA", "SOARES", "4564568456");
INSERT INTO employees(employee_id, first_name, last_name, phone_number, date_of_birth) VALUES(2, "BUDEGA", "JUNIOR", "456456821","12/12/1850");
INSERT INTO employees(employee_id, first_name, last_name, phone_number) VALUES(3, "Melo", "Wayne", "3458451254");
INSERT INTO employees(employee_id, first_name, last_name, phone_number) VALUES(4, "Viegas", "Devassa", "465456845212");
INSERT INTO employees(employee_id, first_name, last_name, phone_number) VALUES(5, "President", "Lyncon IO", "000100010001");
INSERT INTO employees(employee_id, first_name, last_name, phone_number) VALUES(6, "Green", "Always", "01546412388");
INSERT INTO employees(employee_id, first_name, last_name, phone_number, date_of_birth) VALUES(7, "Marina Ruy", "Barbosa", "7788777788", "08/06/1995");
INSERT INTO employees(employee_id, first_name, last_name, phone_number) VALUES(8, "Mariana", "Rios", "99985452521");
INSERT INTO employees(employee_id, first_name, last_name, phone_number, junk) VALUES(9, "Titi", "Muller", "1454564521", "Futura Esposa do Valdilanio");
INSERT INTO employees(employee_id, first_name, last_name, phone_number) VALUES(10, "Amorim", "Silverio", "4564568456");

SELECT * FROM employees;

SELECT employee_id FROM employees WHERE first_name = "Titi"; 

UPDATE employees SET last_name = "Barbosa", first_name = "Titi Muller" WHERE employee_id = 9;

SELECT * FROM employees;

SELECT employee_id FROM employees WHERE first_name LIKE "%Marina%" AND last_name LIKE "%Barbosa%";

UPDATE employees SET phone_number = "222222266666" WHERE employee_id = 7;

SELECT * FROM employees;

INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (1, (SELECT employee_id FROM employees WHERE employee_id = 4), 3, "2017-11-07", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (2, (SELECT employee_id FROM employees WHERE employee_id = 8), 4, "2017-06-08", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (3, (SELECT employee_id FROM employees WHERE employee_id = 7), 3, "2017-07-15", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (4, (SELECT employee_id FROM employees WHERE employee_id = 5), 2, "2017-12-21", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (5, (SELECT employee_id FROM employees WHERE employee_id = 3), 4, "2017-10-30", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (6, (SELECT employee_id FROM employees WHERE employee_id = 8), 2, "2017-07-05", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (7, (SELECT employee_id FROM employees WHERE employee_id = 7), 1, "2018-01-01", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (8, (SELECT employee_id FROM employees WHERE employee_id = 6), 1, "2018-01-02", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (9, (SELECT employee_id FROM employees WHERE employee_id = 2), 2, "2017-11-18", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (10, (SELECT employee_id FROM employees WHERE employee_id = 5), 3, "2017-12-18", 50.00, 4, 5);
INSERT INTO sales(sale_id, employee_id, subsidiary_id, sale_date, eur_value, product_id, quantity) VALUES (11, (SELECT employee_id FROM employees WHERE employee_id = 7), 4, "2017-07-12", 50.00, 4, 5);

SELECT * FROM sales;



COMMIT;

SELECT employee_id, first_name FROM employees;
SELECT * FROM employees;

SELECT sale_id, employee_id FROM sales;
SELECT * FROM sales;


SELECT sale_id FROM sales WHERE employee_id = 7;


SELECT * FROM sales WHERE  sale_date >= DATE('now','start of month','-3 month') ORDER BY DATE(sale_date) DESC;

.tables
/* Exibir os 3 vendedores com o maior número de vendas - DÚVIDA*/
SELECT * FROM sales WHERE sale_id in (SELECT employee_id FROM sales ORDER BY sale_id ASC LIMIT 3);

/* Exibir os 3 vendedores com o maior número de vendas dos ultimos 3 meses pendente*/
.tables
SELECT * FROM sales WHERE sale_id in (SELECT employee_id FROM sales LIMIT 3) AND sale_date >= DATE('now','start of month','-3 month') ORDER BY DATE(sale_date) DESC;