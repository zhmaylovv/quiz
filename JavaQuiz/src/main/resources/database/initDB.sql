CREATE TABLE IF NOT EXISTS questions
(
    id    BIGSERIAL PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    text VARCHAR(500) NOT NULL ,
    variants json  NOT NULL,
    answer INTEGER NOT NULL,
    why VARCHAR(500) NOT NULL
);
