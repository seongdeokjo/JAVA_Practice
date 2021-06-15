--2021.06.15 
--DDL exam
drop table phoneInfo_basic;
drop table phoneInfo_univ;
drop table phoneInfo_company;
create table phoneInfo_basic (
    idx number(6) constraint pIb_idx_pk primary key,
    fr_name varchar2(20) default '친구이름' constraint pIb_fr_name_nn not null,
    fr_phoneNumber varchar2(20) default '친구 전화번호' constraint pIb_fr_phoneNumber_nn not null,
    fr_email varchar2(20) default '친구 이메일',
    fr_address varchar2(20) default '친구 주소',
    fr_regdate date default sysdate
);


create table phoneInfo_univ(
    idx number(6) constraint pIu_idx_pk primary key,
    fr_u_major varchar2(20) default 'n' 
                constraint pIu_fr_u_major_nn not null,
    fr_u_year number(1) default 1
                constraint pIu_fr_u_year_nn not null
                constraint pIu_fr_u_year_ck check(0 < fr_u_year and fr_u_year < 5), 
    fr_ref number(6)
                    constraint pIu_fr_ref_fk references phoneInfo_basic (idx) not null 
);

create table phoneInfo_com (
    idx number(6) constraint pIc_idx_pk primary key,
    fr_c_company varchar2(20)  default 'n' constraint pIc_fr_c_company_nn not null,
    fr_ref number(6) constraint pIc_fr_ref_fk references phoneInfo_basic (idx) not null
);

desc phoneInfo_basic;
select * from phoneInfo_basic;

desc phoneInfo_univ;
select * from phoneInfo_univ;

desc phoneInfo_com;
select * from phoneInfo_com;


insert into phoneinfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address) values(900000,'홍길동','010-xxxx-yyyy-','h@naver.com','seoul') ;
insert into phoneinfo_basic(idx,fr_name,fr_phonenumber,fr_email,fr_address) values(900001,'길동','010-xxxx-yyyx-','k@naver.com','busan') ;
insert into phoneinfo_com(idx,fr_c_company,fr_ref) values(800000,'티맵',900000) ;
insert into phoneinfo_com(idx,fr_c_company,fr_ref) values(800001,'카카오맵',900001) ;
select  *
from phoneinfo_com pc, phoneinfo_basic pb
where pc.fr_ref = pb.idx and pc.fr_ref = 900001;