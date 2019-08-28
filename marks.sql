create or replace function divisionfun(marks in int) return varchar2 as
begin
  if(marks>=60) then return('first');
  elsif(marks>=50) then return('second');
  elsif(marks>=45) then return('third');
  else return('fail');
  end if;
  end;
  /
  declare
  val varchar(20);
  begin
  val:=divisionfun(45);
  dbms_output.put_line('division of 45: '||val);
  end;
  /