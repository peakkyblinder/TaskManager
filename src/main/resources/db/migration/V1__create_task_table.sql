CREATE TABLE tasks
(
    id          UUID         NOT NULL PRIMARY KEY,
    title       VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL
);

INSERT INTO tasks (id, title, description) VALUES (gen_random_uuid(), 'Task 1', 'Description 1');
INSERT INTO tasks (id, title, description) VALUES (gen_random_uuid(), 'Task 2', 'Description 2');
INSERT INTO tasks (id, title, description) VALUES (gen_random_uuid(), 'Task 3', 'Description 3');

