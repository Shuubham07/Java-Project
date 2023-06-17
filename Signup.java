package com.sbi.pack1;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;

interface Sg{
	void signup();
}
public class Signup implements Sg{
	public final void signup() {
		System.out.println("=========Signup Page=========");
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement st = null;
		String qry="Insert into info values(?,?,?)";	
		String url = "jdbc:mysql://localhost:3306/bank";
		try {
			long a = 1000000000+ ran.nextInt(900000000);
			con = DriverManager.getConnection(url,"root","root");
			st = con.prepareStatement(qry);
			System.out.print("Create Username : ");
			String user = sc.next();
			st.setString(1, user);
			System.out.println("Password should be 8 digit & must contain atleast "
					+ "1 number, 1 UpperCase Alphabet, 1 LowerCase alphabet "
					+ "and 1 special character"	);
			System.out.print("Create password : ");
			String pass = sc.next();
			if(PassChecker(pass))
			{
				st.setString(2, pass);
				System.out.print("Enter Number : ");
				String num = sc.next();
				if(num.length()==10 ) {
					long numm = Long.parseLong(num);
					st.setLong(3, numm);
					st.executeUpdate();

					String qry1="Insert into details values(?,?,?)";
					st = con.prepareStatement(qry1);
					st.setLong(1, a);
					st.setInt(2,1000);
					st.setLong(3, numm);
					st.executeUpdate();
					System.out.println("Account created Successfully");
					System.out.println("Your account number is : "+a);

					Lg r = new Login();
					r.login();
				}
				else {
					System.out.println("Please Enter 10 digit Mobile Number");
					signup();
				}
			}
			else {
				System.out.println("Please enter Strong password");
				signup();
			}
		}
		catch(SQLIntegrityConstraintViolationException e)
		{
			System.out.println("Username or Mobile Number already exists");
			//e.printStackTrace();
			signup();
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong ! Please try again");
			signup();
		}
		finally {

			try {
				if(st!=null)
					st.close();
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
	public boolean PassChecker(String pass) {
		boolean b = false;
		boolean num=false,upper=false,lower=false,spes=false,length=false;
		
		 if(pass.length()>=8)
			{
				length=true;
			}
		for(int i=0;i<pass.length();i++)
		{
			if(pass.charAt(i)>='a'&&pass.charAt(i)<='z')
			{
				lower=true;
			}
			else if(pass.charAt(i)>='A'&&pass.charAt(i)<='Z')
			{
				upper=true;
			}
			else if(pass.charAt(i)>='1'&&pass.charAt(i)<='9')
			{
				num=true;
			}
			
			else
			{
				spes=true;
			}
		}
		if(lower&&upper&&num&&spes&&length)
		{
			b=true;
			System.out.println(" Strong password");
		}
		return b;
	}
}
