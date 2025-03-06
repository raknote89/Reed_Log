BEGIN TRANSACTION;

DROP TABLE IF EXISTS users, cases, reeds, reed_session, user_case, case_reed;

CREATE TABLE users (
	user_id SERIAL,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE cases (
    case_id SERIAL,
    case_name varchar(50),
    CONSTRAINT PK_cases PRIMARY KEY (case_id)
);

CREATE TABLE reeds (
    reed_id SERIAL PRIMARY KEY,
    strength DECIMAL(2,1),
    date_opened TIMESTAMP
    CONSTRAINT PK_reeds PRIMARY KEY (reed_id)

);

CREATE TABLE reed_session (
    session SERIAL PRIMARY KEY,
    reed_id int,
    date TIMESTAMP,
    time_played int,
    temperature int,
    humidity int,
    rating int,
    resistance int,
    notes varchar(250)
    CONSTRAINT PK_reed_session PRIMARY KEY (session_id),
    CONSTRAINT FK_reed_session_reeds FOREIGN KEY reed_id REFERENCES reeds(reed_id)

)



CREATE TABLE user_case (
    user_id int,
    case_id int,
    CONSTRAINT PK_user PRIMARY KEY (user_id),
    CONSTRAINT PK_case PRIMARY KEY (case_id),
    CONSTRAINT FK_user_user_case FOREIGN KEY user_id REFERENCES users(user_id),
    CONSTRAINT FK_cases_user_case FOREIGN KEY case_id REFERENCES cases(case_id)
);

CREATE TABLE case_reed (
    case_id int,
    reed_id int,
    CONSTRAINT PK_case PRIMARY KEY (case_id),
    CONSTRAINT PK_reed PRIMARY KEY (reed_id),
    CONSTRAINT FK_case_case_reed FOREIGN KEY case_id REFERENCES cases(case_id),
    CONSTRAINT FK_reed_case_reed FOREIGN KEY reed_id REFERENCES reeds(reed_id)
);

COMMIT TRANSACTION;
