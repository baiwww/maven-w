-- noinspection SqlDialectInspectionForFile

create table cmfz_menu(
  id number(10) primary key,
  title varchar2(20) ,
  url varchar2(30),
  iconCls varchar2(30),
  parent_id number(10)
);

create sequence menu_seq;

drop sequence menu_seq;

drop table cmfz_menu;
--一级页面
insert into cmfz_menu values(menu_seq.nextval,'轮播图','null','null',null);
insert into cmfz_menu values(menu_seq.nextval,'吉祥妙音','null','null',null);
insert into cmfz_menu values(menu_seq.nextval,'甘露妙宝','null','null',null);
insert into cmfz_menu values(menu_seq.nextval,'功课记录','null','null',null);
insert into cmfz_menu values(menu_seq.nextval,'上师','null','null',null);
insert into cmfz_menu values(menu_seq.nextval,'用户','null','null',null);

--二级页面
insert into cmfz_menu values(menu_seq.nextval,'轮播图管理','null','null',1);

insert into cmfz_menu values(menu_seq.nextval,'吉祥妙音管理','null','null',2);

insert into cmfz_menu values(menu_seq.nextval,'甘露妙宝管理','null','null',3);

insert into cmfz_menu values(menu_seq.nextval,'功课记录管理','null','null',4);

insert into cmfz_menu values(menu_seq.nextval,'上师管理','null','null',5);

insert into cmfz_menu values(menu_seq.nextval,'用户管理','null','null',6);

select *from cmfz_menu;

select  c.id cid,c.title ctitle,c.url curl,c.iconCls ciconCls , cc.id ccid,cc.title cctitle,cc.url ccurl,cc.iconCls cciconCls ,cc.parent_id ccparent_id

from cmfz_menu c INNER JOIN cmfz_menu cc on c.id=cc.parent_id