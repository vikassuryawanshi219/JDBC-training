package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrerUpdateDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		try {
			 connection=DriverManager.getConnection(url,username,password);
			
			 
			 String sql="update food set type=? where food_id=?";
			preparedStatement= connection.prepareStatement(sql);
			preparedStatement.setString(1,"NonVeg");
			preparedStatement.setInt(2,2);
			preparedStatement.execute();
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null)
				connection.close();
				if (preparedStatement!=null)
					preparedStatement.close();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}


	}
}
