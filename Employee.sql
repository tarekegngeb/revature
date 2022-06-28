create table Employee(
ID int primary key,
emp_name varchar(25),
Address varchar(30),
email varchar(30),
salary int

);

select * from employee;
Alter table employee add column salary int;
insert into employee values(1, 'tare', '33 sunset','tare@gmail.com',50000);
insert into employee values(2,'sami', '46 robin','sami@gmail.com',60000);
insert into employee values(3,'Josh', '89 sunset','josh@gmail.com',55000);
insert into employee values(4,'hana', '98 jones','hana@gmail.com',70000);
insert into employee values(5,'hasset', '35 sunset','hasset@gmail.com',80000);

update employee set salary = 65000,emp_name = 'tarekegn' where id = 1;

delete from employee where emp_name = 'sami';
delete from employee where emp_name = 'Josh';

alter table employee add column country varchar(30);

drop table employee;


select emp_name, address from employee where id = 1;
