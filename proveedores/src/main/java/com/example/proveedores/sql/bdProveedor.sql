DROP DATABASE IF EXISTS bdProveedor;

CREATE DATABASE bdProveedor;

USE bdProveedor;

CREATE TABLE proveedor (
    id_Proveedor INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nombre VARCHAR(100) NULL,
    actividades VARCHAR(100) NULL,
    ciudad VARCHAR(100) NULL,
    direccion_Web VARCHAR(100) NULL,
    direccion VARCHAR(100) NULL,
    tipo_Moneda VARCHAR(100) NULL,
    telefono VARCHAR(100) NULL,
    email VARCHAR(100) NULL,
    PASSWORD VARCHAR(100) NULL
);

INSERT INTO proveedor VALUES(NULL,'Proveedor1' , 'Actividad' , 'Lima' , 'www.google.com','Lima chorrillos' , 'soles','987545632' ,'correo@gmail.com','123456')

SELECT * FROM proveedor;