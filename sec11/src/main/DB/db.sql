select * from MEMBER;

select * from board;

create table board (
	num number(5) primary key not null,
	pass varchar(30),
	name varchar(30),
	email varchar(30),
	title varchar(50),
	content varchar(1000),
	readcount number(4) default 0,
	writedate date default sysdate
);

create sequence board_seq start with 1 increment by 1;

insert into board values(board_seq.nextval,
'1234', '김자바', 'hong@abc.com', '게시글1번입니다.', '게시글1번 홍길동이 남김', 0, default);

insert into board values(board_seq.nextval,
'1235', '홍자바', 'hong@abc.com', '게시글2번입니다.', '게시글2번 홍자바가 남김', 0, default);

insert into board values(board_seq.nextval,
'1236', '홍박사', 'park@abc.com', '게시글3번입니다.', '게시글3번 홍박사가 남김', 0, default);


select * from board;