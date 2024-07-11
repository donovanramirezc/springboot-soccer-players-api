CREATE DATABASE FUTBOLISTASDB;

CREATE TABLE posicion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE futbolista (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    caracteristicas TEXT,
    posicion_id INT,
    FOREIGN KEY (posicion_id) REFERENCES posicion(id)
);

INSERT INTO posicion (nombre) VALUES ('Arquero'), ('Defensa'), ('Mediocampista'), ('Delantero');

INSERT INTO futbolista (nombre, apellidos, fecha_nacimiento, caracteristicas, posicion_id)
VALUES
    ('Kike', 'Mendoza', '1998-05-12', 'Goleador, juego aéreo', 4),
    ('Piero', 'Huamán', '1994-09-22', 'Velocidad, regate', 4),
    ('Juan Diego', 'Flores', '1999-03-15', 'Definición, inteligencia', 4),
    ('Lucho', 'Ramírez', '1989-11-07', 'Regate, pase', 3),
    ('Toño', 'Rodríguez', '1992-06-19', 'Reflejos, seguridad', 1),
    ('Carlitos', 'Gonzales', '1997-02-04', 'Creatividad, regate', 3),
    ('Gino', 'Quispe', '1990-12-30', 'Recuperación, marcaje', 3),
    ('Pepe', 'Díaz', '1995-07-11', 'Velocidad, fuerza', 2),
    ('Beto', 'Sánchez', '1988-01-18', 'Velocidad, regate', 4),
    ('Pancho', 'Castillo', '1996-08-25', 'Regate, disparo', 3),
	('Renzo', 'Acuña', '1993-03-08', 'Pase largo, control', 3),
    ('Miguel', 'Paredes', '1995-11-27', 'Defensa, liderazgo', 2),
    ('Adrián', 'Fuentes', '1991-02-13', 'Visión, técnica', 3),
    ('Sebastián', 'Montoya', '2000-04-22', 'Anticipación, fuerza', 2),
    ('Fabián', 'Navarro', '1998-09-30', 'Regate, velocidad', 4),
    ('Enzo', 'López', '1996-01-15', 'Juego aéreo, defensa', 2),
    ('Bruno', 'Torres', '1997-07-05', 'Resistencia, táctica', 3),
    ('Leo', 'Marín', '1999-12-12', 'Disparo, agilidad', 4),
    ('Javier', 'Rojas', '1992-10-10', 'Definición, visión', 4),
    ('Dani', 'Valdez', '1987-06-25', 'Cabezazo, fuerza', 3);

SELECT * FROM futbolista;
SELECT * FROM posicion;

