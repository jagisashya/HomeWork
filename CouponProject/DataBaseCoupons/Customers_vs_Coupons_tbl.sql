
/*
	-------------------------------------------------------------------------------------------
	Drop and Create a table
    -------------------------------------------------------------------------------------------
*/

DROP TABLE IF EXISTS `Coupon_DB`.`CP_Tb_Customers_VS_Coupons` ;
CREATE TABLE `cp_tb_customers_vs_coupons` (
  `Coupon_Id` int(11) NOT NULL,
  `Customer_id` int(11) NOT NULL,
  PRIMARY KEY (`Coupon_Id`,`Customer_id`),
  KEY `fk_CP_Tb_Customers_VS_Coupons_CP_Tb_Customers1_idx` (`Customer_id`),
  CONSTRAINT `fk_CP_Tb_Customers_VS_Coupons_CP_Tb_Coupons1` FOREIGN KEY (`Coupon_Id`) REFERENCES `cp_tb_coupons` (`Coupon_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CP_Tb_Customers_VS_Coupons_CP_Tb_Customers1` FOREIGN KEY (`Customer_id`) REFERENCES `cp_tb_customers` (`Customer_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE INDEX `fk_CP_Tb_Customers_VS_Coupons_CP_Tb_Customers1_idx` ON `Coupon_DB`.`CP_Tb_Customers_VS_Coupons` (`Customer_id` ASC) ;

/*
	-------------------------------------------------------------------------------------------
	Return record data from the data base
    -------------------------------------------------------------------------------------------
*/
SELECT `cp_tb_customers_vs_coupons`.`Coupon_Id`,
    `cp_tb_customers_vs_coupons`.`Customer_id`
FROM `coupon_db`.`cp_tb_customers_vs_coupons`;

/*
	-------------------------------------------------------------------------------------------
	Modify record data from the data base
    -------------------------------------------------------------------------------------------
*/
    
UPDATE `coupon_db`.`cp_tb_customers_vs_coupons`
SET
	`Coupon_Id` = <{Coupon_Id: }>,
	`Customer_id` = <{Customer_id: }>
WHERE `Coupon_Id` = <{expr}> AND `Customer_id` = <{expr}>;

/* 
	-------------------------------------------------------------------------------------------
	Insert new data row to the data base
    -------------------------------------------------------------------------------------------
*/

INSERT INTO `coupon_db`.`cp_tb_customers_vs_coupons`
	(`Coupon_Id`,
	`Customer_id`)
VALUES
	(<{Coupon_Id: }>,
	<{Customer_id: }>);

/*
	-------------------------------------------------------------------------------------------
	Delete row data from the data base
    -------------------------------------------------------------------------------------------
*/

DELETE FROM `coupon_db`.`cp_tb_customers_vs_coupons`
WHERE <{where_expression}>;
