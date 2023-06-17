package com.sbi.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ForgotPass {

	public void forgotpass() {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/bank";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			System.out.print("Enter your Mobile Number : ");
			long num = sc.nextLong();
			String qry ="Select username, password from info where mobile = ?";
			con = DriverManager.getConnection(url,"root","root");
			ps = con.prepareStatement(qry);
			ps.setLong(1, num);
			rs= ps.executeQuery();
			if(rs.next())
			{
				String username = rs.getString(1);
				String password = rs.getString(2);
				System.out.println("Username : "+username);
				System.out.println("Password : "+password);
				
				Lg login = new Login();
				login.login();
			}
			else {
				System.out.println("Account not found !");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Input");
		}
		finally {
			System.gc();
		}
	}
}
