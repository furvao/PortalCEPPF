-- MySQL Script generated by MySQL Workbench
-- 03/20/17 14:28:00
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema portalceppf
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema portalceppf
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `portalceppf` DEFAULT CHARACTER SET utf8 ;
USE `portalceppf` ;

-- -----------------------------------------------------
-- Table `portalceppf`.`team`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `portalceppf`.`team` ;

CREATE TABLE IF NOT EXISTS `portalceppf`.`team` (
  `tea_id` INT NOT NULL,
  `tea_name` VARCHAR(100) NULL,
  PRIMARY KEY (`tea_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portalceppf`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `portalceppf`.`user` ;

CREATE TABLE IF NOT EXISTS `portalceppf`.`user` (
  `usu_id` INT NOT NULL,
  `usu_name` VARCHAR(255) NULL,
  `usu_login` VARCHAR(255) NULL,
  `usu_password` VARCHAR(128) NULL,
  `usu_phone` VARCHAR(45) NULL,
  `usu_celphone` VARCHAR(45) NULL,
  `usu_teacher` TINYINT(1) NULL,
  `team_tea_id` INT NOT NULL,
  PRIMARY KEY (`usu_id`),
  INDEX `fk_user_team1_idx` (`team_tea_id` ASC),
  CONSTRAINT `fk_user_team1`
    FOREIGN KEY (`team_tea_id`)
    REFERENCES `portalceppf`.`team` (`tea_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portalceppf`.`lesson`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `portalceppf`.`lesson` ;

CREATE TABLE IF NOT EXISTS `portalceppf`.`lesson` (
  `les_id` INT NOT NULL,
  `les_name` VARCHAR(150) NULL,
  `les_date` DATETIME NULL,
  `team_tea_id` INT NOT NULL,
  PRIMARY KEY (`les_id`),
  INDEX `fk_lesson_team_idx` (`team_tea_id` ASC),
  CONSTRAINT `fk_lesson_team`
    FOREIGN KEY (`team_tea_id`)
    REFERENCES `portalceppf`.`team` (`tea_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `portalceppf`.`frequency`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `portalceppf`.`frequency` ;

CREATE TABLE IF NOT EXISTS `portalceppf`.`frequency` (
  `user_usu_id` INT NOT NULL,
  `lesson_les_id` INT NOT NULL,
  `fre_present` TINYINT(1) NULL,
  PRIMARY KEY (`user_usu_id`, `lesson_les_id`),
  INDEX `fk_user_has_lesson_lesson1_idx` (`lesson_les_id` ASC),
  INDEX `fk_user_has_lesson_user1_idx` (`user_usu_id` ASC),
  CONSTRAINT `fk_user_has_lesson_user1`
    FOREIGN KEY (`user_usu_id`)
    REFERENCES `portalceppf`.`user` (`usu_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_lesson_lesson1`
    FOREIGN KEY (`lesson_les_id`)
    REFERENCES `portalceppf`.`lesson` (`les_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;