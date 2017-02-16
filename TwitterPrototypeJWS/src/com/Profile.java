package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import com.dbconnection.DbConnection;


public class Profile {
	//insertTweet
	
	public int insertTweet(String userId, String tweetTextId, String tweetData, String hashtagData, String isCreator, String currentDate, String userHandle) {		

		Connection conn = null;
		Statement stmt = null;
		int status = 0;

		try {

			System.out.println("Connecting to database for signup...");
			conn = DbConnection.getConnection();
			System.out.println("connection " + conn);

			System.out.println("Creating statement...");
			String sql;		
			
			sql = "INSERT INTO tweets (`email`, `tweetId`, `tweetData`, `hashtagData`, `isCreator`, `currentTimestamp`, `userHandle`) " +
					"VALUES ('" + userId + "','" + tweetTextId + "','" + tweetData + "','" + hashtagData + "','" +	isCreator + "','" +	new Date() + "','" + userHandle + "');";
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
			conn.close();
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
	
	
	
	//retrieveTweet
	public String retrieveTweet(String userId) throws SQLException, ClassNotFoundException{		

		Connection conn = null;
		Statement stmt = null;
		ArrayList<String> tweets = new ArrayList<String>(); 
		
		try {

			System.out.println("Connecting to database for signup...");
			conn = DbConnection.getConnection();
			System.out.println("connection " + conn);

			System.out.println("Creating statement...");
			String sql;		
			
			sql = "select * from tweets where email='" + userId + "' and isCreator='1';";
					
			stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("Before rs " + rs);
			
			//Extract data from result set
			while (rs.next()) {

				tweets.add(rs.getString("tweetData")+"|" + rs.getString("currentTimestamp") + ";");
				System.out.println("Row: " + rs.getString("tweetData")+" " + rs.getString("currentTimestamp") + ";");
			}			
			
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
		
		return tweets.toString();
	}	
}
