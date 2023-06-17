package com.sbi.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Home {
	
	
	{
		System.out.println("=========Home Page=========");
	}
	private long accno;
	private int bal;
	Home(long accno){
		this.accno=accno;
	}
	String url = "jdbc:mysql://localhost:3306/bank";
	Connection con = null;
	PreparedStatement ps= null;
	ResultSet rs = null;
	Scanner sc =  new Scanner(System.in);
	String inp = null;
	ArrayList arr = new ArrayList();
	int count;

	public void home() throws InputMismatchException {
		System.out.println("Acc no : "+accno);
		System.out.println("1 : Display Balance ");
		System.out.println("2 : Withdraw ");
		System.out.println("3 : Deposit ");
		try {
			String key = sc.next();
			switch (key) {
			case "1":
				displaybal();
				break;
			case "2":
				withdraw();
				break;
			case "3":
				deposit();
				break;
			default: System.out.println("Invalid input Try again");
			home();
			break;
			}
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.gc();
		}

	}
	public void withdraw() {
		System.out.print("Enter the amount you want to withdraw : ");
		int amt = sc.nextInt();
		try {
			String qry = "Select balance from details where accno = ?";
			con = DriverManager.getConnection(url,"root","root");
			ps = con.prepareStatement(qry);
			ps.setLong(1, accno);
			rs = ps.executeQuery();
			if(rs.next())
			{
				bal = rs.getInt(1);
				if(bal>amt) {
					bal -= amt;
					arr.add(-amt);
					ps = con.prepareStatement("Update details set balance= ? where accno = ?");
					ps.setInt(1, bal);
					ps.setLong(2, accno);
					ps.executeUpdate();
					System.out.println("Remaining balance : "+bal);
					System.out.println("Go back to Home press 1");
					inp = sc.next();
					if(inp.equals("1")|inp.equals("1"))
					{
						home();
					}
					else {
						showtransactions();
					}
				}
				else {
					System.out.println("Insufficient Balance");
					home();
				}
			}
		} catch (Exception e) {
			home();
			// TODO Auto-generated catch block
			//e.printStackTrace();
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
	public void deposit() {
		System.out.print("Enter the amount you want to deposit : ");
		int amt = sc.nextInt();
		try {
			String qry = "Select balance from details where accno = ?";
			con = DriverManager.getConnection(url,"root","root");
			ps = con.prepareStatement(qry);
			ps.setLong(1, accno);
			rs = ps.executeQuery();
			if(rs.next())
			{
				bal = rs.getInt(1);
				bal += amt;
				arr.add(amt);
				ps = con.prepareStatement("Update details set balance= ? where accno = ?");
				ps.setInt(1, bal);
				ps.setLong(2, accno);
				ps.executeUpdate();
				System.out.println("Remaining balance : "+bal);
				System.out.println("Go back to Home press 1");
				inp = sc.next();
				if(inp.equals("1")|inp.equals("1"))
				{
					home();
				}
				else {
					showtransactions();
				}
			}
		} catch (Exception e) {
			home();
			// TODO Auto-generated catch block
			//e.printStackTrace();
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
	public void displaybal() {

		try {
			String qry = "Select balance from details where accno = ?";
			con = DriverManager.getConnection(url,"root","root");
			ps = con.prepareStatement(qry);
			ps.setLong(1, accno);
			rs = ps.executeQuery();
			if(rs.next())
			{
				bal = rs.getInt(1);
				System.out.println("Your account balance is : "+bal);
				System.out.println("Go back to Home press 1");
				inp = sc.next();
				if(inp.equals("1")|inp.equals("1"))
				{
					home();
				}
				else {
					showtransactions();
				}
			}
		} catch (Exception e) {
			home();
			// TODO Auto-generated catch block
			//e.printStackTrace();
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
	public void showtransactions() {
		Random r = new Random();
		long rc= 100000+r.nextInt(90000);
		 LocalDateTime current = LocalDateTime.now();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		 String formattedDateTime = current.format(formatter);
		if(arr.size()>0) {
			System.out.println("Date & Time : "+ formattedDateTime);
			System.out.println("==================");
			System.out.println("Your recent transactions");
		}
		for(int i=arr.size()-1;i>=0;i--)
		{
			int amt = (int)arr.get(i);
			if(amt>0)
			{
				System.out.println("Deposit : "+amt);
			}
			else {
				System.out.println("Withdraw : "+ (-amt));
			}
		}
		System.out.println("==================");
		System.out.println("Receipt no : "+ rc);
		System.out.println("Thank you !");
	}
}
