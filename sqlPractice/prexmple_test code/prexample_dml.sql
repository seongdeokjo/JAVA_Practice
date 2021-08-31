-- member table
insert into member (memail,mname,mpw,mphone) values('member1','test','1234','010-0000-0001');
insert into member (memail,mname,mpw,mphone) values('member2','minsu','1234','010-0000-0002');

-- goods table
insert into goods (gname,gprice,gtext) values('gim',10000,'김으로 만든 김');
insert into goods (gname,gprice,gtext) values('bu',5000,'뿌뿌뿌뿌~');
insert into goods (gname,gprice,gtext) values('gak',12000,'그락각각');
insert into goods (gname,gprice,gtext) values('pam',20000,'김부각 팔아요');

-- basket
insert into basket (bcount,midx,gidx) values(1,1,1);
insert into basket (bcount,midx,gidx) values(2,1,2); 
insert into basket (bcount,midx,gidx) values(3,2,3); 

-- address 
insert into address (address,midx) values('seoul',1);
insert into address (address,midx) values('incheon',1);
insert into address (address,midx) values('daejeon',2);
insert into address (address,midx) values('busan',2);

-- tour 
insert into tour (tdate) values('2021-08-20');
insert into tour (tdate) values('2021-08-21');
insert into tour (tdate) values('2021-08-22');
insert into tour (tdate) values('2021-08-23');
insert into tour (tdate) values('2021-08-24');
insert into tour (tdate) values('2021-08-25');
insert into tour (tdate) values('2021-08-26');
insert into tour (tdate) values('2021-08-27');
insert into tour (tdate) values('2021-08-28');
insert into tour (tdate) values('2021-09-01');

select * from tour;



-- order(상품)
insert into prexample.order(ocategory,oprice,midx,aidx) 
values('goods',
(select sum(bcount * gprice) as total
from basket natural join member natural join goods
where memail='member1'),
(select distinct midx
from basket natural join member natural join goods
where memail='member1'),
(select aidx
from address natural join member
where memail='member1' and address='seoul')
);

-- 장바구니에 담겨있는 정보를 조회하는 select문 
select * 
from basket natural join member natural join goods; 

select distinct midx
from basket natural join member natural join goods
where memail='member1'; 

-- 상품 구매를 위한 장바구니에 담겨있는 회원이 구매할 품목의 총 가격을 가져오는 select  
select sum(bcount * gprice) as total, memail
from basket natural join member natural join goods
where memail='member1'; 

-- 회원이 주문을 위한 주소를 선택하는 select문
select aidx
from address natural join member
where memail='member1' and address='seoul';

-- 결제 총 가격 
select oprice
from prexample.order
where (select midx from member where memail='member1');
-- 멤버 아이디로 주문 번호 가져오기
select oidx
from prexample.order natural join member 
where memail='member1';

-- order(투어) 날짜 2021-08-25 인원:3
insert into prexample.order(ocategory,oprice,tidx,midx,aidx)
values('tour',
(select 3*(select tprice from tour where tdate='2021-08-25')),
(select tidx from tour where tdate='2021-08-25'),
(select midx from member where memail='member1'),
(select aidx 
	from address natural join member
	where memail='member1' and address='seoul')
);

-- 주문을 위한 선택된 날짜, 인원 으로 총가격 구하기
select 3* tprice from tour where tdate='2021-08-25';

-- 투어 번호 구하기 : 날짜 이용
select tidx from tour where tdate='2021-08-25';

-- 결제 
insert into payment(pprice,pway,pstatus,oidx)
values(
(select oprice 
from prexample.order natural join member 
where ocategory='tour' and memail='member1'),
'card',
'before',
(select oidx 
from prexample.order natural join member 
where ocategory='tour' and memail='member1')
);

-- 주문 테이블에서 투어의 총 가격 가져오기
select oprice from prexample.order natural join member where ocategory='tour' and memail='member1';

-- 주문 테이블에서 주문 번호 가져오기
select oidx 
from prexample.order natural join member 
where ocategory='tour' and memail='member1';

-- 결제 완료
update payment natural join prexample.order 
set pstatus='complete' 
where midx=(
			select midx 
            from member 
            where memail='member1'
);

-- 결제 상태 before->complete 변경 시 현재 인원 증가
update tour set tcurrent = +3 where tdate='2021-08-25';

-- 예약 가능한 인원 표시
select (ttotal - tcurrent) as available
from tour
where tdate = '2021-08-25';

update tour set tcurrent = +12 where tdate='2021-08-27';


-- review 
insert into review(rtitle,rtext,rphoto,rrate,rcategory,pidx)
values(
'리뷰1',
'투어 맥주 마시기 개꿀띠',
'reviewph0to.jpg',
3.7,
'tour',
(select pidx from payment where pstatus='complete')
);

-- 리뷰 작성을 위한 결제 정보 가져오기
select pidx 
from payment 
where pstatus='complete' and 
oidx = (select oidx from prexample.order natural join member where memail='member1' and ocategory='tour');

select pidx as 결제번호,pprice,pway,pstatus,pdate
from payment natural join prexample.order;

select * from member natural join prexample.order;

-- 
select oidx from prexample.order where ocategory='tour'and midx=(select midx from member where memail='member1');

-- select 
select * from member;
select * from goods;
select * from basket;
select * from address;
select * from tour;
select * from prexample.order;
select * from payment;

desc review;
desc tour;
commit;