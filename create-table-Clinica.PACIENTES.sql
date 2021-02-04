CREATE TABLE `Clinica`.`PACIENTES` (
  `id_paciente` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(30)  NOT NULL,
  `apellido` VARCHAR(30)  NOT NULL,
  `fecha_nac` DATE  NOT NULL,
  `tpo_doc` ENUM('DNI' , 'LC' , 'LE' )  NOT NULL,
  `nro_doc` INTEGER UNSIGNED NOT NULL,
  `obra_social` VARCHAR(50)  NOT NULL,
  `sexo` ENUM ( 'F' , 'M' )  NOT NULL,
  `estavivo` BOOLEAN  NOT NULL,
  PRIMARY KEY (`id_paciente`)
)
ENGINE = InnoDB
CHARACTER SET utf8 COLLATE utf8_general_ci;
