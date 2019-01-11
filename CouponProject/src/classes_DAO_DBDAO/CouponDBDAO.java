package classes_DAO_DBDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectionPool.ConnectionPool;
import javaBeanClasses.Company;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

public class CouponDBDAO implement ICouponNDAO<Coupon> {

	// מחרוזת המתארת היכן מסד הנתונים נמצא:
//	private final String connectionString = "jdbc:mysql://localhost:3306/coupon_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//	private String USERNAME; // = "root";
//	private String PASSWORD; // = null;
	private ConnectionPool connectionPool = ConnectionPool.getInstance();

	// -------------------------הכנסת נתונים לטבלה-----------------------------

	public void insert(Company company, String USERNAME, String PASSWORD) throws SQLException {

		Connection connection = null;
//		PreparedStatement preparedStatement = null;

		try {
			// Create a connection:
//			connection = DriverManager.getConnection(connectionString, USERNAME, PASSWORD);
			connection = connectionPool.getConnection();
			// Create sql statement:
			String sql = String.format(
					"INSERT INTO cp_tb_companies(Companie_Name,Companie_Email,Companie_Password) "
							+ "VALUES ('%s','%s','%s')",
					company.getCompanie_Name(), company.getCompanie_Email(), company.getCompanie_Password());

			// Create object which can execute the above sql and return the new id:
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql,
					PreparedStatement.RETURN_GENERATED_KEYS)) {

				// Execute (the insert command):
				preparedStatement.executeUpdate();

				// Retrieves any auto-generated keys created as a result of executing this
				// Statement object (returns ResultSet)
				try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {

					resultSet.next();

					// int id = resultSet.getInt(1);
					company.setCompanie_Id(resultSet.getInt(1)); // Add the new created id into the company object.
					System.out.println("Insert succeeded. New create id: " + resultSet.getInt(1));
				}
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {

			connectionPool.restoreConnection(connection);

		}
	}

	// -------------------------קריאת נתונים מהטבלה-----------------------------
	@SuppressWarnings("finally")
	public Company readRecord(String companyName, String USERNAME, String PASSWORD) throws SQLException {
//		Company companySelect = null;
		Connection connection = null;
		Company companySelect = new Company();
//		Statement statement = null;

		// Create a connection:
		try {
			connection = connectionPool.getConnection();
			
//			connection = DriverManager.getConnection(connectionString, USERNAME, PASSWORD);

			// Create a statement object which can read data:
			// statement = connection.createStatement();

			// Create sql statement for reading data:
			String sql = "select * from cp_tb_companies where Companie_Name = \"" + companyName + "\"";

			// Execute the query and return an object which contains the data (the table):
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				try (ResultSet resultSet = preparedStatement.executeQuery()) {

					// loop over the rows in the ResultSet
					// next() - Moves the cursor forward one row from its current position - returns
					// true if the new current row is valid; false if there are no more rows

					resultSet.next();


					companySelect.setCompanie_Id(resultSet.getInt("Companie_Id"));
					companySelect.setCompanie_Name(resultSet.getString("Companie_Name"));
					companySelect.setCompanie_Email(resultSet.getString("Companie_Email"), true);
					companySelect.setCompanie_Password(resultSet.getString("Companie_Email"), true);

					System.out.println(companySelect.toString());
				}
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			connectionPool.restoreConnection(connection);
			return companySelect;

		}
	}

	// -------------------------עידכון נתונים בטבלה-----------------------------
	public void update(Company company, String USERNAME, String PASSWORD) throws SQLException {

		Connection connection = null;
		// PreparedStatement preparedStatement = null;

		try {
			// Create a connection:
			connection = connectionPool.getConnection();
//			connection = DriverManager.getConnection(connectionString, USERNAME, PASSWORD);

			// Create an update sql statement:
			String sql = String.format(
					"UPDATE cp_tb_companies " + "Set Companie_Name='%s',Companie_Email='%s',Companie_Password='%s'"
							+ "WHERE Companie_Id = %d",
					company.getCompanie_Name(), company.getCompanie_Email(), company.getCompanie_Password(),
					company.getCompanie_Id());

			// Create an object for executing the above sql:
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

				preparedStatement.executeUpdate();
			}

			System.out.println("Update succeeded.");
		}

		catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			connectionPool.restoreConnection(connection);

		}
	}

	// -------------------------מחיקת נתונים מהטבלה-----------------------------
	public void delete(int id, String USERNAME, String PASSWORD) throws SQLException {

		Connection connection = null;
//		PreparedStatement preparedStatement = null;

		try {
			// Create a connection:
			connection = connectionPool.getConnection();

//			connection = DriverManager.getConnection(connectionString, USERNAME, PASSWORD);

			// Create sql command for delete one record:
			String sql = String.format("DELETE FROM cp_tb_companies where Companie_Id = %d", id);

			// Create an object for executing the above command:
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

				// Execute:
				preparedStatement.executeUpdate();

				System.out.println("Delete succeeded.");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			connectionPool.restoreConnection(connection);

		}
	}

//	@SuppressWarnings("finally")
	@Override
	public ArrayList<Company> allCompanies(String USERNAME, String PASSWORD) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
//		Statement statement = null;
		ArrayList<Company> allCompanies = new ArrayList<Company>();

		// Create a connection:
		try {

			connection = connectionPool.getConnection();
//			connection = DriverManager.getConnection(connectionString, USERNAME, PASSWORD);

			// Create a statement object which can read data:
//			statement = connection.createStatement();

			// Create sql statement for reading data:
			String sql = "select * from cp_tb_companies";
		
			try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

			// Execute the query and return an object which contains the data (the table):
				try(ResultSet resultSet = preparedStatement.executeQuery()){

			// loop over the rows in the ResultSet
			// next() - Moves the cursor forward one row from its current position - returns
			// true if the new current row is valid; false if there are no more rows

					while (resultSet.next()) {

						Company company = new Company();
						company.setCompanie_Id(resultSet.getInt("Companie_Id"));
						company.setCompanie_Name(resultSet.getString("Companie_Name"));
						company.setCompanie_Email(resultSet.getString("Companie_Email"), true);
						company.setCompanie_Password(resultSet.getString("Companie_Email"), true);

						allCompanies.add(company);
					}
				}
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} finally {
			connectionPool.restoreConnection(connection);
			return allCompanies;

		}
	}
}
