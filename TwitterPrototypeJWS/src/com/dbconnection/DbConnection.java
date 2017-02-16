package com.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DbConnection {

	static final String jdbc_driver = "com.mysql.jdbc.Driver";
	static final String db_url = "jdbc:mysql://localhost/test";
	static final String db_username = "root";
	static final String db_password = "root";
	static ArrayList<Connection> pool = new ArrayList<Connection>(0);
	static Connection conn = null;
	
	private static void createConnectionPool() throws SQLException, ClassNotFoundException {
		for (int i = 0; i < 10; i++) {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DbConnection.db_url, DbConnection.db_username, DbConnection.db_password);
			pool.add(conn);
		}
	}
	
	public static Connection getConnection(){

		try{
			//STEP 2: Register JDBC driver
			Class.forName(jdbc_driver);

			//STEP 3: Open a connection
			//conn = DriverManager.getConnection(db_url, db_username, db_password);
			System.out.println("Connecting to database in DbConnection...");
			if(pool.size() == 0)
				createConnectionPool();
			
			conn = pool.get(pool.size() - 1);
			pool.remove(conn);			
		}
		catch(Exception e){
			System.out.println("Exception");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection connection) {
		pool.add(connection);
	}
}