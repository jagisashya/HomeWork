package classes_DAO_DBDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ICompanyDAO <Company> {


	void insert(Company company,String USERNAME,String PASSWORD) throws SQLException;

	void update(Company company,String USERNAME,String PASSWORD) throws SQLException;

	void delete(int id,String USERNAME,String PASSWORD) throws SQLException;
	
	Company readRecord(String companyName,String USERNAME,String PASSWORD) throws SQLException;
	
	ArrayList<Company> allCompanies (String USERNAME,String PASSWORD) throws SQLException;
}
