create table guestbook_message (
	messageid int not null auto_increment primary key,
    guestname varchar(20) not null,
    password varchar(20) not null,
    message text not null,
    regdate timestamp default current_timestamp
);

desc guestbook_message;

-- select 
select * from guestbook_message limit 0,3; -- limit index, count : 페이징 처리
select * from guestbook_message order by regdate desc;


