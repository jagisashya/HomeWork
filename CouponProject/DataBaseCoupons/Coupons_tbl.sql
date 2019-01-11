

/*
	-------------------------------------------------------------------------------------------
	Drop and Create a table
    -------------------------------------------------------------------------------------------
*/

DROP TABLE IF EXISTS `Coupon_DB`.`CP_Tb_Coupons` ;

CREATE TABLE `cp_tb_coupons` (
  `Coupon_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Coupon_Company_Id` int(11) NOT NULL,
  `Copuon_Category_Id` int(11) NOT NULL,
  `Coupon_Title` varchar(100) NOT NULL COMMENT 'Short description of the coupon',
  `Coupon_Description` varchar(400) NOT NULL COMMENT 'Long description of the coupon ',
  `Coupon_Start_Date` datetime DEFAULT NULL COMMENT 'Coupon creation Date',
  `Coupon_End_Date` datetime DEFAULT NULL COMMENT 'Coupon expiration date',
  `Coupon_Amount` int(11) DEFAULT NULL COMMENT 'Quantity of coupons in stock',
  `Coupon_Price` decimal(10,0) DEFAULT NULL COMMENT 'Coupon price',
  `Coupon_Image` varchar(250) DEFAULT NULL COMMENT 'File address for the coupon image',
  `Coupon_Inserted_Date` datetime NOT NULL,
  `Coupon_Modified_date` datetime NOT NULL,
  PRIMARY KEY (`Coupon_Id`),
  KEY `fk_CP_Tb_Coupons_CP_Tb_Companies1_idx` (`Coupon_Company_Id`),
  KEY `fk_CP_Tb_Coupons_CP_Tb_Categories1_idx` (`Copuon_Category_Id`),
  CONSTRAINT `fk_CP_Tb_Coupons_CP_Tb_Categories1` FOREIGN KEY (`Copuon_Category_Id`) REFERENCES `cp_tb_categories` (`Category_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CP_Tb_Coupons_CP_Tb_Companies1` FOREIGN KEY (`Coupon_Company_Id`) REFERENCES `cp_tb_companies` (`Companie_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE INDEX `fk_CP_Tb_Coupons_CP_Tb_Companies1_idx` ON `Coupon_DB`.`CP_Tb_Coupons` (`Coupon_Company_Id` ASC) ;

CREATE INDEX `fk_CP_Tb_Coupons_CP_Tb_Categories1_idx` ON `Coupon_DB`.`CP_Tb_Coupons` (`Copuon_Category_Id` ASC);


/*
	-------------------------------------------------------------------------------------------
	Return record data from the data base
    -------------------------------------------------------------------------------------------
*/
SELECT `cp_tb_coupons`.`Coupon_Id`,
    `cp_tb_coupons`.`Coupon_Company_Id`,
    `cp_tb_coupons`.`Copuon_Category_Id`,
    `cp_tb_coupons`.`Coupon_Title`,
    `cp_tb_coupons`.`Coupon_Description`,
    `cp_tb_coupons`.`Coupon_Start_Date`,
    `cp_tb_coupons`.`Coupon_End_Date`,
    `cp_tb_coupons`.`Coupon_Amount`,
    `cp_tb_coupons`.`Coupon_Price`,
    `cp_tb_coupons`.`Coupon_Image`,
    `cp_tb_coupons`.`Coupon_Inserted_Date`,
    `cp_tb_coupons`.`Coupon_Modified_date`
FROM `coupon_db`.`cp_tb_coupons`;

/*
	-------------------------------------------------------------------------------------------
	Modify record data from the data base
    -------------------------------------------------------------------------------------------
*/
UPDATE `coupon_db`.`cp_tb_coupons`
SET
	`Coupon_Id` = <{Coupon_Id: }>,
	`Coupon_Company_Id` = <{Coupon_Company_Id: }>,
	`Copuon_Category_Id` = <{Copuon_Category_Id: }>,
	`Coupon_Title` = <{Coupon_Title: }>,
	`Coupon_Description` = <{Coupon_Description: }>,
	`Coupon_Start_Date` = <{Coupon_Start_Date: }>,
	`Coupon_End_Date` = <{Coupon_End_Date: }>,
	`Coupon_Amount` = <{Coupon_Amount: }>,
	`Coupon_Price` = <{Coupon_Price: }>,
	`Coupon_Image` = <{Coupon_Image: }>,
	`Coupon_Inserted_Date` = <{Coupon_Inserted_Date: }>,
	`Coupon_Modified_date` = <{Coupon_Modified_date: }>
WHERE `Coupon_Id` = <{expr}>;

/* 
	-------------------------------------------------------------------------------------------
	Insert new data row to the data base
    -------------------------------------------------------------------------------------------
*/

INSERT INTO `coupon_db`.`cp_tb_coupons`
	(`Coupon_Id`,
	`Coupon_Company_Id`,
	`Copuon_Category_Id`,
	`Coupon_Title`,
	`Coupon_Description`,
	`Coupon_Start_Date`,
	`Coupon_End_Date`,
	`Coupon_Amount`,
	`Coupon_Price`,
	`Coupon_Image`,
	`Coupon_Inserted_Date`,
	`Coupon_Modified_date`)
VALUES
	(<{Coupon_Id: }>,
	<{Coupon_Company_Id: }>,
	<{Copuon_Category_Id: }>,
	<{Coupon_Title: }>,
	<{Coupon_Description: }>,
	<{Coupon_Start_Date: }>,
	<{Coupon_End_Date: }>,
	<{Coupon_Amount: }>,
	<{Coupon_Price: }>,
	<{Coupon_Image: }>,
	<{Coupon_Inserted_Date: }>,
	<{Coupon_Modified_date: }>);

/*
	-------------------------------------------------------------------------------------------
	Delete row data from the data base
    -------------------------------------------------------------------------------------------
*/
DELETE FROM `coupon_db`.`cp_tb_coupons`
WHERE <{where_expression}>;
