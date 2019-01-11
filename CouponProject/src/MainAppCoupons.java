import classes_DAO_DBDAO.CompanyDBDAO;
import connectionPool.ConnectionPool;
import connectionPool.UserPassword;
import javaBeanClasses.Company;
import javaBeanClasses.Coupon;

public class MainAppCoupons {

	public static void main(String[] args) throws Throwable {

		String USERNAME = "root";
		String PASSWORD = null;
		/*
		 * Load the jdbc driver for mysql data base
		 */
//		UserPassword up = new UserPassword();
//		UserPassword.USER = USERNAME;
//		UserPassword.PASSWORD = PASSWORD;
		UserPassword.setUser(USERNAME);
		UserPassword.setPassword(PASSWORD);
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
//			Company company = new Company("Company Name 1", "comp_name1@gmail.com", "Aa1@11");
//			Company company = new Company("Company Name 2", "comp_name2@gmail.com", "Aa1@22");
//			Company company = new Company("Company Name 3", "comp_name3@gmail.com", "Aa1@33");
//			Company company = new Company("Company Name 4", "comp_name4@gmail.com", "Aa1@44");
//			Company company = new Company("Company Name 5", "comp_name5@gmail.com", "Aa1@55");
//			Company company = new Company("Company Name 6", "comp_nameadfas5@gmail.com", "Aa1@adfsf55");
//			Company company = new Company("Company Name 7", "comp_name7@gmail.com", "Aa1@77");
//			Company company = new Company("Company Name 8", "comp_name8@gmail.com", "Aa1@88");
			Company company = new Company("Company Name 11", "comp_name9@gmail.com", "Aa1@1111");

//
			new CompanyDBDAO().insert(company, USERNAME, PASSWORD);
			 company = new Company("Company Name 12", "comp_name12@gmail.com", "Aa1@1212");
				new CompanyDBDAO().insert(company, USERNAME, PASSWORD);

//			company = new Company("Company Name 7", "comp_nameadfas7@gmail.com", "Aa1@adfsf5577");
//			new DAO_Company().insert(company, USERNAME, PASSWORD);
//
//			company = new Company();
//			
//			company = new DAO_Company().readRecord("Company Name 1", USERNAME, PASSWORD);
//			System.out.println(company.toString());
//			company.setCompanie_Email("comp_name1@gmail.com",true);
//			company.setCompanie_Password("Aa1@11", true);
//			new DAO_Company().update(company, USERNAME, PASSWORD);
//			
//			company = new DAO_Company().readRecord("Company Name 2", USERNAME, PASSWORD);
//			System.out.println(company.toString());
//			company.setCompanie_Email("comp_name2@gmail.com",true);
//			company.setCompanie_Password("Aa1@22", true);
//			new DAO_Company().update(company, USERNAME, PASSWORD);
//
//			company = new DAO_Company().readRecord("Company Name 3", USERNAME, PASSWORD);
//			System.out.println(company.toString());
//			company.setCompanie_Email("comp_name3@gmail.com",true);
//			company.setCompanie_Password("Aa1@33", true);
//			new DAO_Company().update(company, USERNAME, PASSWORD);
//			
//			company = new DAO_Company().readRecord("Company Name 4", USERNAME, PASSWORD);
//			System.out.println(company.toString());
//			company.setCompanie_Email("comp_name4@gmail.com",true);
//			company.setCompanie_Password("Aa1@44", true);
//			new DAO_Company().update(company, USERNAME, PASSWORD);
//			
//			company = new DAO_Company().readRecord("Company Name 5", USERNAME, PASSWORD);
//			System.out.println(company.toString());
//			company.setCompanie_Email("comp_name5@gmail.com",true);
//			company.setCompanie_Password("Aa1@55", true);
//			new DAO_Company().update(company, USERNAME, PASSWORD);
//			
//			company = new DAO_Company().readRecord("Company Name 6", USERNAME, PASSWORD);
//			System.out.println(company.toString());
//			company.setCompanie_Email("comp_name6@gmail.com",true);
//			company.setCompanie_Password("Aa1@66", true);
//			new DAO_Company().update(company, USERNAME, PASSWORD);
//
//			new CompanyDBDAO().delete(8, USERNAME, PASSWORD);
//			new CompanyDBDAO().delete(9, USERNAME, PASSWORD);



			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
