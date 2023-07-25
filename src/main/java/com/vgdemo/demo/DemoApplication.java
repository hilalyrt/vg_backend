package com.vgdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		String url =  "jdbc:mysql://localhost:3306/vg_db";
		String user = "root";
		String password = "root1";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =
					DriverManager.getConnection(url,user,password);
			System.out.println("connection is successfull to " + url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		SpringApplication.run(DemoApplication.class, args);

	}


}
