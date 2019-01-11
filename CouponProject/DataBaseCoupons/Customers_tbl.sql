
/*
	-------------------------------------------------------------------------------------------
	Drop and Create a table
    -------------------------------------------------------------------------------------------
*/

DROP TABLE IF EXISTS `Coupon_DB`.`CP_Tb_Customers` ;

CREATE TABLE `cp_tb_customers` (
  `Customer_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Customer_First_Name` varchar(45) NOT NULL,
  `Customer_Last_Name` varchar(45) NOT NULL,
  `Customer_Email` varchar(318) NOT NULL COMMENT 'The email address is divided into 2 parts separated by "@" character.\nlocal-part@domain.\nlocal-part ==> until 64 characters\ndomain    ==> until 255 characters\nsee wikipedia "Email address"',
  `Customer_Password` varchar(45) NOT NULL,
  PRIMARY KEY (`Customer_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*
	-------------------------------------------------------------------------------------------
	Return record data from the data base
    -------------------------------------------------------------------------------------------
*/
SELECT `cp_tb_customers`.`Customer_Id`,
    `cp_tb_customers`.`Customer_First_Name`,
    `cp_tb_customers`.`Customer_Last_Name`,
    `cp_tb_customers`.`Customer_Email`,
    `cp_tb_customers`.`Customer_Password`
FROM `coupon_db`.`cp_tb_customers`;

/*
	-------------------------------------------------------------------------------------------
	Modify record data from the data base
    -------------------------------------------------------------------------------------------
*/
UPDATE `coupon_db`.`cp_tb_customers`
SET
	`Customer_Id` = <{Customer_Id: }>,
	`Customer_First_Name` = <{Customer_First_Name: }>,
	`Customer_Last_Name` = <{Customer_Last_Name: }>,
	`Customer_Email` = <{Customer_Email: }>,
	`Customer_Password` = <{Customer_Password: }>
WHERE `Customer_Id` = <{expr}>;

/* 
	-------------------------------------------------------------------------------------------
	Insert new data row to the data base
    -------------------------------------------------------------------------------------------
*/

INSERT INTO `coupon_db`.`cp_tb_customers`
	(`Customer_Id`,
	`Customer_First_Name`,
	`Customer_Last_Name`,
	`Customer_Email`,
	`Customer_Password`)
VALUES
	(<{Customer_Id: }>,
	<{Customer_First_Name: }>,
	<{Customer_Last_Name: }>,
	<{Customer_Email: }>,
	<{Customer_Password: }>);

/*
	-------------------------------------------------------------------------------------------
	Delete row data from the data base
    -------------------------------------------------------------------------------------------
*/

DELETE FROM `coupon_db`.`cp_tb_customers`
WHERE <{where_expression}>;






