delete from availTime;
select * from dayTest;
-- call test2();
select date_format(dt,'%h:%i:%s')TIMEONLY from availTime;
select day,count from availTime;

desc availTime;
select * from availTime where day = '2021-09-01';
alter  table availTime  drop constraint `my_checks` ;
alter table dayTest add constraint test1_ck check(count>12 and count<19 );
alter table availTime add constraint test_ck check(count>12 and count<19 );


insert into dayTest (count) values(19);




select (attotal - atcurrent) as cur , day, availTime
from dayTest left outer join availTime
on 1=1
-- where day = '2021-09-01'
order by day, aidx;




DELIMITER $$
DROP PROCEDURE IF EXISTS test3$$
CREATE PROCEDURE test3()
BEGIN
	DECLARE i INT DEFAULT 1;
    declare j int;
	DECLARE log_date date;
	
	WHILE (i <= 30) DO
		SET log_date = DATE_FORMAT(DATE_add(NOW(), INTERVAL i DAY), '%Y-%m-%d');
        set j = 13;
        while (j < 19) do
		INSERT INTO availTime(day,count) VALUES (log_date,j);
         set j = j + 1;
        end while;
        SET i = i + 1;
	END WHILE;
END$$

DELIMITER $$
call test3();

commit;