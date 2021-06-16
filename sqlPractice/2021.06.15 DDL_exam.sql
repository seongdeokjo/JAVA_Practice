--2021.06.15 
--DDL exam
drop table phoneInfo_basic;
drop table phoneInfo_univ;
drop table phoneInfo_com;


create table phoneInfo_basic (
    idx number(6) constraint pIb_idx_pk primary key,
    fr_name varchar2(20) not null,
    fr_phoneNumber varchar2(20)  not null,
    fr_email varchar2(20) default '친구 이메일',
    fr_address varchar2(20) default '친구 주소',
    fr_regdate date default sysdate
);


create table phoneInfo_univ(
    idx number(6) constraint pIu_idx_pk primary key,
    fr_u_major varchar2(20) default 'n'  not null,
    fr_u_year number(1) default 1 not null
                constraint pIu_fr_u_year_ck check(0 < fr_u_year and fr_u_year < 5), --(fr_u_year between 1 and 4)
    fr_ref number(6)
          constraint pIu_fr_ref_fk references phoneInfo_basic (idx) not null 
);

create table phoneInfo_com (
    idx number(6) constraint pIc_idx_pk primary key,
    fr_c_company varchar2(20)  default 'n'  not null,
    fr_ref number(6) not null constraint pIc_fr_ref_fk references phoneInfo_basic (idx) 
);

