
--20221.06.09
--SQL Basic

-- 계정 HR이 보유한 테이블 객체 리스트
select * from tab;

--테이블의 정보를 검색 : 컬럼의 이름, null 유무, 타입, 사이즈

desc dept;
desc emp;

--데이터 조회를 위한 명령 : select
--select {컴럼명,....,*} from 테이블 이름 ; 

select * from emp;

--필요한 컴럼을 출력 
--select 컬럼명, 컬럼명(+,.........,) from 테이블 이름; 
SELECT empno,ename from emp;

--select 컬럼의 산술연산이 가능 : 컬럼과 숫자의 연산, 컬럼과 컬럼간의 산술 연산 가능 
--사원이름 , 월급여, 연봉 계산 결과값 (sal * 12)
select ename, sal, sal* 12 as ysal  
from emp
;

select sal,comm,sal * comm, sal * 12 as ysal  , sal/10 as bonus, sal - 100 as msal, sal + 1000 as rsal
from emp
;



