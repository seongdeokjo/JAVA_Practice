--2021.06.16
--dml exam
--insert : C reate
--select : R ead
--update : U pdate
--delete : D elete


--앞에서 생성한 전화번호부 테이블을 기준으로 DML 을 작성해봅시다.
--1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
desc phoneInfo_basic;

select * from phoneInfo_basic;
--데이터 입력
insert into phoneinfo_basic values(1,'king','010-xxxx-yyyy','king@naver.com','korea',sysdate) ;
insert into phoneinfo_basic (idx,fr_name,fr_phonenumber) values (2,'scott','010-0000-xxxx');


--데이터 수정
update  phoneinfo_basic
set fr_email = 'scott@naver.com',fr_address = '서울'
where idx =2-- fr_name = 'SCOTT'
;
--데이터 삭제
delete from phoneinfo_basic
where idx =1
;

--2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
desc phoneInfo_univ;
select * from phoneInfo_univ;
--데이터 입력
insert into phoneinfo_basic values(3,'son','010-1111-1111','son@gmail.com','korea',sysdate) ;
insert into phoneinfo_univ values(PI_U_IDX_PK.nextval,'computer',4,PI_IDX_PK.currval) 
;
-- SELECT : READ   데이터 검색
select fr_name, pu.fr_u_major, pu.fr_u_year
from phoneinfo_basic pb , phoneinfo_univ pu
where pb.idx=pu.fr_ref
;

--데이터 수정
update phoneinfo_univ
set fr_u_major = 'kor',fr_u_year = 1
where idx = 1
;


--데이터 삭제
delete from phoneinfo_univ
where idx = 3;

--3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
desc phoneInfo_com;
select * from phoneInfo_com;

-- INSERT : CREATE
insert into phoneinfo_basic
values (pi_idx_pk.nextval, 'PARK', '010-7777-7777', 'park@gmail.com', 'LONDON', sysdate)
;
insert into phoneinfo_com values (2, 'NAVER', pi_idx_pk.currval);

-- SELECT : READ
select fr_name, pb.fr_phonenumber, pb.fr_email, pb.fr_address, pc.fr_c_company
from phoneinfo_basic pb , phoneinfo_com pc
where pb.idx=pc.fr_ref
;

-- UPDATE : UPDATE
-- 회사정보를 수정
update phoneinfo_com
set fr_c_company='GOOGLE'
where idx=1
;

-- DELETE : DELETE
delete from phoneinfo_com
where idx=1
;
delete from phoneinfo_basic
where idx=4
;

-- 전체 친구 정보
select *
from phoneinfo_basic pb , phoneinfo_univ pu, phoneinfo_com pc
where pb.idx=pu.fr_ref(+) and pb.idx=pc.fr_ref(+)
;

--대학친구, 회사 친구 테이블 -> 기본키(대리키) -> sequnece 생성 -> insert 개선

--sequence : 번호 생성기 
create sequence pi_idx_pk;
create sequence pi_u_idx_pk start with 5 increment by 1;
create sequence pi_c_idx_pk start with 5 increment by 1;
--sequence 삭제 
drop sequence  pi_u_idx_pk;
drop sequence  pi_c_idx_pk;

--부모 테이블의 삭제는 자식 테이블 먼저 삭제후 수행
delete from phoneinfo_basic
where idx = 1;