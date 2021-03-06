--20210618

--jdbc

select * from dept01;

insert into dept01 values (DEPT01_DEPTNO_SEQ.nextval, 'dev','seoul');

--dept01 deptno에 입력할 일련 번호 -> sequence
create sequence dept01_deptno_seq
start with 50
increment by 10
;

commit;

delete from dept01 where deptno = ?;

update dept01 set dname =?, loc = ? where deptno =?
;
select * from dept;

select dept01_deptno_seq.nextval from dual;