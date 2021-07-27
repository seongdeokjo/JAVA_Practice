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

-- insert
insert into project.guestbook_message(guestname,password,message) values('jo','1234','hey body good morning');

-- update
update project.guestbook_message
set guestname = 'king', password ='1111', message ='bye body!'
where messageid = 1 
;

-- delete
delete from project.guestbook_message
where messageid = 1;

commit;

