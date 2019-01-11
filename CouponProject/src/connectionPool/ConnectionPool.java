package connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

import javaBeanClasses.TesteEmail;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class ConnectionPool {

	private static ConnectionPool instance = new ConnectionPool();

	private Stack<Connection> connections = new Stack<>();

	private final String connectionString = "jdbc:mysql://localhost:3306/coupon_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	private final int ct_Max_Connections = 5;

	private ConnectionPool() {
		System.out.println("estou no constructor");

		for (int i = 0; i < ct_Max_Connections; i++) {
			try {
				Connection conn = DriverManager.getConnection(connectionString,UserPassword.getUser(),UserPassword.getPassword());
				connections.push(conn);
			} catch (SQLException e) {
			}
		}

	}

	public static ConnectionPool getInstance() {
		System.out.println("estou no getInstance");
		return instance;
	}

	public Connection getConnection() throws InterruptedException {

		synchronized (connections) {

			if (connections.isEmpty()) {
				connections.wait();
			}

			return connections.pop();
		}
	}

	public void restoreConnection(Connection conn) {

		synchronized (connections) {
			connections.push(conn);
			connections.notify();
		}
	}

	public void closeAllConnection() throws InterruptedException {

		synchronized (connections) {

			while (connections.size() < 10) {
				connections.wait();
			}

			for (Connection conn : connections) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
	}
}
