BEGIN TRANSACTION;

DROP TABLE IF EXISTS users, cases, reeds, reed_session, user_case, case_reed, weather;

-- Users Table
CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    username varchar(50) NOT NULL UNIQUE,
    password_hash varchar(200) NOT NULL
);

-- Cases Table
CREATE TABLE cases (
    case_id SERIAL PRIMARY KEY,
    case_name varchar(50)
);

-- Reeds Table
CREATE TABLE reeds (
    reed_id SERIAL PRIMARY KEY,
    strength DECIMAL(2,1),
    date_opened TIMESTAMP
);

-- Reed Session Table
CREATE TABLE reed_session (
    session_id SERIAL PRIMARY KEY,
    reed_id int,
    date TIMESTAMP,
    time_played int,
    temperature int,
    humidity int,
    rating int,
    resistance int,
    notes varchar(250),
    CONSTRAINT FK_reed_session_reeds FOREIGN KEY (reed_id) REFERENCES reeds(reed_id)
);

-- User Case Table
CREATE TABLE user_case (
    user_id int,
    case_id int,
    CONSTRAINT PK_user_case PRIMARY KEY (user_id, case_id),
    CONSTRAINT FK_user_user_case FOREIGN KEY (user_id) REFERENCES users(user_id),
    CONSTRAINT FK_cases_user_case FOREIGN KEY (case_id) REFERENCES cases(case_id)
);

-- Case Reed Table
CREATE TABLE case_reed (
    case_id int,
    reed_id int,
    CONSTRAINT PK_case_reed PRIMARY KEY (case_id, reed_id),
    CONSTRAINT FK_case_case_reed FOREIGN KEY (case_id) REFERENCES cases(case_id),
    CONSTRAINT FK_reed_case_reed FOREIGN KEY (reed_id) REFERENCES reeds(reed_id)
);

-- Weather Table
CREATE TABLE weather (
    weather_id SERIAL,
    date TIMESTAMP PRIMARY KEY,
    temperature_fahrenheit int,
    temperature_celsius int,
    humidity int,
    air_pressure int
);

COMMIT TRANSACTION;