package com.stwijn.myseriesdb.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestDb")
public class TestDb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// setup connection variables
		String user = "admin";
		String pass = "admin";

		String jdbcUrl = "jdbc:mysql://localhost:3306/myseries-db?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";

		// get connection to database
		try {

			//System.out.println("Connecting to database ...");

			// Class.forName(driver);

			PrintWriter out = response.getWriter();

			out.println("Connecting to database... " );

			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

			out.println("successfully!");
			
			//System.out.println("connected to " + jdbcUrl + " successfully");

			myConn.close();

		} catch (Exception exc) {
			PrintWriter fail = response.getWriter();
			fail.println("failed! Check jdbcUrl and user/pass.");
			
			exc.printStackTrace();
			//throw new ServletException(exc);
			
			
			//System.out.println("failed! Check if jdbcUrl and user/pass are configured correctly.");

		}
	}

}
