select * from test1;
select * from date_t;
select * from project.order;

DELIMITER $$
DROP PROCEDURE IF EXISTS test2$$
CREATE PROCEDURE test2()
BEGIN
	DECLARE i INT DEFAULT 1;
	DECLARE log_date date;	
	WHILE i <= 60 DO
		SET log_date = DATE_FORMAT(DATE_add(NOW(), INTERVAL i DAY), '%Y-%m-%d');
		INSERT INTO tour(tdate) VALUES (log_date);
		SET i = i + 1;
	END WHILE;
END$$

DELIMITER $$
call test2();









-- --------------------------- -
 -- DELIMITER $$
DROP PROCEDURE IF EXISTS test1$$
CREATE PROCEDURE test1()
BEGIN
	DECLARE i INT DEFAULT 1;
	DECLARE log_date date;	
	WHILE i <= 30 DO
		SET log_date = DATE_add('2021-09-01', INTERVAL i DAY);
		INSERT INTO tour (tdate) VALUES (log_date);
		SET i = i + 1;
	END WHILE;
END$$
call test1();
 -- DELIMITER $$



commit;

 