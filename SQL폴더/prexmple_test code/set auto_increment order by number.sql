set @count=0;
update test1 set tidx1=@count:=@count+1;

select * from test1;