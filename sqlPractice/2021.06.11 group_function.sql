--2021.06.11 
--그룹 함수 
--여러행을 묶어 처리하는 함수
--그룹함수의 결과는 1행 1열!
-- sum, avg, count, max, min

--사원 테이블에서
--1.사원의 수 
--2.사원의 급여 총합
--3.급여 평균
--4.최대 급여
--5.최소 급여
-- ***null 값은 출력되지 않는다.***
select count(*) as "사원의 수", 
        sum(sal) as "급여 총합",
        round(avg(sal),2) as "급여 평균",
        max(sal) as "최대 급여",
        min(sal) as "최소 급여",
        sum(comm) as "커미션의 총 합", -- 그룹함수는 null 값을 제외하고 연산!!!!
       round(avg(comm),2) as "커미션의 평균",
        count(comm) as "커미션 받는 사원의 수"
from emp;

--distinct를 이용해서 중복된 개수 제거 
select count(job)
from emp;

select count(distinct job) 
from emp;

select publisher
from book
order by publisher;

--마당서적 book 테이블에 납품하는 출판수의 수 
select count(distinct publisher) as "출판사 수"
from book;

select count(publisher),publisher
from book
group by publisher;

--특정 컬럼을 이용해서 그룹핑하기 -> group by
-- select
--from 테이블
--where 
--group by 그룹핑할 기준의 칼럼
select deptno
from emp
group by deptno;



