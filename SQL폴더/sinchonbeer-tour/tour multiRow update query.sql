select * from tour;
update tour set tcurrent = 2 where tdate = '2021-09-21';
select (ttotal-tcurrent) from tour where tdate like date_format('2021%','%Y');

update tour set
	tcurrent =  case when tdate ='2021-09-02' then  +3 end, 
	tcurrent = case when tdate = '2021-09-03' then  -3 end 
where tdate in('2021-09-02','2021-09-03');
update tour set tcurrent = 6 where tdate = '2021-09-03';
 -- IF 이용

UPDATE tour SET tcurrent = CASE tdate
                          WHEN date_format('2021-09-04','%Y-%m-%d') THEN tcurrent+3 
                          WHEN '2021-09-03' THEN tcurrent-3          
                        END
             WHERE tdate IN (date_format('2021-09-04','%Y-%m-%d'),'2021-09-03');