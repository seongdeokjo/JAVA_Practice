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



set @count1 =0;
update test1 set tidx1=@count1:=count1+1;


 