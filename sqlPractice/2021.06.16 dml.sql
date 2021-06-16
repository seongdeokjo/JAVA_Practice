--2021.06.16


--dml
--테스트 테이블 생성 
create table dept01 
as
select * from dept where 1=0; --테이블 구조만 가져옴

--데이터 입력 : 행단위 입력 
-- insert into 테이블명 (컬럼명,....) values(데이터, 데이터,....) 
-- 입력하고자하는 컬럼과 입력데이터의 개수는 일
-- 컬럼의 도메인과 입력데이터의 타입이 일치
-- 기본키와 같이 not null 인 경우 컬럼을 생락하면 안됨

drop table dept01;

desc dept01;
select * from dept01;
-- 10번 부서 개발팀 서울 위치 
insert into dept01 (deptno,dname,loc) 
            values (10,'개발팀','서울')
;
insert into dept01 (deptno, dname,loc) 
            values ('삼십','대표','서울')
;
-- 데이터 저장할 컬럼기술을 생략 가능!
-- 모든 컬럼의 데이터를 입력할 때
-- values 절의 데이터의 순서 : 
--                      테이블이 생성될 때 정의된 컬럼의 순서 -> desc테이블
desc dept01;
insert into dept01 values (20,'마게팅','부산');

delete from dept01
where --conditions ;
