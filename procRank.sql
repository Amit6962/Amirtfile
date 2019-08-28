create or replace procedure getrank(ipid in int ,oprank out int)
is
begin
 select rank into getrank.oprank
 from customer
 where customer.cid=ipid;
 end getrank;
 /
 
 declare
 oprank int;
 begin
 getrank(104,oprank);
 dbms_output.put_line('rank='||oprank);
 end;
 /