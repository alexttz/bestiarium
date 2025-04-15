CREATE DATABASE fantasydb;

USE fantasydb;

CREATE TABLE Criatura (
    id_criatura INT AUTO_INCREMENT PRIMARY KEY,
    nome_criatura VARCHAR(50) NOT NULL,
    especie_criatura VARCHAR(20) NOT NULL,
    criatura_habitat VARCHAR(50) NOT NULL,
    criatura_poderes VARCHAR(100) NOT NULL
);

