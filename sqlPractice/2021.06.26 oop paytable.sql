select * from car;
select *  from member;
select * from rent;
select * from pay;

select r.rentcode, c.carnumber, c.carname, c.carsize, m.id, m.name, m.carreg, r.pay,r.rentperiod,r.rent_date from car c, member m, rent r where c.carcode = r.carcode and m.membercode = r.membercode and m.id = 'member';

create sequence pay_paycode_seq
start with 1
increment by 1;

create table pay(
paycode number(4) constraint pay_paycode_pk primary key,
paymoney number(8) constraint pay_paymoney_ck check(paymoney= 10000 or paymoney=20000 or paymoney=30000), --결제 금액을 제약 조건으로 (소,중,대)
carsize varchar2(10) not null
);

insert into pay values(pay_paycode_seq.nextval, 10000,'small');
insert into pay values(pay_paycode_seq.nextval, 20000,'middle');
insert into pay values(pay_paycode_seq.nextval, 30000,'big');








commit;