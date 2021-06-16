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
insert into phoneinfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address) values(1,'홍길동','010-xxxx-yyyy-','h@naver.com','seoul') ;
insert into phoneinfo_basic values (2,'길동','010-xxxx-yyyx-','k@naver.com','busan',sysdate);
insert into phoneinfo_basic values (3,'강감찬','010-11xx-yyyx-','kg@naver.com','ulsan',sysdate);
--데이터 수정
update  phoneinfo_basic
set fr_name = '이순신'
where idx =2;
--데이터 삭제
delete from phoneinfo_basic
where fr_address = 'ulsan'
;

--2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
desc phoneInfo_univ;
select * from phoneInfo_univ;
--데이터 입력
insert into phoneinfo_univ(idx,fr_u_major,fr_u_year,fr_ref) values(1,'무술',2,1) ;
insert into phoneinfo_univ values (2,'무역',1,2);
insert into phoneinfo_univ values (3,'국어',3,3);

--데이터 수정
update phoneinfo_univ
set fr_u_major = '수학'
where fr_ref =(select idx from phoneInfo_basic where idx = 2);

update phoneinfo_univ
set (fr_u_year,fr_u_major) = (select fr_u_year,fr_u_major from phoneinfo_univ where idx = 1)
where idx = 3;

--데이터 삭제
delete from phoneinfo_univ
where idx = 3;

--3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
desc phoneInfo_com;
select * from phoneInfo_com;

--데이터 입력
insert into phoneinfo_com(idx,fr_c_company,fr_ref) values(1,'티맵',1) ;
insert into phoneinfo_com values (2,'신한',2);
insert into phoneinfo_com values (3,'카카오T',2);

--데이터 수정
update phoneinfo_com
set fr_c_company = '국민'
where idx = 4
;
--데이터 삭제
delete from phoneinfo_com
where idx =4;
--parent key not found 오류발생 
-- phoneinfo_basic 테이블에 데이터 idx에 4번이 없기 때문에 
update phoneinfo_com
set fr_ref = 4
where idx = 4
;

select  *
from phoneinfo_basic pb, phoneinfo_com pc,phoneinfo_univ pu
where pb.idx = pc.fr_ref  and pb.idx =pu.fr_ref;

--부모 테이블의 삭제는 자식 테이블 먼저 삭제후 수행
delete from phoneinfo_basic
where idx = 1;