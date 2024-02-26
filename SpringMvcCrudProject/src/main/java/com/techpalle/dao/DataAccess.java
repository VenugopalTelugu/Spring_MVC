package com.techpalle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techpalle.model.Student;

public class DataAccess {

	private static Connection con = null;
	private static PreparedStatement ps = null;
	//Statement
	public static void insert(Student s) {
		
		try {
			//Load the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","manager");
			
			//prepare the Statement
			ps = con.prepareStatement("insert into student(sname,email,pw,mobile) values(?,?,?,?)");
			
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getPassword());
			ps.setLong(4, s.getMobile());
			
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
