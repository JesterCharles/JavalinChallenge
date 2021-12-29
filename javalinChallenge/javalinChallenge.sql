-- Create a challenge employee table
create table challenge_employees(
	e_id serial primary key,
	e_fname varchar(40),
	e_lname varchar(40),
	e_role varchar(40),
	e_age int
);

insert into challenge_employees
values
(default, 'charles', 'jester', 'Trainer', 28),
(default, 'patrick', 'orwin', 'Associate', 20),
(default, 'reginald', 'leandre', 'Associate', 18),
(default, 'agustin', 'guzman', 'Associate', 21),
(default, 'felix', 'chukwu', 'Associate', 32),
(default, 'tyler', 'hodge', 'Associate', 87),
(default, 'ben', 'petruzziello', 'Trainer', 103),
(default, 'kevin', 'olegario', 'Associate', 47),
(default, 'archana', 'patil', 'Associate', 35),
(default, 'payton', 'dull', 'Associate', 32),
(default, 'daniel', 'stoia', 'Associate', 19),
(default, 'keyonna', 'sims', 'Associate', 19),
(default, 'hassan', 'mohammad', 'Associate', 16);

select * from challenge_employees;