CREATE OR REPLACE PROCEDURE incustomer
( ipid IN int, ipname IN varchar2,iprank IN int ) is
begin
INSERT INTO customer VALUES(ipid,ipname,iprank);
end;
/
exec incustomer(104,'ROHAN',66);