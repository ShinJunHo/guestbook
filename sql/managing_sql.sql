select * from guestbook;
insert into guestbook values(GUESTBOOK_SEQ.nextval,'Tester','1','테스트입니다.',SYSDATE);
commit;