--32. EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서 이름을 출력하시오.
select e.ename, d.deptno, d.dname
from emp e,dept d
where e.deptno = d.deptno and e.ename ='SCOTT';

--33. INNER JOIN과 ON 연산자를 사용하여 사원 이름과 함께 그 사원이 소속된 부서이름과 지역 명을 출력하시오.
select e.ename, d.dname, d.loc
from emp e inner join dept d
-- 만약 두테이블에 각각 조인을 정의한 컬럼의 이름이 동일하다면
--using 절에서 조인할 컬럼을 지정할 수 있다.
on e.deptno = d.deptno; --using (deptno)

--36. 조인과 WildCARD를 사용하여 
--이름에 ‘A’가 포함된 모든 사원의 이름과 부서명을 출력하시오.
--euqi join 사용 
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno and e.ename like '%A%'
order by d.dname, e.ename;
--37. JOIN을 이용하여 
--NEW YORK에 근무하는 
--모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.
select ename, e.job, d.deptno, d.dname
from emp e inner join dept d
on e.deptno = d.deptno
where d.loc = 'NEW YORK';

--38. SELF JOIN을 사용하여 
--사원의 이름 및 사원번호, 관리자 이름을 출력하시오.
select * from emp;
select employee.ename as "사원", employee.empno as "사원 번호", 
   employee.mgr as "관리자 번호" ,manager.ename as "관리자"
from emp employee, emp manager
where employee.mgr = manager.empno;

--39. OUTER JOIN, SELF JOIN을 사용하여 
--관리자가 없는 사원을 포함하여 
--사원번호를 기준으로 내림차순 정렬하여 출력하시오.
select e.ename as "사원", e.empno as "사원 번호", 
   e.mgr as "관리자 번호" ,m.ename as "관리자"
from emp e, emp m
where e.mgr = m.empno(+)
order by e.empno desc;
--------------------------------------------------
--40. SELF JOIN을 사용하여 
--지정한 사원의 이름, 부서번호, 지정한 사원과 
--동일한 부서에서 근무하는 사원을 출력하시오. ( SCOTT )
select * from emp;
select e.deptno,s.ename
from emp e, emp s
where e.deptno = s.deptno and e.ename = 'SCOTT'; 

--41. SELF JOIN을 사용하여 
--WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.
select * from emp where ename = 'WARD';

select --w.ename,w.hiredate,
e.ename,e.hiredate
from emp w, emp e
where w.hiredate = '81-02-22' and w.hiredate < e.hiredate 
order by e.hiredate;
--42. SELF JOIN 을 사용하여 
--관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 
--관리자의 이름 및 입사일과 함께 출력하시오.
select e.ename as "사원", e.hiredate as "사원의 입사일",m.ename as "관리자", m.hiredate as "관리자 입사일"
from emp e, emp m
where e.mgr = m.empno and m.hiredate > e.hiredate;

SELECT E.ENAME, E.HIREDATE, M.ENAME AS MGRNAME, M.HIREDATE AS MGRHIREDATE
FROM EMP E, EMP M
WHERE E.MGR = M.EMPNO AND E.HIREDATE < M.HIREDATE
ORDER BY E.HIREDATE;
