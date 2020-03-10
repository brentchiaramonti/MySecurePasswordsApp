-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema my_secure_password
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema my_secure_password
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `my_secure_password` DEFAULT CHARACTER SET utf8 ;
USE `my_secure_password` ;

-- -----------------------------------------------------
-- Table `my_secure_password`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_secure_password`.`User` (
  `master_password` VARCHAR(100) NOT NULL,
  `user_id` INT NOT NULL,
  `user_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `my_secure_password`.`Entry`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `my_secure_password`.`Entry` (
  `Entry_id` INT NOT NULL,
  `user_name_2` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `User_User_id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Entry_id`, `User_User_id`),
  INDEX `fk_Value_User_idx` (`User_User_id` ASC),
  CONSTRAINT `fk_Value_User`
    FOREIGN KEY (`User_User_id`)
    REFERENCES `my_secure_password`.`User` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
