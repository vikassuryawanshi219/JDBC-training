package com.training.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreInsertScannerDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/trialdb";
		String username="root";
		String password="root";
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner =null;
		try {
			 connection=DriverManager.getConnection(url,username,password);
			 String sql="insert into food values(?,?,?,?)";
			preparedStatement= connection.prepareStatement(sql);
			//set value for the place holder
			scanner =new Scanner(System.in);
			 for(int i=0; i<4;i++) {
				 System.out.println("enter food name");
				 String name=scanner.next();
				 System.out.println("enter food_id");
				 int foodId=scanner.nextInt();
				 System.out.println("enter food cost");
				 float cost=scanner.nextFloat();
				 System.out.println("enter food type");
				 String type=scanner.next();
				 //set the value for  place holder
				    preparedStatement.setString(1,name);
					preparedStatement.setInt(2, foodId);
					preparedStatement.setFloat(3, cost);
					preparedStatement.setString(4, type);
			// execute the statement
			preparedStatement.execute();
			
		}} catch (SQLException e) {
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
			
		


	



