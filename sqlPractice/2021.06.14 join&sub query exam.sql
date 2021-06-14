--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
select * from orders;
select * from customer;
select * from book;
select * from orders where custid =1;
--(5) 박지성이구매한도서의출판사수
select count(publisher)
from book b,orders o
where b.bookid = o.bookid and o.custid = 1
;

--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
select b.bookname, (b.price - o.saleprice) as "pricegap"
from orders o, book b
where o.custid =1 and b.bookid = o.bookid 
;


--(7) 박지성이구매하지않은 도서의이름
select  bookname
from book
where bookid not in (select bookid from orders where custid =1)
;

--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(8) 주문하지않은고객의이름(부속질의사용)
 
select name
from customer c
where not exists(select * from orders o where c.custid = o.custid );

--(9) 주문금액의총액과 주문의평균금액
-- 주문 금액의 총액
select sum(saleprice),avg(saleprice)
from orders;

--(10) 고객의이름과고객별구매액
select (select name from customer c where c.custid = o.custid ) as name ,sum(o.saleprice)
from orders o
group by o.custid;

--(11) 고객의이름과고객이구매한도서목록
--고객이름 customer custid = orders custid / name
-- 도서목록 book bookid = orders bookid / bookname
--구매 orders  
select c.name, b.bookname
from orders o, book b, customer c 
where o.custid = c.custid and o.bookid = b.bookid
order by c.name
;

--(12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
-- 가격차이가 가장많은 값
select max(b.price - o.saleprice)
from orders o, book b
where o.bookid = b.bookid ;

select * 
from orders o, book b
where o.bookid = b.bookid and b.price - o.saleprice = (select max(b1.price - o1.saleprice)
                                from orders o1, book b1
                                where o1.bookid = b1.bookid )
;
--(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
--도서의 판매 평균값
select avg(saleprice)
from orders; -- 11800
--고객별 구매 평균값
select avg(saleprice),custid
from orders
group by custid
having avg(saleprice) > (select avg(saleprice) from orders)
; --custid = 1,4 

select c.name, avg(saleprice)
from orders o , customer c
where o.custid = c.custid
group by c.name
having avg(saleprice) > (select avg(saleprice) from orders)
;

--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.

--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
--박지성이 구매한 bookid
select bookid
from orders
where custid = 1;

--bookid의 출판사
select publisher
from book 
where bookid in(select bookid from orders where custid = 1);

select c.name
from orders o, book b, customer c
where o.custid = c.custid and b.bookid = o.bookid and c.custid != 1 
and b.publisher in (select publisher
                    from book 
                    where bookid in(
                            select bookid 
                            from orders 
                            where custid = 1)
);

--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
--전체 출판사
select bookid,publisher
from book;
--고객이 구매한 출판사 -- 서로다른 2개 이상의 출판사를 구매한 고객의 custid = 1,2,3 
select b.publisher,o.custid
from orders o, book b
where o.bookid = b.bookid
;


