CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255),
    email VARCHAR(255)
);

INSERT INTO users (username, email) VALUES ('first', 'firstemail');
INSERT INTO users (username, email) VALUES ('second', 'secondemail');
--#ENDIF