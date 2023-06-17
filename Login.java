package com.sbi.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

interface Lg{
	void login();
}
public class Login implements Lg {
	public final void login() {
		System.out.println("=========Login Page=========");
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url);
			System.out.print("Enter UserName : ");
			String user = sc.next();
			ps = con.prepareStatement("Select username from bank.info where username =  ?");
			ps.setString(1, user);
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.print("Enter Password : ");
				String pass =  sc.next();
				ps = con.prepareStatement("Select password from bank.info where username =  ?");
				ps.setString(1, user);
				rs = ps.executeQuery();
				if(rs.next()) 
				{
					String vpass= rs.getString(1);
					if(pass.equals(vpass))
					{
						ps = con.prepareStatement
								("Select accno from bank.details where mobile = "
										+ "(Select mobile from bank.info where username = ?)");
						ps.setString(1, user);
						rs= ps.executeQuery();
						if(rs.next()) {
							long acc= rs.getLong(1);
							System.out.println("==================");
							System.out.println("Logged in successfully");
							System.out.println("==================");
							System.out.println("Welcome "+user);
							Home home = new Home(acc);
						
								home.home();
							
						}

					}
					else 
					{
						System.out.println("Incorrect input");
						login();
					}
				}
				else 
				{
					System.out.println("Incorrect input");
					login();
				}
			}
			else 
			{
				System.out.println("Incorrect input");
				login();
			}

		} catch (Exception e) {
			login();

		}
		finally {
			try {
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(ps!=null)
					ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
			System.gc();

		}
	}
}

