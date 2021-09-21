select bidx,midx,gidx,bcount,gname,gprice*bcount as gprice,gphoto 
from basket natural join goods ;

select * from basket;
delete from basket where bidx = 72;
update basket set bcount = 5 where gidx = 4 and midx = 2 and bidx=67;
-- 장바구니 목록
select bidx,midx,gidx,sum(bcount) as bcount,gname,gprice,gphoto from basket natural join goods where midx = 2 group by gidx order by gidx;
-- 총 금액 
select sum(bcount * gprice) as total from basket natural join goods where midx= 2;
-- 각 goods 별 총액
select sum(bcount * gprice) as total2 from basket natural join goods where midx=2 group by gidx;

delete from basket where midx=2;
-- 총 가격
select sum(bcount * gprice) from basket natural join goods group by midx;

insert into basket (bcount,midx,gidx) values(4,2,3);
select * from basket where gidx =2;
delete from basket where gidx =2 and bidx=82;
select * from basket;
delete from basket where gidx in(1,4) and midx = 2;

select * from goods;
insert into goods (gname,gprice,gphoto,gtext) values ('김부각',12100,'김부각','김부각입니다.');
insert into goods (gname,gprice,gphoto,gtext) values ('감귤칩',11000,'감귤칩','감귤칩입니다.');
insert into goods (gname,gprice,gphoto,gtext) values ('화투',8800,'화투','화투입니다.');
insert into goods (gname,gprice,gphoto,gtext) values ('맥주잔',5500,'맥주잔','맥주잔입니다.');

update goods set gphoto = 'glass' where gidx=4;

commit;
