package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.dbconnection.DbConnection;


public class Dashboard {

	public String retrieveAllTweets(String email) throws SQLException, ClassNotFoundException {
		
		Connection conn = null;
		Statement stmt = null;
		ArrayList<String> followers = new ArrayList<String>();
		ArrayList<String> tweets = new ArrayList<String>();
		
		try {

			System.out.println("Connecting to database for signup...");
			conn = DbConnection.getConnection();
			System.out.println("connection " + conn);

			System.out.println("Creating statement...");
			String sql, sqltemp;					
					
			stmt = conn.createStatement();	
			
			
			//Retrieving followers
			sql = "select followerId from followers where userId = '" + email + "';";	
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println("Followers Retrieved: " + rs);
			
			//Extract followers from result set
			while (rs.next()) {
				followers.add(rs.getString("followerId"));
				
			}			
			String queryFollowers = "";
			for (int i = 1; i < followers.size(); i++) {
				queryFollowers += "','" + followers.get(i);
			}

			//Retrieving Tweets for all users
			sqltemp = "create view tweetlist as select users.email, users.userHandle, tweets.tweetData, tweets.currentTimestamp from users join tweets where users.email = tweets.email;";
			
			int status = stmt.executeUpdate(sqltemp);
			
			if (status > 0) {
				sql = "select email, userHandle, tweetData, currentTimestamp from tweetlist where email in (" + queryFollowers + ",'"	+ email + "');";
				ResultSet rs1 = stmt.executeQuery(sql);
				//index = 0;
				while (rs1.next()) {
					tweets.add(rs.getString("email") + "|" + rs.getString("userHandle") + "|" + rs.getString("tweetData") + "|" + rs.getString("currentTimestamp") + ";");

				}
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
