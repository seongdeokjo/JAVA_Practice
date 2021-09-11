create table t (n int);
insert into t values(1);
insert into t select * from t;



create table date_t (d date, ds char(8), `week` CHAR(8),`week_y` CHAR(8), `week_yw` CHAR(8)
, PRIMARY KEY(d)); 
-- create table date_t (d date, ds char(8));

insert into date_t
select d, date_format(d, '%Y-%m-%d'),case weekday(d)
when '0' then '월요일'
when '1' then '화요일'
when '2' then '수요일'
when '3' then '목요일'
when '4' then '금요일'
when '5' then '토요일'
when '6' then '일요일'
end
,WEEK(d,1),
CONCAT(DATE_FORMAT(d,'%Y'),'-W',lpad(WEEK(d,1),'2','0'))
 from (
  select @rnum:=@rnum+1 as rownum, date(adddate('2021-08-27', interval @rnum day)) as d
  from (select @rnum:=-1) r, t
  ) t
where year(d) < 2031; 

select * from date_t;
select * from tour;


select  *
FROM date_t d left outer join test1 t
on d.d = t.tdate;

-- 


insert into test1 (tdate) values((select d from date_t));
commit;


select * from tour;
update tour set tcurrent=tcurrent-9 where tdate='2021-08-29';
insert into tour (tdate) values('2021-08-31');