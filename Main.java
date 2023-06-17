package com.sbi.pack1;
import java.util.Scanner;
public class Main{
	static{
		System.out.println("Welcome to SBI");
	}
	public static void main(String[] args) {
		Main ref = new Main();
		ref.start();
	}
	public void start() {
		Scanner sc = null;
		try {
			sc= new Scanner(System.in);
			System.out.println("1 : Login");
			System.out.println("2 : Signup");
			System.out.println("3 : Forgot Password");
			int inp = sc.nextInt();
			switch(inp)
			{
			case 1 : Lg ref1 = new Login();
			ref1.login();
			break;
			case 2 : Sg ref = new Signup();
			ref.signup();
			break;
			case 3 : ForgotPass ref2 = new ForgotPass();
			ref2.forgotpass();
			break;
			default : System.out.println("Invalid input | Please try again ");
			start();
			}
		}
		catch(Exception e) {
			System.out.println("Invalid input | Please try again ");
			start();
		}
		finally {
			sc.close();
			System.gc();
		}
	}

}
