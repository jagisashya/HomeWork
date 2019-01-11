package classes_DAO_DBDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ICouponDAO <Coupon>{

	void insert(Coupon coupon,String USERNAME,String PASSWORD) throws SQLException;

	void update(Coupon coupon,String USERNAME,String PASSWORD) throws SQLException;

	void delete(int id,String USERNAME,String PASSWORD) throws SQLException;
	
	Coupon readRecord(String companyName,String USERNAME,String PASSWORD) throws SQLException;
	
	ArrayList<Coupon> allCoupons (String USERNAME,String PASSWORD) throws SQLException;
}
