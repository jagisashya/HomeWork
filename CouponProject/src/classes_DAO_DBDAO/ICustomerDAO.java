package classes_DAO_DBDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ICustomerDAO <Customer> {

	void insert(Customer customer,String USERNAME,String PASSWORD) throws SQLException;

	void update(Customer customer,String USERNAME,String PASSWORD) throws SQLException;

	void delete(int id,String USERNAME,String PASSWORD) throws SQLException;
	
	Customer readRecord(String companyName,String USERNAME,String PASSWORD) throws SQLException;
	
	ArrayList<Customer> allCompanies (String USERNAME,String PASSWORD) throws SQLException;
}
