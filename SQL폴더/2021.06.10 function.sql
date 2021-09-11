--2021.06.10 
-- function : 단잃행 함수, 집합(다중행)함수
-- 단일행 함수 : 하나의 행이 포함하는 특정 컬럼의 값, 하나를 처리하고 반환 
-- 다중행(집합) 함수:여러행의 특정 컬럼값들을 대상으로 연산하고 반환
--숫자함수
select abs(10), abs(-10)
from dual;

select floor(15.7)
from dual;

select round(15.198,2) , round(15.193,-1)
from dual;

select trunc(15.79,1) , trunc(15.79)
from dual;

select MOD(11,4)
from dual;


--사원들의 급여
select sal, mod(sal,2)
from emp
where mod(sal,2) = 1
;

--문자 함수
--concat(문자,문자) -> ''||''
select concat('abc','efg'), 'abc'||'efg'
from dual;

--substr : 문자열 추출
--substr(문자열,시작위치,길이)
select substr('apple',1,3)
from dual;

select substr('apple',-3)
from dual;

--replace : 특정 문자열(패턴) 다른 문자열 (패턴)으로 변경
select replace('jack and jue','j','**')
from dual;

-------------------------------------------------------------------------------------
--2021.06.11
-- 형변환 함수 
-- 날짜 -> 문자, 숫자 -> 문자
--to_char(날짜 데이터, '패턴'), to char(숫자,'패턴')
select sysdate
from dual ;
                    -- 년도   월 일  24시기준 : 분 : 초 
select to_char(sysdate,'yyyy.MM.DD. hh24:mi:ss' )
from dual;

select ename, hiredate, to_char(hiredate, 'yyyy.mm.dd')
from emp;

select * from orders;
select orderid, orderdate, to_char(orderdate,'yyyy.mm.dd')
from orders;

--숫자 -> 문자
select to_char(123456,'0,000,000,000'), to_char(123456,'L9,999,999,999')
from dual;

select empno, ename, sal, to_char(sal*1100,'L999,999,999')
from emp;

-- 문자 -> 숫자
--'1,000,000' + 100000
--to_number(문자열,패턴) 
select to_number('1,000,000', '9,999,999'),  to_number('1,000,000', '9,999,999') + 100000,  to_number('1,000,000', '9999999')
from dual;

--문자 -> 날짜
--to_date(문자열, 패턴)
select TO_DATE('2012.05.17', 'YYYY.MM.DD'), trunc((sysdate - to_date('2012.05.17','YYYY.MM.DD')) /365)
from dual;

--decode 함수 : 분기를 위해 사용 switch-case 유사
--decode(컬럼,= 조건1 값,저건 1의 참일때 사용할 값
--      ,조건2 값, 조곤2의 참일때 사용할 값
--      ,.....
--)
--emp 테이블에서 부서번호에 맞는 부설이름 출력 
select *from dept;
--10 ACCOUNTTing
-- 20 REASEARCH
--30 SALES
--40 POEATIONS
select ename, deptno, decode(deptno, 10, 'ACCOUNTING',
                                    20,'REASEARCH',
                                    30, 'SALES',
                                    40, 'OPEATIONS')
                                    as dname
from emp;

--직급에 따라 급여를 인상하도록 하자.
--직급이 'ANALYST' 인 사원은 5%,
--     'SALESMAN' 인 사원이은 10,
-- 'MANAGER' 인 사원은 15%,
--'CLERK' 인 사원은 20% 인상한다.
 --------------------------------------   
    select empno,ename,job,sal, decode(job,'ANALYST',sal*1.05, 
                            'SALESMAN' , sal * 1.05, 
                            'MANAGER' , sal * 1.1,
                            'CLERK' , sal *1.2                     
                            ) as upsal                      
from emp
order by job desc;

--case 함수도 분기할 때 사용 
--case when 조건식 then 참일때 값 
select ename, deptno, 
    case when deptno = 10 then 'ACCOUNTING'
         when deptno = 20 then 'REASEARCH'
         when deptno = 30 then 'SALES'
         when deptno = 40 then 'OPERATIONS'
        end as deptname        
from emp        
order by deptno desc;