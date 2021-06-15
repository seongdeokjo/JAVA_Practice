--2021.06.15

--DDL :데이터 정의어 

--테이블 생성 : create table
--테이블 수정 : alter table
--테이블 삭제 : drop table

--create table 
--        (컬럼이름 타입(사이즈) 제약조건 정의,
--        .......
--)

--create table 
--        (컬럼이름 타입(사이즈), -> 컬럼타입 정의 ,도메인 정의 
--        .......
--        제약조건 정의,
-- .      ......
--)

--사원 테이블과 유사한 구조의
-- 사원번호,사원이름,급여 3개의 칼럼으로 구성된
--EMP01 테이블을 생성해 보자.
drop table emp01;
create table emp01 (
        empno number(4), --사원번호
        ename varchar2(20), -- 사원이름
        sal number(6,2),
        job varchar2(9)
);


--서브쿼리를 이용해서 기존 테이블의 구조를 복사하고 해당 튜플도 복사
create table emp02
as
select * from emp;

select * from emp02;

create table emp03
as
select empno,ename,sal from emp
;
select * from emp03;

create table emp04
as
select * from emp where deptno = 30
;
select * from emp04;

create table emp05
as 
--주소만 복사
select * from emp where 1=2;


--테이블의 변경 alter table add 
--alter table {테이블 이름} add
--alter table {테이블 이름} modify
--alter table {테이블 이름} drop

--emp01 테이블의 job 컬럼의 사이즈를 수정 9->30
alter table emp01
modify(job varchar(130) not null)
;
--emp01 테이블블의 데이터 job 컬럼의 사이즈를 수정 =9->30
alter table emp01
modify(job varchar2(130) not null) 
;
desc emp01;

--emp01 : 테이블의 job 컬럼을 삭제 
alter table emp01
drop column job;

--테이블 삭제
drop table emp06;
drop table emp05;
drop table emp04;
drop table emp03;

select *from emp02;

--모든 행을 삭제하는 trucate : 롤백이 안된다.
TRUNCATE  table emp02;
select * from emp02;

--테이블의 이름변경 -> rename 현재 이름 새로운 이름
rename emp01 to test;
desc emp01;
desc test;

-- 테이블의 구조만 복사하기
create table emp02
as
select empno, ename,sal,job from emp where 1 = 0
;

drop table emp02;


-- 컬럼 레벨에서 제약사항 정의
create table emp02 (
    empno number(4) constraint emp02_empno_pk primary key, -- <- not null+unique,
    ename varchar2(20) constraint emp02_enmae_nn not null,
    sal number(6,2) constraint emp02_sal_ck check (sal > 500 and sal < 5000),
    job varchar(20) default '미지정', --옵션
    deptno number constraint emp02_deptno_fk references dept(deptno) --외래키 지정 
);

insert into emp02  values (null,null,10000,'MANAGER');
--job default 값 지정
insert into emp02 (empno,ename,sal) values (2000,'son',2000);

insert into emp02 (empno,ename,sal,job,deptno) 
            values (2000,'son',4000,'MANAGER',40);
            
desc emp02;
desc dept;
select * from emp02;
-------------------------------------------------------------------------------
--테이블 레벨에서 제약사항 정의
create table emp04 (
    empno number(4),
    ename varchar2(20) constraint emp04_ename_nn not null,
    sal number(6,2) constraint emp04_sal_ck check (sal > 500 and sal < 5000),
    job varchar(20),
    deptno number,
    constraint emp04_empno_pk primary key(empno),
    constraint emp04_deptno foreign key(deptno) references dept(deptno)
);
------------------------------------------------------------------------------
create table emp03 (
    empno number(4), -- constraint emp02_empno_pk primary key,   -- not null unique,
    ename varchar2(20) constraint emp03_ename_nn not null, -- not null 제약은 컬럼 레벨에서만 정의 가능
    sal number(6,2) constraint emp03_sal_ck check (sal > 500 and sal < 5000),
    job varchar(20), -- DEFAULT '미지정',
    deptno number, -- constraint emp02_deptno_fk REFERENCES dept(deptno),
    -------------------------------------------------------------------
    -- 제약 정의
    constraint emp03_empno_pk PRIMARY KEY (empno), -- PK 제약
    constraint emp03_deptno FOREIGN KEY (deptno) REFERENCES dept(deptno)
    );