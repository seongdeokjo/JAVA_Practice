--2021 06.17
--index: 검색을 빠르게 하기위한 객체
--물리적인 저장 공간이 필요
--생성 시간이 필요
--많은 index는 dml 작업이 많은 경우 성능 저하가 온다. 

--emp01 테이블을 복사 -> 게속 복사
drop table emp01;

create table emp01
as
select * from emp
;

insert into emp01 select * from emp01;

insert into emp01 (empno,ename) values (7777,'KING');
insert into emp01 (empno,ename) values (7777,'SON');
select * from emp01 where ename ='KING';
select * from emp01 where ename = 'SON';

--emp01 테이블에 ename 컬럼을 index 설정 
create index index_emp01_ename 
on emp01(ename)
;


desc dept;
desc emp;

create or replace view emp_view2
as 
select e.ename,e.deptno,e.job,e.comm,e.hiredate,e.mgr,e.sal,d.loc,d.dname
from emp e, dept d
where e.deptno = d.deptno
order by deptno;

select * from emp_view2
where deptno = 30;

create or replace view emp_ttt
as
select *
from emp e natural join dept d;

desc emp_ttt;


