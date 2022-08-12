package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrerResultDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet  resultSet=null;
		try {
			 connection=DriverManager.getConnection(url,username,password);
			 String sql="select * from food";
			preparedStatement= connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String name= resultSet.getString("name");
				int foodId=resultSet.getInt("food_Id");
				float cost= resultSet.getFloat("cost");
				String type =resultSet.getString("type");
				System.out.println(name+"\t"+foodId+"\t"+cost+"\t"+type);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null)
				connection.close();
				if (preparedStatement!=null)
					preparedStatement.close();
				if (resultSet!=null)
					resultSet.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}


	}
}
