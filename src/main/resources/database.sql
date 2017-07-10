-- table users
CREATE TABLE USERS (
  ID       INT          NOT NULL PRIMARY KEY,
  USERNAME VARCHAR(255) NOT NULL,
  password VARCHAR(255)
);

-- table roles
CREATE TABLE roles (
  id   INT NOT NULL PRIMARY KEY,
  name VARCHAR(100)
);

-- table for mapping users and roles
CREATE TABLE user_roles (
  user_id INT NOT NULL,
  role_id INT NOT NULL,

  FOREIGN KEY (user_id) REFERENCES USERS (ID),
  FOREIGN KEY (role_id) REFERENCES roles (id),

  UNIQUE (user_id, role_id)
)

-- Insert data
INSERT INTO USERS VALUES (1, 'Vasya', '1234');

INSERT INTO roles VALUES (1, 'ROLE_USER');
INSERT INTO roles VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_roles VALUES (1, 2);