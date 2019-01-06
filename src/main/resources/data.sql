INSERT INTO passport(id, passport_no)
VALUES (2001, 'pass_1');

INSERT INTO passport(id, passport_no)
VALUES (2002, 'pass_2');

INSERT INTO passport(id, passport_no)
VALUES (2003, 'pass_3');

INSERT INTO passport(id, passport_no)
VALUES (2004, 'pass_4');

INSERT INTO passport(id, passport_no)
VALUES (2005, 'pass_5');






INSERT INTO student(id, name, passport_id)
VALUES (1001, 'manushi', 2001);

INSERT INTO student(id, name, passport_id)
VALUES (1002, 'hasanka', 2002);

INSERT INTO student(id, name, passport_id)
VALUES (1003, 'anjy', 2003);





INSERT INTO course(id, course_name)
values (3001, 'maths');

INSERT INTO course(id, course_name)
values (3002, 'physics');

INSERT INTO course(id, course_name)
values (3003, 'chemistry');





INSERT INTO review(id, rating, description, course_id)
values (4001, 5, 'Excellent', 3001);

INSERT INTO review(id, rating, description, course_id)
values (4002, 4, 'Very Good', 3001);

INSERT INTO review(id, rating, description, course_id)
values (4003, 3, 'Good', 3001);

INSERT INTO review(id, rating, description, course_id)
values (4004, 5, 'Excellent', 3002);

INSERT INTO review(id, rating, description, course_id)
values (4005, 1, 'Bad', 3003);