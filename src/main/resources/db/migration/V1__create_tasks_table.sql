CREATE TABLE tasks (
                       id UUID NOT NULL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       description VARCHAR(255) NOT NULL
);

INSERT INTO tasks (id, title, description)VALUES ('30000a53-d42e-486e-8f2f-bcffd8108978', 'Task 1', 'Description 1');
INSERT INTO tasks (id, title, description)VALUES ('928458c1-d549-4562-8746-b1f35076957e', 'Task 2', 'Description 2');
INSERT INTO tasks (id, title, description)VALUES ('6c46b240-83fc-40cc-8dca-4744a1a5af0f', 'Task 3', 'Description 3');