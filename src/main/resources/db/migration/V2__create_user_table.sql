CREATE TABLE users (
                       user_id UUID PRIMARY KEY,
                       user_name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL
);

INSERT INTO users (user_id, user_name, email)VALUES ('1d50a51a-6a82-471e-be4e-2e4a757c5fd0', 'User 1', 'Xr5oB@example.com');
INSERT INTO users (user_id, user_name, email)VALUES ('34c6f442-d061-4925-b18e-84363741b1f6', 'User 2', 'Xr5oB@example.com');
INSERT INTO users (user_id, user_name, email)VALUES ('f9ccf6f8-b561-47f9-b4fb-52654f0f06a8', 'User 3', 'Xr5oB@example.com');
