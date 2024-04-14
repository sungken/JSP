create table Member (
  num number primary key,
  memberid varchar2(100) not null unique,
  memberpw varchar2(50) not null,
  nickname varchar2(10) unique,
  regdate date
);

create SEQUENCE member_seq 
    start with 1 
    increment by 1 
    maxvalue 99999 
    nocache 
    noorder 
    nocycle;
    
insert into Member 
    (num, memberid, memberpw, nickname, regdate)
values (member_seq.nextVal, 'tester1', '1234', 'nick1', sysdate);

insert into Member 
    (num, memberid, memberpw, nickname, regdate)
values (member_seq.nextVal, 'tester2', '1234', 'nick2', sysdate);

insert into Member 
    (num, memberid, memberpw, nickname, regdate)
values (member_seq.nextVal, 'tester3', '1234', 'nick3', sysdate);

commit;

select * from member;
















































