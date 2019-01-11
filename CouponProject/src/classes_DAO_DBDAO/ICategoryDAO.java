package classes_DAO_DBDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ICategoryDAO<Category> {

	void insert(Category category, String USERNAME, String PASSWORD) throws SQLException;

	void update(Category category, String USERNAME, String PASSWORD) throws SQLException;

	void delete(int id, String USERNAME, String PASSWORD) throws SQLException;

	Category readRecord(String Name, String USERNAME, String PASSWORD) throws SQLException;

	ArrayList<Category> allCompanies(String USERNAME, String PASSWORD) throws SQLException;
}
