
/*
	-------------------------------------------------------------------------------------------
	Drop and Create a table
    -------------------------------------------------------------------------------------------
*/
DROP TABLE IF EXISTS `Coupon_DB`.`CP_Tb_Categories` ;

CREATE TABLE `cp_tb_categories` (
  `Category_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Category_Name` varchar(45) NOT NULL,
  PRIMARY KEY (`Category_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*
	-------------------------------------------------------------------------------------------
	Return record data from the data base
    -------------------------------------------------------------------------------------------
*/

SELECT `cp_tb_categories`.`Category_Id`,
    `cp_tb_categories`.`Category_Name`
FROM `coupon_db`.`cp_tb_categories`;

/*
	-------------------------------------------------------------------------------------------
	Modify record data from the data base
    -------------------------------------------------------------------------------------------
*/
    
UPDATE `coupon_db`.`cp_tb_categories`
SET
	`Category_Id` = <{Category_Id: }>,
	`Category_Name` = <{Category_Name: }>
WHERE `Category_Id` = <{expr}>;


/* 
	-------------------------------------------------------------------------------------------
	Insert new data row to the data base
    -------------------------------------------------------------------------------------------
*/
    
INSERT INTO `coupon_db`.`cp_tb_categories`
	(`Category_Id`,
	`Category_Name`)
VALUES
	(<{Category_Id: }>,
	<{Category_Name: }>);
    
/*
	Delete row data from the data base
*/
DELETE FROM `coupon_db`.`cp_tb_categories`
WHERE <{where_expression}>;





