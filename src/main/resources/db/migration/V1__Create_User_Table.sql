CREATE TABLE account (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    email VARCHAR(255)
);

INSERT INTO account (first_name, email) VALUES ('first', 'firstemail');
INSERT INTO account (first_name, email) VALUES ('second', 'secondemail');
--#ENDIF