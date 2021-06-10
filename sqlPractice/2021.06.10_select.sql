

--2021.06.10 
--특정 데이터 검색 : 행 검색 -> 컬럼 선택 

--10번 부서의 사원 리스트를 출력 
-- 10번 부서 -> where dept = 10
select * 
from emp where deptno = 30;

--이름이 'SCOTT'인 사원을 출력 
select *
from emp 
where ename = 'SCOTT'
;

select *
from emp 
where ename = 'scott'
;

--날짜타입의 데이터 비교시에도 작은 따옴표를 이용해야한다.
select *
from emp 
where hiredate = '96/11/17'
;

--논리연산자 : and , or ,not
--10번 부서의 관리자(manager)를 찾아 출력
-- 사원번호,이름,직급만 출력  
select empno, ename, job
from emp
where deptno = 10 and job = 'MANAGER'
;

--10번 부서의 직원들과 관리자들의 리스트를 출력 
select *
from emp
where deptno = 10 or job = 'MANAGER'
;

--10번 부서의 직원을 제외한 나머지 직원들을 출력 
select *
from emp
--where deptno = 20 or deptno = 30 or deptno = 40
where not deptno = 10
;


--범위 연산을 할 때 -> 논리연산자 이용, between a and b 
--between a and b : a 이상 ~ b 이하 

--2000이상 3000이하의 급여를 받는 직원의 리스트
select ename, job, sal, sal * 1.2 as upsal
from emp
--where sal >= 2000 and sal <= 3000
where sal between 2000 and 3000
;
