--게시판 만들기

DROP TABLE board;
DROP SEQUENCE board_seq;

create table board(
    num number primary key,           --게시판 넘버
    title varchar2(50) not null,      --제목
    writer varchar2(50) not null,     --작성자
    content varchar2(1000),           --내용
    regdate date,                     --시간
    CNT number default 0              --카운터
);

CREATE SEQUENCE board_seq
    start with 1        --시작 넘버
    increment by 1      --시작부터 하나씩 증가한다.
    maxvalue 99999      -- 이만큼 까지 증가한다.
    nocache             -- 캐쉬는 없다.
    nocycle             -- 사이클 없다.      
    noorder;            -- 오더는 없다.
    
    --nextval 계속 다음 값
    --currval 현재값 확인
    
select * from board;
commit;

- 삽입
INSERT INTO board(num, title, writer, content, regdate, CNT)
VALUES (board_seq.nextval, '제목1', '작성자1', '내용1', sysdate, 0);

- 조회
select 
    num, title, writer, content, regdate, CNT
from board;

- 수정  ex(제목, 이름)
UPDATE board set title = '제목수정', content='내용수정' where num = 1;

- 삭제
delete from board where num = 1;

















