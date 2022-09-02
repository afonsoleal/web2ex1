-- Incluir aqui o script de carga DML e DDL do seu modelo de banco de dados.
DROP DATABASE IF EXISTS foo;
CREATE DATABASE foo;

CREATE TABLE users (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL DEFAULT '',
    PRIMARY KEY(id)
);