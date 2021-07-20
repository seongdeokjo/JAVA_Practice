
insert into member values(
	1,"test","1234","son"
);
insert into member (memberId,memberPw,memberName) values("test2","1234","son");
insert into member (memberId,memberPw,memberName) values("test3","1234","lee");
insert into member (memberId,memberPw,memberName) values("test4","1234","park");

select * from member;

commit;