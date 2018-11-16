package com.naidu.entity;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		String jdbcURL= "jdbc:mysql://localhost:3306/hibenrnatedevdb";
		String username="root";
		String password="root";
		try {
			Connection con = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("connction established successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
