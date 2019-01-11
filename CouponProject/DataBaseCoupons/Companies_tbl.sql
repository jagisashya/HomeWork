
/*
	-------------------------------------------------------------------------------------------
	Drop and Create a table
    -------------------------------------------------------------------------------------------
*/
DROP TABLE IF EXISTS `Coupon_DB`.`CP_Tb_Companies` ;


CREATE TABLE `cp_tb_companies` (
  `Companie_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Companie_Name` varchar(45) NOT NULL COMMENT 'The name of the company that provides coupons',
  `Companie_Email` varchar(318) NOT NULL COMMENT 'The email address is divided into 2 parts separated by "@" character.\nlocal-part@domain.\nlocal-part ==> until 64 characters\ndomain    ==> until 255 characters\nsee wikipedia "Email address"',
  `Companie_Password` varchar(45) NOT NULL,
  PRIMARY KEY (`Companie_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


/*
	-------------------------------------------------------------------------------------------
	Return record data from the data base
    -------------------------------------------------------------------------------------------
*/

SELECT `cp_tb_companies`.`Companie_Id`,
    `cp_tb_companies`.`Companie_Name`,
    `cp_tb_companies`.`Companie_Email`,
    `cp_tb_companies`.`Companie_Password`
FROM `coupon_db`.`cp_tb_companies`;

/*
	-------------------------------------------------------------------------------------------
	Modify record data from the data base
    -------------------------------------------------------------------------------------------
*/
UPDATE `coupon_db`.`cp_tb_companies`
SET
	`Companie_Id` = <{Companie_Id: }>,
	`Companie_Name` = <{Companie_Name: }>,
	`Companie_Email` = <{Companie_Email: }>,
	`Companie_Password` = <{Companie_Password: }>
WHERE `Companie_Id` = <{expr}>;

/* 
	-------------------------------------------------------------------------------------------
	Insert new data row to the data base
    -------------------------------------------------------------------------------------------
*/
INSERT INTO `coupon_db`.`cp_tb_companies`
	(`Companie_Id`,
	`Companie_Name`,
	`Companie_Email`,
	`Companie_Password`)
VALUES
	(<{Companie_Id: }>,
	<{Companie_Name: }>,
	<{Companie_Email: }>,
	<{Companie_Password: }>);

/*
	-------------------------------------------------------------------------------------------
	Delete row data from the data base
    -------------------------------------------------------------------------------------------
*/
DELETE FROM `coupon_db`.`cp_tb_companies`
WHERE <{where_expression}>;

