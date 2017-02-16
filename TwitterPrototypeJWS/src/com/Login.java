package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import com.dbconnection.DbConnection;


@WebService
public class Login {

	public String login(String username, String password) {		

		Connection conn = null;
		Statement stmt = null;
		String userId = "fail";

		try {

			System.out.println("Connecting to database...");
			conn = DbConnection.getConnection();
			System.out.println("connection " + conn);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			String sql;
			sql = "SELECT * FROM users where email = \'" + username + "\';";
			stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("Before rs " + rs);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				String userName = rs.getString("email");
				String passWord = rs.getString("password");

				System.out.println("username " + userName);
				System.out.println("password " + passWord);

				if (userName.equals(username) && passWord.equals(password)) {
					System.out.println("true");
					userId = rs.getString("email") + " " + rs.getString("userHandle");
					System.out.println("UserId: " + userId);
				}

			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			//conn.close();
			DbConnection.closeConnection(conn);
		} catch (SQLException se) {
			// Handle errors for JDBC

			System.out.println("inside sql exception");

			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName

			System.out.println("inside sql exception");
			e.printStackTrace();
		}

		return userId;
	}
	
	public int signup(String email, String firstName, String lastName, String password, String userHandle, String dob, String contactNo, String location) {		

		Connection conn = null;
		Statement stmt = null;
		int status = 0;

		try {

			System.out.println("Connecting to database for signup...");
			conn = DbConnection.getConnection();
			System.out.println("connection " + conn);

			System.out.println("Creating statement...");
			String sql;		
			
			sql = "INSERT INTO users (`email`, `firstName`, `lastName`, `password`, `userHandle`, `birthday`, `contactInformation`, `location`) " +
					"VALUES ('" + email + "','" + firstName + "','" + lastName + "','" + password + "','" +	userHandle + "','" + dob + "','" + contactNo + "','" + location +"');";
					
			
			stmt = conn.createStatement();			
			int rs = stmt.executeUpdate(sql);

			System.out.println("Before rs " + rs);
			
			if(rs > 0){
				status = 1;
			}
			else{
				status = 0;
			}
			stmt.close();
			//conn.close();
			DbConnection.closeConnection(conn);
		} catch (SQLException se) {
			// Handle errors for JDBC
			System.out.println("inside sql exception");
			se.printStackTrace();
			
		} catch (Exception e) {
			// Handle errors for Class.forName
			System.out.println("inside sql exception");
			e.printStackTrace();
		}

		return status;
	}	
}