-- Inicialización de la base de datos

-- Roles
INSERT INTO authority (id,authority) VALUES (default,'CAPACITACIONES');
INSERT INTO authority (id,authority) VALUES (default,'SUPERVISOR');
INSERT INTO authority (id,authority) VALUES (default,'COORDINADOR');
INSERT INTO authority (id,authority) VALUES (default,'COLABORADOR');

-- Usuarios
INSERT INTO usuario (user,password) VALUES ('capacitaciones','$2a$04$uMLqnv8AOvwv2VbjG40Op.O1pzl5JgORsBBYeN6CxPQR63HxkBvAG');
INSERT INTO usuario (user,password) VALUES ('supervisor','$2a$04$uMLqnv8AOvwv2VbjG40Op.O1pzl5JgORsBBYeN6CxPQR63HxkBvAG');
INSERT INTO usuario (user,password) VALUES ('coordinador','$2a$04$uMLqnv8AOvwv2VbjG40Op.O1pzl5JgORsBBYeN6CxPQR63HxkBvAG');
INSERT INTO usuario (user,password) VALUES ('colaborador','$2a$04$uMLqnv8AOvwv2VbjG40Op.O1pzl5JgORsBBYeN6CxPQR63HxkBvAG');

-- Asignación de roles a usuarios
INSERT INTO authorities_users VALUES ('capacitaciones',(SELECT id FROM authority WHERE authority='CAPACITACIONES'));
INSERT INTO authorities_users VALUES ('supervisor',(SELECT id FROM authority WHERE authority='SUPERVISOR'));
INSERT INTO authorities_users VALUES ('coordinador',(SELECT id FROM authority WHERE authority='COORDINADOR'));
INSERT INTO authorities_users VALUES ('colaborador',(SELECT id FROM authority WHERE authority='COLABORADOR'));

--Colaboradores
INSERT INTO colaborador (nombre,apellidos,genero) VALUES ('Lara','Sanchez','F');