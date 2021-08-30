select * from test1;
select * from date_t;

DELIMITER $$
DROP PROCEDURE IF EXISTS test$$
CREATE PROCEDURE test()
BEGIN
	DECLARE i INT DEFAULT 1;
	DECLARE log_date VARCHAR(255);	
	WHILE i <= 30 DO
		SET log_date = DATE_FORMAT(DATE_add(NOW(), INTERVAL i DAY), '%Y-%m-%d');
		INSERT INTO test1 (tdate) VALUES (log_date);
		SET i = i + 1;
	END WHILE;
END$$
call test();
DELIMITER $$

DELIMITER $$
DROP PROCEDURE IF EXISTS test1$$
CREATE PROCEDURE test1()
BEGIN
	DECLARE i INT DEFAULT 1;
	DECLARE log_date date;	
	WHILE i <= 30 DO
		SET log_date = DATE_add('2021-09-01', INTERVAL i DAY);
		INSERT INTO test1 (tdate) VALUES (log_date);
		SET i = i + 1;
	END WHILE;
END$$
call test1();
DELIMITER $$



commit;

 