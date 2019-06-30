package com.example.dbapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbapplicationApplication {

	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DbapplicationApplication.class, args);
		/*
		 * Class.forName("org.postgresql.Driver"); Connection connection = null;
		 * connection = DriverManager.getConnection(
		 * "jdbc:postgresql://localhost:5432/Test","postgres", "studyhard@20");
		 * 
		 * Statement stmt = connection.createStatement(); ResultSet
		 * rs=stmt.executeQuery("select * from employee where id= 1");
		 * 
		 * while(rs.next()){ System.out.println(rs.getInt(30)+" "+rs.getString(1)); }
		 * 
		 * connection.close();
		 */
	}

}
