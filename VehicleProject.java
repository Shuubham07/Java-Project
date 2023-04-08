import java.util.* ;
import java.time.*;
import java.time.format.*;
class VehicleProject
{
	
	public static void main(String[] args) 
	{
		
		login ref1 = new login();
		ref1.login();
		System.out.println("Thank you ! Please visit again...");
	
	}
}
class bill
{
	public static void bill()
	{
		/////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		bill ret = new bill();
		System.out.print("Enter your name : ");
		String a = sc.nextLine();
		if (a.matches("[A-Z,a-z, ]+"))
		{
			
			ret.ref(a);	
			
		}
		else
		{
			System.out.println("Name not valid! Please enter details again");
			bill();
		}
	}
		public void ref(String a)
		{
			LocalDateTime now = LocalDateTime.now();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
			String timestamp= now.format(formatter);
			
			/////////////////////////////////////////////////////
			Scanner sc = new Scanner(System.in);
			bill ret = new bill();
			System.out.print("Enter your contact no : ");
			String b = sc.next();
			if (b.length()==10 && b.matches("[0-9]+"))
			{
				
			System.out.println(" ---------Electronic Bill---------");
			System.out.println(" *********************************");
	System.out.println("          Star Automobile         ");
	System.out.println(" *********************************");
	System.out.println(" Customer name : "+ a);
	System.out.println(" Customer contact : "+ b);
	System.out.println(" *********************************");
	System.out.println(" Star Auto Customer Care");
	System.out.println(" Contact Number : +22-23456714");
	System.out.println(" Address : 1A Wall Street NewYork");
	System.out.println(" Booking id : "+ ret.hashCode());
	System.out.println(" Date & time : "+ timestamp );
	System.out.println(" *********************************");
		}
		else
		{
			System.out.println("Number not valid! Please enter details again");
			ret.ref(a);
		}
	
		}
}
class home
{
	static String inp;
	static{
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("|                                                                            |");
		System.out.println("|                        Welcome to Star Automobiles                         |");
		System.out.println("|                                                                            |");
		System.out.println("|----------------------------------------------------------------------------|");
	}
	public void home()
	{
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			You have logged in successfully");
		System.out.println("|----------------------------------------------------------------------------|");
		Scanner sc = new Scanner(System.in);
		do{
		Vehicles ref=new Vehicle();//upcasting 
		ref.test();
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			If you want to perform again enter Y");
		System.out.println("|----------------------------------------------------------------------------|");
		inp=sc.next();
		}while(inp.equals("y")|inp.equals("Y"));
	}
}
class login 
{
	public void login()
		{
	home b = new home();///homepage
	login a = new login();//login method
		Scanner sc = new Scanner(System.in);
		System.out.print("	Enter Username : ");
		String inpuser = sc.nextLine();
		if(inpuser.equals("user")|inpuser.equals("admin")
				|inpuser.equals("manager")){
			a.login1();
		}
		else{
			System.out.println(" Incorrect Username ! Please try again");
			login();
		}
		}
	public void login1()
	{
		Scanner sc = new Scanner(System.in);
		home b = new home();//login
		login a = new login();
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("	Enter Password : ");
		String inppass = sc.next();
			if(inppass.equals("qspiders")|inppass.equals("jspiders"))
			{
				System.out.println("|----------------------------------------------------------------------------|");
				System.out.print("	Confirm Password : ");
				String inp2pass = sc.next();
				if (inppass.equals(inp2pass))
				{
					b.home();
				}
				else{
					System.out.println("|----------------------------------------------------------------------------|");
					System.out.println(" Incorrect Password ! Please try again");
					a.login1();
				}
			}
			else{
				System.out.println(" Incorrect Password ! Please try again");
				a.login1();
			}
	}
	
}
interface Vehicles
{
	void test();
}
class Vehicle implements Vehicles
{
	public void test()
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter type of Vehicle   ||  1 : Bikes  ||  2 : Cars  ");
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.print("Enter value : ");
			//a for bikes  // b : cars
			Bikes bike= new Bikes();
			Cars car= new Cars();
			try {
			int a = scanner.nextInt();
			switch (a)
			{
				case 1 : bike.test();
					break;
				case 2 : car.test1();
					break;
				default : 
					System.out.println("Invalid Input");
					System.out.println("Please Try again");
					Vehicle ref = new Vehicle();
					ref.test();
			}
			}
			catch(Exception e)
			{
				System.out.println("Incorrect input Please try again");
				Vehicle ref = new Vehicle();
				ref.test();
			}
	}
}
class Bikes extends Vehicle
{
	double cc;
	String name;
	double price;
	public void test()	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter the Brand of bike");
		System.out.println("			1 : HeroHonda");
		System.out.println("			2 : Bmw");
		System.out.println("			3 : TVS");
		System.out.println("			4 : Royal Enfield");
		System.out.println("			5 : Suzuki");
		System.out.println("			6 : Yamaha");
		System.out.println("			7 : Bajaj");
		System.out.println("			8 : Kawasaki");
		System.out.println("			9 : Ducati");
		System.out.println("			10 : Benelli");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		try {
		int a=sc.nextInt();
		switch (a)
		{
		case 1 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Hero Honda");
			HeroHonda hero=new HeroHonda();
			hero.test();
		break;
		case 2 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Bmw");
			Bmwbikes bmw=new Bmwbikes();			
			bmw.test();
		break;
		case 3 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered TVS");
			TVS tvs=new TVS();
			tvs.test();
		break;
		case 4 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Royal Enfield");
			RoyalEnfield re=new RoyalEnfield();
			re.test();
		break;
		case 5 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Suzuki");
			Suzuki suzuki = new Suzuki();
			suzuki.test();
		break;
		case 6 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Yamaha");
			Yamaha yamaha = new Yamaha();
			yamaha.test();
		break;
		case 7 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Bajaj");
			Bajaj bajaj = new Bajaj();
			bajaj.test();
		break;
		case 8 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Kawasaki");
			Kawasaki kawasaki = new Kawasaki();
			kawasaki.test();
			break;
		case 9 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Ducati");
			Ducati ducati = new Ducati();
			ducati.test();
			break;
		case 10 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Benelli");
			Benelli benelli = new Benelli();
			benelli.test();
			break;
		default : 
			System.out.println("Invalid Input");
			Bikes ref=new Bikes();
			ref.test();
		
		}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input Please try again");
			Bikes ref1 = new Bikes();
			ref1.test();
		}
	}
	
}
//herohonda bikes 
class HeroHonda extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		String inp ;
		HeroHonda hh = new HeroHonda();
		System.out.println("			Welcome to Herohonda");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : Splendor");
		System.out.println("			Enter 2 : HF Deluxe");
		System.out.println("			Enter 3 : Xtreme");
		System.out.println("			Enter 4 : passionpro");
		System.out.println("			Enter 5 : Xpulse");
		System.out.println("			Enter 6 : Maestro");
		System.out.println("			Enter 7 : Pleasure");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Splendor");
			Splendor splendor=new Splendor();
			splendor.splendordetails();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			inp= sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Splendor! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered HFDeluxe");
			HFDeluxe hfdeluxe=new HFDeluxe();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked HFDeluxe! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Xtreme");
			Xtreme xtreme=new Xtreme();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Xtreme! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 4 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered PassionPro");
			PassionPro passionpro=new PassionPro();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PassionPro! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 5 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Xpulse");
			Xpulse xpulse=new Xpulse();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Xpulse! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 6 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Maestro");
			Maestro maestro= new Maestro();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Maestro! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 7 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Pleasure");
			Pleasure pleasure = new Pleasure();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Pleasure! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : 
			System.out.println("Invalid Input! Please Try again");
			hh.test();				
		
		}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input Please try again");
			HeroHonda ref1 = new HeroHonda();
			ref1.test();
		}
	}
}
class Splendor extends HeroHonda
{
	Splendor()
	{
		this.cc=97;
		this.name="Splendor";
		this.price=83000;
		//splendordetails();
	}
	public void splendordetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Engine capacity : "+cc+ " cc");
		System.out.println("			Bike name : "+name);
		System.out.println("			Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class HFDeluxe extends HeroHonda
{
	HFDeluxe()
	{
		this.cc=97;
		this.name="HF Deluxe";
		this.price=55000;
		HFDeluxedetails();
	}
	public void HFDeluxedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Engine capacity : "+cc+ " cc");
		System.out.println("			Bike name : "+name);
		System.out.println("			Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class Xtreme extends HeroHonda
{
	Xtreme()
	{
		this.cc=163;
		this.name="Xtreme";
		this.price=119900;
		Xtremedetails();
	}
	public void Xtremedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Engine capacity : "+cc+ " cc");
		System.out.println("			Bike name : "+name);
		System.out.println("			Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class PassionPro extends HeroHonda
{
	PassionPro()
	{
		this.cc=110;
		this.name="PassionPro";
		this.price=73500;
		PassionProdetails();
	}
	public void PassionProdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Engine capacity : "+cc+ " cc");
		System.out.println("			Bike name : "+name);
		System.out.println("			Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class Xpulse extends HeroHonda
{
	Xpulse()
	{
		this.cc=199;
		this.name="Xpulse";
		this.price=130000;
		Xpulsedetails();
	}
	public void Xpulsedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Engine capacity : "+cc+ " cc");
		System.out.println("			Bike name : "+name);
		System.out.println("			Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class Maestro extends HeroHonda
{
	Maestro()
	{
		this.cc=124;
		this.name="Maestro";
		this.price=82000;
		Maestrodetails();
	}
	public void Maestrodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Engine capacity : "+cc+ " cc");
		System.out.println("			Bike name : "+name);
		System.out.println("			Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class Pleasure extends HeroHonda
{
	Pleasure()
	{
		this.cc=110;
		this.name="Pleasure";
		this.price=76000;
		Pleasuredetails();
	}
	public void Pleasuredetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Engine capacity : "+cc+ " cc");
		System.out.println("			Bike name : "+name);
		System.out.println("			Ex- Showroom price : Rs "+price+" onwards.");
	}
}

//BMW bikes 
class Bmwbikes extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : G310RR");
		System.out.println("			Enter 2 : G310R");
		System.out.println("			Enter 3 : G310GS");
		System.out.println("			Enter 4 : F900R");
		System.out.println("			Enter 5 : S1000RR");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("	Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : G310RR g310rr=new G310RR();
				System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked G310RR! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 :G310R g310r=new G310R();
				System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked G310R! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 :G310GS g310gs=new G310GS();
				System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked G310GS! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 4 :F900R f900r=new F900R();
				System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked F900R! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;		
		case 5 :S1000RR s1000RR=new S1000RR();
				System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked S1000RR! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : System.out.println("Invalid Input! Please Try again");
		test();
		}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input Please try again");
			Bmwbikes ref1 = new Bmwbikes();
			ref1.test();
		}
		
	}
}
class G310RR extends Bmwbikes
{
	G310RR()
	{
		this.cc=312;
		this.name="G310RR";
		this.price=294982;
		G310RRdetails();
	}
	public void G310RRdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class G310R extends Bmwbikes
{
	G310R()
	{
		this.cc=313;
		this.name="G310R";
		this.price=280939;
		G310Rdetails();
	}
	public void G310Rdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class G310GS extends Bmwbikes
{
	G310GS()
	{
		this.cc=313;
		this.name="G310GS";
		this.price=320556;
		G310GSdetails();
	}
	public void G310GSdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class F900R extends Bmwbikes
{
	F900R()
	{
		this.cc=895;
		this.name="F900R";
		this.price=1254954;
		F900Rdetails();
	}
	public void F900Rdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class S1000RR extends Bmwbikes
{
	S1000RR()
	{
		this.cc=999;
		this.name="S1000RR";
		this.price=2028799;
		S1000RRdetails();
	}
	public void S1000RRdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}

//TVS bikes
class TVS extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Enter 1 : Apache160");
		System.out.println("Enter 2 : Apache200");
		System.out.println("Enter 3 : Raider125");
		System.out.println("Enter 4 : Ntorq125");
		System.out.println("Enter 5 : Jupiter");
		System.out.print("Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Apache160 apache160 = new Apache160(); 
				System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Apache160! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 : Apache200 apache200 = new Apache200();
				System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Apache200! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 : Raider125 raider125 = new Raider125();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Raider125! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 4 : Ntorq125 ntorq125 = new Ntorq125();	System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Ntorq125! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 5 : Jupiter jupiter = new Jupiter();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Jupiter! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : 
			System.out.println("Invalid Input! Please Try again");
			test();
		}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input Please try again");
			TVS ref1 = new TVS();
			ref1.test();
		}
	}
}
class Apache160 extends TVS
{
	Apache160()
	{
		this.cc=159;
		this.name="Apache160";
		this.price=119133;
		Apache160details();
	}
	public void Apache160details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class Apache200 extends TVS
{
	Apache200()
	{
		this.cc=198;
		this.name="Apache200";
		this.price=148000;
		Apache200details();
	}
	public void Apache200details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class Raider125 extends TVS
{
	Raider125()
	{
		this.cc=124;
		this.name="Raider125";
		this.price=91350;
		Raider125details();
	}
	public void Raider125details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class Ntorq125 extends TVS
{
	Ntorq125()
	{
		this.cc=120;
		this.name="Ntorq125";
		this.price=86834;
		Ntorq125details();
	}
	public void Ntorq125details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price : Rs "+price+" onwards.");
	}
}
class Jupiter extends TVS
{
	Jupiter()
	{
		this.cc=124;
		this.name="Jupiter";
		this.price=84577;
		Jupiterdetails();
	}
	public void Jupiterdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//RoyalEnfield bikes
class RoyalEnfield extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : Classic350");
		System.out.println("			Enter 2 : Hunter350");
		System.out.println("			Enter 3 : Bullet350");
		System.out.println("			Enter 4 : ContinentalGT650");
		System.out.println("			Enter 5 : Meteor350");
		System.out.println("			Enter 6 : Himalayan");
		System.out.println("			Enter 7 : Interceptor650");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : 
			Classic350 h = new Classic350();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Classic350! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 : 
			Hunter350 b = new Hunter350();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Hunter350! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 : 
			Bullet350 c = new Bullet350();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Bullet350! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 4 : 
			ContinentalGT650 d = new ContinentalGT650();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked ContinentalGT650! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 5 : 
			Meteor350 e = new Meteor350();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Meteor350! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 6 : 
			Himalayan f = new Himalayan();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Himalayan! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 7 : 
			Interceptor650 g=new Interceptor650();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Interceptor650! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : 
			System.out.println("Invalid Input! Please Try again");
			test();
			
		}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input Please try again");
			RoyalEnfield ref1 = new RoyalEnfield();
			ref1.test();
		}
	}
	
}
class Classic350 extends RoyalEnfield
{
	Classic350()
	{
		this.cc=349;
		this.name="Classic350";
		this.price=190228;
		Classic350details();
	}
	public void Classic350details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Hunter350 extends RoyalEnfield
{
	Hunter350()
	{
		this.cc=349;
		this.name="Hunter350";
		this.price=149900;
		Hunter350details();
	}
	public void Hunter350details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Bullet350 extends RoyalEnfield
{
	Bullet350()
	{
		this.cc=346;
		this.name="Bullet350";
		this.price=150893;
		Bullet350details();
	}
	public void Bullet350details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class ContinentalGT650 extends RoyalEnfield
{
	ContinentalGT650()
	{
		this.cc=648;
		this.name="ContinentalGT650";
		this.price=304911;
		ContinentalGT650details();
	}
	public void ContinentalGT650details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Meteor350 extends RoyalEnfield
{
	Meteor350()
	{
		this.cc=349;
		this.name="Meteor350";
		this.price=200926;
		Meteor350details();
	}
	public void Meteor350details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Himalayan extends RoyalEnfield
{
	Himalayan()
	{
		this.cc=411;
		this.name="Himalayan";
		this.price=215869;
		Himalayandetails();
	}
	public void Himalayandetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Interceptor650 extends RoyalEnfield
{
	Interceptor650()
	{
		this.cc=648;
		this.name="Interceptor650";
		this.price=288107;
		Interceptor650details();
	}
	public void Interceptor650details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Suzuki bikes	
class Suzuki extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : Access125");
		System.out.println("			Enter 2 : Burgman125");
		System.out.println("			Enter 3 : Gixxer");
		System.out.println("			Enter 4 : GixxerSF");
		System.out.println("			Enter 5 : Hayabusa");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("	Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : 
			Access125 h = new Access125(); 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Access125! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 : 
			Burgman125 b = new Burgman125();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Burgman125! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 : 
			Gixxer c = new Gixxer();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Gixxer! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 4 : 
			GixxerSF d = new GixxerSF();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked GixxerSF! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 5 : 
			Hayabusa e = new Hayabusa();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Hayabusa! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : 
			System.out.println("Invalid Input! Please Try again");
			test();
		}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input Please try again");
			Suzuki ref1 = new Suzuki();
			ref1.test();
		}
	}
}
class Access125 extends Suzuki
{
	Access125()
	{
		this.cc=124;
		this.name="Access125";
		this.price=81737;
		Access125details();
	}
	public void Access125details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Burgman125 extends Suzuki
{
	Burgman125()
	{
		this.cc=124;
		this.name="Burgman125";
		this.price=95339;
		Burgman125details();
	}
	public void Burgman125details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Gixxer extends Suzuki
{
	Gixxer()
	{
		this.cc=155;
		this.name="Gixxer";
		this.price=130724;
		Gixxerdetails();
	}
	public void Gixxerdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class GixxerSF extends Suzuki
{
	GixxerSF()
	{
		this.cc=155;
		this.name="GixxerSF";
		this.price=135708;
		GixxerSFdetails();
	}
	public void GixxerSFdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Hayabusa extends Suzuki
{
	Hayabusa()
	{
		this.cc=1340;
		this.name="Hayabusa";
		this.price=1648831;
		Hayabusadetails();
	}
	public void Hayabusadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Yamaha Bikes
class Yamaha extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : MT15");
		System.out.println("			Enter 2 : FZS");
		System.out.println("			Enter 3 : FZ25");
		System.out.println("			Enter 4 : R15");
		System.out.println("			Enter 5 : FZX");
		System.out.println("			Enter 6 : Fascino");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("	Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : 
			MT15 h = new MT15(); 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked MT15! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 : 
			FZS b = new FZS();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked FZS! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 : 
			FZ25 c = new FZ25();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked FZ25! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 4 : 
			R15 d = new R15();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked R15! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 5 : 
			FZX e = new FZX();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked FZX! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 6 : 
			Fascino f = new Fascino();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Fascino! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : 
			System.out.println("Invalid Input! Please Try again");
			test();
		}
	}
	catch(Exception e)
	{
		System.out.println("Incorrect input Please try again");
		Yamaha ref1 = new Yamaha();
		ref1.test();
	}
	}
}
class MT15 extends Yamaha
{
	MT15()
	{
		this.cc=155;
		this.name="MT15";
		this.price=165390;
		MT15details();
	}
	public void MT15details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class FZS extends Yamaha
{
	FZS()
	{
		this.cc=149;
		this.name="FZS";
		this.price=121979;
		FZSdetails();
	}
	public void FZSdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class FZ25 extends Yamaha
{
	FZ25()
	{
		this.cc=249;
		this.name="FZ25";
		this.price=150623;
		FZ25details();
	}
	public void FZ25details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class R15 extends Yamaha
{
	R15()
	{
		this.cc=155;
		this.name="R15";
		this.price=163734;
		R15details();
	}
	public void R15details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class FZX extends Yamaha
{
	FZX()
	{
		this.cc=149;
		this.name="FZX";
		this.price=136716;
		FZXdetails();
	}
	public void FZXdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Fascino extends Yamaha
{
	Fascino()
	{
		this.cc=125;
		this.name="Fascino";
		this.price=80936;
		Fascinodetails();
	}
	public void Fascinodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Bajaj Bikes
class Bajaj extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : Pulsar125");
		System.out.println("			Enter 2 : Pulsar150");
		System.out.println("			Enter 3 : PulsarN160");
		System.out.println("			Enter 4 : PulsarRS200");
		System.out.println("			Enter 5 : PulsarAS200");
		System.out.println("			Enter 6 : PulsarNS200"); 
		System.out.println("			Enter 7 : PulsarNS160");
		System.out.println("			Enter 8 : PulsarNS125");
		System.out.println("			Enter 9 : Platina");
		System.out.println("			Enter 10 : Dominar250");
		System.out.println("			Enter 11 : Dominar400");
		System.out.println("			Enter 12 : PulsarN250"); 
		System.out.println("			Enter 13 : PulsarF250");
		System.out.println("			Enter 14 : Avenger");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("	Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : 
			Pulsar125 b = new Pulsar125();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Pulsar125! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 : 
			Pulsar150 c = new Pulsar150();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Pulsar150! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 : 
			PulsarN160 d = new PulsarN160();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PulsarN160! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 4 : 
			PulsarRS200 e = new PulsarRS200();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PulsarRS200! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 5 : 
			PulsarAS200 f = new PulsarAS200();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PulsarAS200! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 6 : 
			PulsarNS200 g = new PulsarNS200();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PulsarNS200! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 7 : 
			PulsarNS160 h = new PulsarNS160();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PulsarNS160! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 8 : 
			PulsarNS125 i = new PulsarNS125();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PulsarNS125! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 9 : 
			Platina j = new Platina();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Platina! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 10 : 
			Dominar250 k = new Dominar250();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Dominar250! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 11 : 
			Dominar400 l= new Dominar400();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Dominar400! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 12 : 
			PulsarN250 m = new PulsarN250();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PulsarN250! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 13 : 
			PulsarF250 n= new PulsarF250();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked PulsarF250! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 14 : 
			Avenger o = new Avenger();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Avenger! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : 
			System.out.println("Invalid Input! Please Try again");
			test();
		}
	}
	catch(Exception e)
	{
		System.out.println("Incorrect input Please try again");
		Bajaj ref1 = new Bajaj();
		ref1.test();
	}
	}
}
class Pulsar125 extends Bajaj
{
	Pulsar125()
	{
		this.cc=124;
		this.name="Pulsar125";
		this.price=82712;
		Pulsar125details();
	}
	public void Pulsar125details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Pulsar150 extends Bajaj
{
	Pulsar150()
	{
		this.cc=149;
		this.name="Pulsar150";
		this.price=105884;
		Pulsar150details();
	}
	public void Pulsar150details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class PulsarN160 extends Bajaj
{
	PulsarN160()
	{
		this.cc=164;
		this.name="PulsarN160";
		this.price=123006;
		PulsarN160details();
	}
	public void PulsarN160details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class PulsarRS200 extends Bajaj
{
	PulsarRS200()
	{
		this.cc=199;
		this.name="PulsarRS200";
		this.price=171256;
		PulsarRS200details();
	}
	public void PulsarRS200details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class PulsarAS200 extends Bajaj
{
	PulsarAS200()
	{
		this.cc=199;
		this.name="PulsarAS200";
		this.price=90049;
		PulsarAS200details();
	}
	public void PulsarAS200details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class PulsarNS200 extends Bajaj
{
	PulsarNS200()
	{
		this.cc=199;
		this.name="PulsarNS200";
		this.price=142051;
		PulsarNS200details();
	}
	public void PulsarNS200details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class PulsarNS160 extends Bajaj
{
	PulsarNS160()
	{
		this.cc=160;
		this.name="PulsarNS160";
		this.price=124605;
		PulsarNS160details();
	}
	public void PulsarNS160details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class PulsarNS125 extends Bajaj
{
	PulsarNS125()
	{
		this.cc=124;
		this.name="PulsarNS125";
		this.price=105597;
		PulsarNS125details();
	}
	public void PulsarNS125details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Platina extends Bajaj
{
	Platina()
	{
		this.cc=102;
		this.name="Platina";
		this.price=52734;
		Platinadetails();
	}
	public void Platinadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Dominar250 extends Bajaj
{
	Dominar250()
	{
		this.cc=248;
		this.name="Dominar250";
		this.price=177399;
		Dominar250details();
	}
	public void Dominar250details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Dominar400 extends Bajaj
{
	Dominar400()
	{
		this.cc=373;
		this.name="Dominar400";
		this.price=223119;
		Dominar400details();
	}
	public void Dominar400details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class PulsarN250 extends Bajaj
{
	PulsarN250()
	{
		this.cc=249;
		this.name="PulsarN250";
		this.price=144285;
		PulsarN250details();
	}
	public void PulsarN250details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class PulsarF250 extends Bajaj
{
	PulsarF250()
	{
		this.cc=249;
		this.name="PulsarF250";
		this.price=144449;
		PulsarF250details();
	}
	public void PulsarF250details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Avenger extends Bajaj
{
	Avenger()
	{
		this.cc= 220;
		this.name="Avenger Cruise";
		this.price=138999;
		Avengerdetails();
	}
	public void Avengerdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Kawasaki Bikes
class Kawasaki extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : Z900");
		System.out.println("			Enter 2 : H2R");
		System.out.println("			Enter 3 : H2");
		System.out.println("			Enter 4 : ZX_10R");
		System.out.println("			Enter 5 : Ninja 300");
		System.out.println("			Enter 6 : Ninja 400");
		System.out.println("			Enter 7 : Ninja 650");
		System.out.println("			Enter 8 : Ninja 1000");
		System.out.println("			Enter 9 : Z650RS");
		System.out.println("			Enter 10 : W175");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : 
			Z900 h = new Z900(); 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Z900! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 2 : 
			H2R b = new H2R();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked H2R! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 3 :
			H2 c = new H2();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked H2! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 4 : 
			ZX_10R d = new ZX_10R();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked ZX_10R! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 5 : 
			Ninja300 e = new Ninja300();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Ninja300! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 6 : 
			Ninja400 f = new Ninja400();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Ninja400! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 7 : 
			Ninja650 g = new Ninja650();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Ninja650! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 8 : 
			Ninja1000 i = new Ninja1000();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Ninja1000! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 9 : 
			Z650RS j = new Z650RS();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Z650RS! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		case 10 : 
			W175 k = new W175();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked W175! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
			break;
		default :
			System.out.println("Invalid Input! Please Try again");
			test();
		}
	}
	catch(Exception e)
	{
		System.out.println("Incorrect input Please try again");
		Kawasaki ref1 = new Kawasaki();
		ref1.test();
	}
	}
}
class Z900 extends Kawasaki
{
	Z900()
	{
		this.cc= 948;
		this.name="Z900 ";
		this.price=902000;
		Z900details();
	}
	public void Z900details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class H2R extends Kawasaki
{
	H2R()
	{
		this.cc= 998;
		this.name="H2R";
		this.price=7990000;
		H2Rdetails();
	}
	public void H2Rdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class H2 extends Kawasaki
{
	H2()
	{
		this.cc= 998;
		this.name="H2";
		this.price=2301733;
		H2details();
	}
	public void H2details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class ZX_10R extends Kawasaki
{
	ZX_10R()
	{
		this.cc= 220;
		this.name="ZX_10R";
		this.price=1614985;
		ZX_10Rdetails();
	}
	public void ZX_10Rdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Ninja300 extends Kawasaki
{
	Ninja300()
	{
		this.cc= 296;
		this.name="Ninja300";
		this.price=340000;
		Ninja300details();
	}
	public void Ninja300details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Ninja400 extends Kawasaki
{
	Ninja400()
	{
		this.cc= 399;
		this.name="Ninja400";
		this.price=513959;
		Ninja400details();
	}
	public void Ninja400details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Ninja650 extends Kawasaki
{
	Ninja650()
	{
		this.cc= 649;
		this.name="Ninja650";
		this.price=712000;
		Ninja650details();
	}
	public void Ninja650details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Ninja1000 extends Kawasaki
{
	Ninja1000()
	{
		this.cc= 1043;
		this.name="Ninja1000";
		this.price=1209967;
		Ninja1000details();
	}
	public void Ninja1000details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Z650RS extends Kawasaki
{
	Z650RS()
	{
		this.cc= 649;
		this.name="Z650RS";
		this.price=692036;
		Z650RSdetails();
	}
	public void Z650RSdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class W175 extends Kawasaki
{
	W175()
	{
		this.cc= 177;
		this.name="W175";
		this.price=147000;
		W175details();
	}
	public void W175details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Ducati Bikes
class Ducati extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : Panigale");
		System.out.println("			Enter 2 : Supersport");
		System.out.println("			Enter 3 : Monster");
		System.out.println("			Enter 4 : Streetfighter");
		System.out.println("			Enter 5 : Scrambler");
		System.out.println("			Enter 6 : Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : 
			Panigale h = new Panigale(); 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Panigale! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 : 
			Supersport b = new Supersport();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Supersport! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 : 
			Monster c = new Monster();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Monster! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 4 : 
			Streetfighter d = new Streetfighter();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Streetfighter! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 5 : 
			Scrambler e = new Scrambler();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Scrambler! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 6 : 
			Multistrada f = new Multistrada();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Multistrada! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : 
			System.out.println("Invalid Input! Please Try again");
			test();
		}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input Please try again");
			Ducati ref1 = new Ducati();
			ref1.test();
		}
	}
}
class Panigale extends Ducati
{
	Panigale()
	{
		this.cc= 1103;
		this.name="Panigale";
		this.price=2741000;
		Panigaledetails();
	}
	public void Panigaledetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Supersport extends Ducati
{
	Supersport()
	{
		this.cc= 937;
		this.name="Supersport";
		this.price=1575000;
		Supersportdetails();
	}
	public void Supersportdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Monster extends Ducati
{
	Monster()
	{
		this.cc= 937;
		this.name="Monster";
		this.price=1206000;
		Monsterdetails();
	}
	public void Monsterdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Streetfighter extends Ducati
{
	Streetfighter()
	{
		this.cc= 1103;
		this.name="Streetfighter";
		this.price=2215000;
		Streetfighterdetails();
	}
	public void Streetfighterdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Scrambler extends Ducati
{
	Scrambler()
	{
		this.cc= 803;
		this.name="Scrambler";
		this.price=1169000;
		Scramblerdetails();
	}
	public void Scramblerdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Multistrada extends Ducati
{
	Multistrada()
	{
		this.cc= 1158;
		this.name="Multistrada";
		this.price=2148000;
		Multistradadetails();
	}
	public void Multistradadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Benelli Bikes
class Benelli extends Bikes
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 : Imperiale");
		System.out.println("			Enter 2 : TRK");
		System.out.println("			Enter 3 : Leoncino");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		try {
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : 
			Imperiale h = new Imperiale(); 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			String inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Imperiale! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 2 : 
			TRK b = new TRK();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked TRK! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		case 3 : 
			Leoncino c = new Leoncino();
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("		To book this vehicle press Y to exit press any other key");
			 inp = sc.next();
			if (inp.equals("Y")|inp.equals("y"))
			{
				bill.bill();
				System.out.println("You have booked Leoncino! Please visit showroom for further details ");
				System.out.println("|----------------------------------------------------------------------------|");
			}
		break;
		default : 
			System.out.println("Invalid Input! Please Try again");
			test();
		}
		}
		catch(Exception e)
		{
			System.out.println("Incorrect input Please try again");
			Benelli ref1 = new Benelli();
			ref1.test();
		}
	}
}
class Imperiale extends Benelli
{
	Imperiale()
	{
		this.cc= 374;
		this.name="Imperiale";
		this.price=234886;
		Imperialedetails();
	}
	public void Imperialedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class TRK extends Benelli
{
	TRK()
	{
		this.cc= 249;
		this.name="TRK";
		this.price=298977;
		TRKdetails();
	}
	public void TRKdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Leoncino extends Benelli
{
	Leoncino()
	{
		this.cc= 500;
		this.name="Leoncino";
		this.price=554876;
		Leoncinodetails();
	}
	public void Leoncinodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//================Cars====================//
class Cars extends Vehicle
{
	String name;
	double price;
	double cc;
	public void test1()
	{
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("	Sorry for the inconvenience This section is still under Development");
		System.out.println("|----------------------------------------------------------------------------|");
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void test()	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter the Brand of Car");
		System.out.println("			1 for Maruti Suzuki");
		System.out.println("			2 for Mercedes");
		System.out.println("			3 for BMW");
		System.out.println("			4 for Audi");
		System.out.println("			5 for Jeep");
		System.out.println("			6 for Hyundai");
		System.out.println("			7 for Honda");
		System.out.println("			8 for Tata");
		System.out.println("			9 for Mahindra");
		System.out.println("			10 for Land Rover");
		System.out.println("			11 for Jaguar");
		System.out.println("			12 for Ford");
		System.out.println("			13 for Toyota");
		System.out.println("			14 for Volkswagen");
		System.out.println("			15 for Skoda");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a=sc.nextInt();
		switch (a)
		{
		case 1 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Maruti Suzuki");
			MSuzuki ab=new MSuzuki();
			ab.test();
		break;
		case 2 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Mercedes");
			Mercedes b=new Mercedes();			
			b.test();
		break;
		case 3 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered BMW");
			BMW c=new BMW();
			c.test();
		break;
		case 4 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Audi");
			Audi d=new Audi();
			d.test();
		break;
		case 5 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Jeep");
			Jeep e = new Jeep();
			e.test();
		break;
		case 6 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Hyundai");
			Hyundai f = new Hyundai();
			f.test();
		break;
		case 7 :
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Honda");
			Honda g = new Honda();
			g.test();
		break;
		case 8 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Tata");
			Tata h = new Tata();
			h.test();
			break;
		case 9 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Mahindra");
			Mahindra i = new Mahindra();
			i.test();
			break;
		case 10 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered LandRover");
			LandRover j = new LandRover();
			j.test();
			break;
		case 11 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Jaguar");
			Jaguar k = new Jaguar();
			k.test();
			break;
		case 12 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Ford");
			Ford l = new Ford();
			l.test();
			break;
		case 13 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Toyota");
			Toyota m = new Toyota();
			m.test();
			break;
		case 14 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Volkswagen");
			Volkswagen n = new Volkswagen();
			n.test();
			break;
		case 15 : 
			System.out.println("|----------------------------------------------------------------------------|");
			System.out.println("			You have Entered Skoda");
			Skoda o = new Skoda();
			o.test();
			break;
		default : System.out.println("Invalid Input");
		
		}
	}
}

//Maruti Suzuki Cars==================//
class MSuzuki extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Swift");
		System.out.println("			Enter 2 for Dzire");
		System.out.println("			Enter 3 for Ertiga");
		System.out.println("			Enter 4 for Baleno");
		System.out.println("			Enter 5 for Brezza");
		System.out.println("			Enter 6 for Alto"); 
		System.out.println("			Enter 7 for WagonR");
		System.out.println("			Enter 8 for Eeco");
		System.out.println("			Enter 9 for Celerio");
		System.out.println("			Enter 10 for XL6");
		System.out.println("			Enter 11 for Ciaz");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("	Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Swift b = new Swift(); 
		break;
		case 2 : Dzire c = new Dzire();
		break;
		case 3 : Ertiga d = new Ertiga();
		break;
		case 4 : Baleno e = new Baleno();
		break;
		case 5 : Brezza f = new Brezza();
		break;
		case 6 : Alto g = new Alto();
		break;
		case 7 : WagonR h = new WagonR(); 
		break;
		case 8 : Eeco i = new Eeco();
		break;
		case 9 : Celerio j = new Celerio();
		break;
		case 10 : XL6 k = new XL6();
		break;
		case 11 : Ciaz l= new Ciaz();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Swift extends MSuzuki
{
	Swift()
	{
		this.cc= 500;
		this.name="Swift";
		this.price=554876;
		Swiftdetails();
	}
	public void Swiftdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Dzire extends MSuzuki
{
	Dzire()
	{
		this.cc= 500;
		this.name="Dzire";
		this.price=554876;
		Dziredetails();
	}
	public void Dziredetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Ertiga extends MSuzuki
{
	Ertiga()
	{
		this.cc= 500;
		this.name="Ertiga";
		this.price=554876;
		Ertigadetails();
	}
	public void Ertigadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Baleno extends MSuzuki
{
	Baleno()
	{
		this.cc= 500;
		this.name="Baleno";
		this.price=554876;
		Balenodetails();
	}
	public void Balenodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Brezza extends MSuzuki
{
	Brezza()
	{
		this.cc= 500;
		this.name="Brezza";
		this.price=554876;
		Brezzadetails();
	}
	public void Brezzadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Alto extends MSuzuki
{
	Alto()
	{
		this.cc= 500;
		this.name="Alto";
		this.price=554876;
		Altodetails();
	}
	public void Altodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class WagonR extends MSuzuki
{
	WagonR()
	{
		this.cc= 500;
		this.name="WagonR";
		this.price=554876;
		WagonRdetails();
	}
	public void WagonRdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Eeco extends MSuzuki
{
	Eeco()
	{
		this.cc= 500;
		this.name="Eeco";
		this.price=554876;
		Eecodetails();
	}
	public void Eecodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Celerio extends MSuzuki
{
	Celerio()
	{
		this.cc= 500;
		this.name="Celerio";
		this.price=554876;
		Celeriodetails();
	}
	public void Celeriodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class XL6 extends MSuzuki
{
	XL6()
	{
		this.cc= 500;
		this.name="XL6";
		this.price=554876;
		XL6details();
	}
	public void XL6details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Ciaz extends MSuzuki
{
	Ciaz()
	{
		this.cc= 500;
		this.name="Ciaz";
		this.price=554876;
		Ciazdetails();
	}
	public void Ciazdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Mercedes Cars==================//
class Mercedes extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class C_Class extends Mercedes 
{
	C_Class()
	{
		this.cc= 500;
		this.name="C_Class";
		this.price=554876;
		C_Classdetails();
	}
	public void C_Classdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class E_Class extends Mercedes 
{
	E_Class()
	{
		this.cc= 500;
		this.name="E_Class";
		this.price=554876;
		E_Classdetails();
	}
	public void E_Classdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class S_Class extends Mercedes 
{
	S_Class()
	{
		this.cc= 500;
		this.name="S_Class";
		this.price=554876;
		S_Classdetails();
	}
	public void S_Classdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Maybach extends Mercedes 
{
	Maybach()
	{
		this.cc= 500;
		this.name="Maybach";
		this.price=554876;
		Maybachdetails();
	}
	public void Maybachdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class M_Class extends Mercedes 
{
	M_Class()
	{
		this.cc= 500;
		this.name="M_Class";
		this.price=554876;
		M_Classdetails();
	}
	public void M_Classdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class G_Class extends Mercedes 
{
	G_Class()
	{
		this.cc= 500;
		this.name="G_Class";
		this.price=554876;
		G_Classdetails();
	}
	public void G_Classdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class G_Wagon extends Mercedes 
{
	G_Wagon()
	{
		this.cc= 500;
		this.name="G_Wagon";
		this.price=554876;
		G_Wagondetails();
	}
	public void G_Wagondetails(){
		System.out.println("|------------------------------------------ ----------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class AMG extends Mercedes 
{
	AMG()
	{
		this.cc= 500;
		this.name="AMG";
		this.price=554876;
		AMGdetails();
	}
	public void AMGdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}


//BMW Cars==================//
class BMW extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Series_3 extends BMW
{
	Series_3()
	{
		this.cc= 500;
		this.name="Series_3";
		this.price=554876;
		Series_3details();
	}
	public void Series_3details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Series_5 extends BMW
{
	Series_5()
	{
		this.cc= 500;
		this.name="Series_5";
		this.price=554876;
		Series_5details();
	}
	public void Series_5details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Series_7 extends BMW
{
	Series_7()
	{
		this.cc= 500;
		this.name="Series_7";
		this.price=554876;
		Series_7details();
	}
	public void Series_7details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class GT extends BMW
{
	GT()
	{
		this.cc= 500;
		this.name="GT";
		this.price=554876;
		GTdetails();
	}
	public void GTdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class X1 extends BMW
{
	X1()
	{
		this.cc= 500;
		this.name="X1";
		this.price=554876;
		X1details();
	}
	public void X1details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class X3 extends BMW
{
	X3()
	{
		this.cc= 500;
		this.name="X3";
		this.price=554876;
		X3details();
	}
	public void X3details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class X4 extends BMW
{
	X4()
	{
		this.cc= 500;
		this.name="X4";
		this.price=554876;
		X4details();
	}
	public void X4details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class X5 extends BMW
{
	X5()
	{
		this.cc= 500;
		this.name="X5";
		this.price=554876;
		X5details();
	}
	public void X5details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class X6 extends BMW
{
	X6()
	{
		this.cc= 500;
		this.name="X6";
		this.price=554876;
		X6details();
	}
	public void X6details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class X7 extends BMW
{
	X7()
	{
		this.cc= 500;
		this.name="X7";
		this.price=554876;
		X7details();
	}
	public void X7details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class X8 extends BMW
{
	X8()
	{
		this.cc= 500;
		this.name="X8";
		this.price=554876;
		X8details();
	}
	public void X8details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Z4 extends BMW
{
	Z4()
	{
		this.cc= 500;
		this.name="Z4";
		this.price=554876;
		Z4details();
	}
	public void Z4details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class M4 extends BMW
{
	M4()
	{
		this.cc= 500;
		this.name="M4";
		this.price=554876;
		M4details();
	}
	public void M4details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class M5 extends BMW
{
	M5()
	{
		this.cc= 500;
		this.name="M5";
		this.price=554876;
		M5details();
	}
	public void M5details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Audi Cars==================//
class Audi extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Q3 extends Audi
{
	Q3()
	{
		this.cc= 500;
		this.name="Q3";
		this.price=554876;
		Q3details();
	}
	public void Q3details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Q5 extends Audi
{
	Q5()
	{
		this.cc= 500;
		this.name="Q5";
		this.price=554876;
		Q5details();
	}
	public void Q5details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Q7 extends Audi
{
	Q7()
	{
		this.cc= 500;
		this.name="Q7";
		this.price=554876;
		Q7details();
	}
	public void Q7details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class A3 extends Audi
{
	A3()
	{
		this.cc= 500;
		this.name="A3";
		this.price=554876;
		A3details();
	}
	public void A3details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class A5 extends Audi
{
	A5()
	{
		this.cc= 500;
		this.name="A5";
		this.price=554876;
		A5details();
	}
	public void A5details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class A6 extends Audi
{
	A6()
	{
		this.cc= 500;
		this.name="A6";
		this.price=554876;
		A6details();
	}
	public void A6details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class A7 extends Audi
{
	A7()
	{
		this.cc= 500;
		this.name="A7";
		this.price=554876;
		A7details();
	}
	public void A7details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class A8 extends Audi
{
	A8()
	{
		this.cc= 500;
		this.name="A8";
		this.price=554876;
		A8details();
	}
	public void A8details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class R8 extends Audi
{
	R8()
	{
		this.cc= 500;
		this.name="R8";
		this.price=554876;
		R8details();
	}
	public void R8details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class RS5 extends Audi
{
	RS5()
	{
		this.cc= 500;
		this.name="RS5";
		this.price=554876;
		RS5details();
	}
	public void RS5details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class A4 extends Audi
{
	A4()
	{
		this.cc= 500;
		this.name="A4";
		this.price=554876;
		A4details();
	}
	public void A4details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Etron extends Audi
{
	Etron()
	{
		this.cc= 500;
		this.name="Etron";
		this.price=554876;
		Etrondetails();
	}
	public void Etrondetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Jeep Cars==================//
class Jeep extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Compass extends Jeep
{
	Compass()
	{
		this.cc= 500;
		this.name="Compass";
		this.price=554876;
		Compassdetails();
	}
	public void Compassdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Meridian extends Jeep
{
	Meridian()
	{
		this.cc= 500;
		this.name="Meridian";
		this.price=554876;
		Meridiandetails();
	}
	public void Meridiandetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Wrangler extends Jeep
{
	Wrangler()
	{
		this.cc= 500;
		this.name="Wrangler";
		this.price=554876;
		Wranglerdetails();
	}
	public void Wranglerdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class GrandCherokee extends Jeep
{
	GrandCherokee()
	{
		this.cc= 500;
		this.name="GrandCherokee";
		this.price=554876;
		GrandCherokeedetails();
	}
	public void GrandCherokeedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Hyundai Cars==================//
class Hyundai extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class GrandI10Nios extends Hyundai
{
	GrandI10Nios()
	{
		this.cc= 500;
		this.name="GrandI10Nios";
		this.price=554876;
		GrandI10Niosdetails();
	}
	public void GrandI10Niosdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Aura extends Hyundai
{
	Aura()
	{
		this.cc= 500;
		this.name="Aura";
		this.price=554876;
		Auradetails();
	}
	public void Auradetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Verna extends Hyundai
{
	Verna()
	{
		this.cc= 500;
		this.name="Verna";
		this.price=554876;
		Vernadetails();
	}
	public void Vernadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Venue extends Hyundai
{
	Venue()
	{
		this.cc= 500;
		this.name="Venue";
		this.price=554876;
		Venuedetails();
	}
	public void Venuedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class I20 extends Hyundai
{
	I20()
	{
		this.cc= 500;
		this.name="I20";
		this.price=554876;
		I20details();
	}
	public void I20details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Alcazar extends Hyundai
{
	Alcazar()
	{
		this.cc= 500;
		this.name="Alcazar";
		this.price=554876;
		Alcazardetails();
	}
	public void Alcazardetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Tucson extends Hyundai
{
	Tucson()
	{
		this.cc= 500;
		this.name="Tucson";
		this.price=554876;
		Tucsondetails();
	}
	public void Tucsondetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Honda Cars==================//
class Honda extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class City extends Honda
{
	City()
	{
		this.cc= 500;
		this.name="City";
		this.price=554876;
		Citydetails();
	}
	public void Citydetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class WR_V extends Honda
{
	WR_V()
	{
		this.cc= 500;
		this.name="WR_V";
		this.price=554876;
		WR_Vdetails();
	}
	public void WR_Vdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Jazz extends Honda
{
	Jazz()
	{
		this.cc= 500;
		this.name="Jazz";
		this.price=554876;
		Jazzdetails();
	}
	public void Jazzdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Amaze extends Honda
{
	Amaze()
	{
		this.cc= 500;
		this.name="Amaze";
		this.price=554876;
		Amazedetails();
	}
	public void Amazedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class CR_V extends Honda
{
	CR_V()
	{
		this.cc= 500;
		this.name="CR_V";
		this.price=554876;
		CR_Vdetails();
	}
	public void CR_Vdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Tata Cars==================//
class Tata extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Nexon extends Tata
{
	Nexon()
	{
		this.cc= 500;
		this.name="Nexon";
		this.price=554876;
		Nexondetails();
	}
	public void Nexondetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Punch extends Tata
{
	Punch()
	{
		this.cc= 500;
		this.name="Punch";
		this.price=554876;
		Punchdetails();
	}
	public void Punchdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Harrier extends Tata
{
	Harrier()
	{
		this.cc= 500;
		this.name="Harrier";
		this.price=554876;
		Harrierdetails();
	}
	public void Harrierdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Altroz extends Tata
{
	Altroz()
	{
		this.cc= 500;
		this.name="Altroz";
		this.price=554876;
		Altrozdetails();
	}
	public void Altrozdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Tiago extends Tata
{
	Tiago()
	{
		this.cc= 500;
		this.name="Tiago";
		this.price=554876;
		Tiagodetails();
	}
	public void Tiagodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Safari extends Tata
{
	Safari()
	{
		this.cc= 500;
		this.name="Safari";
		this.price=554876;
		Safaridetails();
	}
	public void Safaridetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Tigor extends Tata
{
	Tigor()
	{
		this.cc= 500;
		this.name="Tigor";
		this.price=554876;
		Tigordetails();
	}
	public void Tigordetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Mahindra Cars==================//
class Mahindra extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class XUV300 extends Mahindra
{
	XUV300()
	{
		this.cc= 500;
		this.name="XUV300";
		this.price=554876;
		XUV300details();
	}
	public void XUV300details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class XUV500 extends Mahindra
{
	XUV500()
	{
		this.cc= 500;
		this.name="XUV500";
		this.price=554876;
		XUV500details();
	}
	public void XUV500details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class XUV700 extends Mahindra
{
	XUV700()
	{
		this.cc= 500;
		this.name="XUV700";
		this.price=554876;
		XUV700details();
	}
	public void XUV700details(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Thar extends Mahindra
{
	Thar()
	{
		this.cc= 500;
		this.name="Thar";
		this.price=554876;
		Thardetails();
	}
	public void Thardetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Scorpio extends Mahindra
{
	Scorpio()
	{
		this.cc= 500;
		this.name="Scorpio";
		this.price=554876;
		Scorpiodetails();
	}
	public void Scorpiodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Bolero extends Mahindra
{
	Bolero()
	{
		this.cc= 500;
		this.name="Bolero";
		this.price=554876;
		Bolerodetails();
	}
	public void Bolerodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Alturas extends Mahindra
{
	Alturas()
	{
		this.cc= 500;
		this.name="Alturas";
		this.price=554876;
		Alturasdetails();
	}
	public void Alturasdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Marazzo extends Mahindra
{
	Marazzo()
	{
		this.cc= 500;
		this.name="Marazzo";
		this.price=554876;
		Marazzodetails();
	}
	public void Marazzodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//LandRover Cars==================//
class LandRover extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class RangeRover extends LandRover
{
	RangeRover()
	{
		this.cc= 500;
		this.name="RangeRover";
		this.price=554876;
		RangeRoverdetails();
	}
	public void RangeRoverdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Discovery extends LandRover
{
	Discovery()
	{
		this.cc= 500;
		this.name="Discovery";
		this.price=554876;
		Discoverydetails();
	}
	public void Discoverydetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class DiscoverySport extends LandRover
{
	DiscoverySport()
	{
		this.cc= 500;
		this.name="DiscoverySport";
		this.price=554876;
		DiscoverySportdetails();
	}
	public void DiscoverySportdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Defender extends LandRover
{
	Defender()
	{
		this.cc= 500;
		this.name="Defender";
		this.price=554876;
		Defenderdetails();
	}
	public void Defenderdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Velar extends LandRover
{
	Velar()
	{
		this.cc= 500;
		this.name="Velar";
		this.price=554876;
		Velardetails();
	}
	public void Velardetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Evoque extends LandRover
{
	Evoque()
	{
		this.cc= 500;
		this.name="Evoque";
		this.price=554876;
		Evoquedetails();
	}
	public void Evoquedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Jaguar Cars==================//
class Jaguar extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class XF extends Jaguar
{
	XF()
	{
		this.cc= 500;
		this.name="XF";
		this.price=554876;
		XFdetails();
	}
	public void XFdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class F_pace extends Jaguar
{
	F_pace()
	{
		this.cc= 500;
		this.name="F_pace";
		this.price=554876;
		F_pacedetails();
	}
	public void F_pacedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class F_type extends Jaguar
{
	F_type()
	{
		this.cc= 500;
		this.name="F_type";
		this.price=554876;
		F_typedetails();
	}
	public void F_typedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class E_pace extends Jaguar
{
	E_pace()
	{
		this.cc= 500;
		this.name="E_pace";
		this.price=554876;
		E_pacedetails();
	}
	public void E_pacedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class I_pace extends Jaguar
{
	I_pace()
	{
		this.cc= 500;
		this.name="I_pace";
		this.price=554876;
		I_pacedetails();
	}
	public void I_pacedetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Ford Cars==================//
class Ford extends Cars
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Figo extends Ford
{
	Figo()
	{
		this.cc= 500;
		this.name="Figo";
		this.price=554876;
		Figodetails();
	}
	public void Figodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Endeavour extends Ford
{
	Endeavour()
	{
		this.cc= 500;
		this.name="Endeavour";
		this.price=554876;
		Endeavourdetails();
	}
	public void Endeavourdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Aspire extends Ford
{
	Aspire()
	{
		this.cc= 500;
		this.name="Aspire";
		this.price=554876;
		Aspiredetails();
	}
	public void Aspiredetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Ecosport extends Ford
{
	Ecosport()
	{
		this.cc= 500;
		this.name="Ecosport";
		this.price=554876;
		Ecosportdetails();
	}
	public void Ecosportdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Freestyle extends Ford
{
	Freestyle()
	{
		this.cc= 500;
		this.name="Freestyle";
		this.price=554876;
		Freestyledetails();
	}
	public void Freestyledetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Mustang extends Ford
{
	Mustang()
	{
		this.cc= 500;
		this.name="Mustang";
		this.price=554876;
		Mustangdetails();
	}
	public void Mustangdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Toyota Cars==================//
class Toyota extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Fortuner extends Toyota
{
	Fortuner()
	{
		this.cc= 500;
		this.name="Fortuner";
		this.price=554876;
		Fortunerdetails();
	}
	public void Fortunerdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Innova extends Toyota
{
	Innova()
	{
		this.cc= 500;
		this.name="Innova";
		this.price=554876;
		Innovadetails();
	}
	public void Innovadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Glanza extends Toyota
{
	Glanza()
	{
		this.cc= 500;
		this.name="Glanza";
		this.price=554876;
		Glanzadetails();
	}
	public void Glanzadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Vellfire extends Toyota
{
	Vellfire()
	{
		this.cc= 500;
		this.name="Vellfire";
		this.price=554876;
		Vellfiredetails();
	}
	public void Vellfiredetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Camry extends Toyota
{
	Camry()
	{
		this.cc= 500;
		this.name="Camry";
		this.price=554876;
		Camrydetails();
	}
	public void Camrydetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class UrbanCruiser extends Toyota
{
	UrbanCruiser()
	{
		this.cc= 500;
		this.name="UrbanCruiser";
		this.price=554876;
		UrbanCruiserdetails();
	}
	public void UrbanCruiserdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Volkswagen Cars==================//
class Volkswagen extends Cars
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Vento extends Volkswagen
{
	Vento()
	{
		this.cc= 500;
		this.name="Vento";
		this.price=554876;
		Ventodetails();
	}
	public void Ventodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Polo extends Volkswagen
{
	Polo()
	{
		this.cc= 500;
		this.name="Polo";
		this.price=554876;
		Polodetails();
	}
	public void Polodetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Virtus extends Volkswagen
{
	Virtus()
	{
		this.cc= 500;
		this.name="Virtus";
		this.price=554876;
		Virtusdetails();
	}
	public void Virtusdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Taigun extends Volkswagen
{
	Taigun()
	{
		this.cc= 500;
		this.name="Taigun";
		this.price=554876;
		Taigundetails();
	}
	public void Taigundetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Tiguan extends Volkswagen
{
	Tiguan()
	{
		this.cc= 500;
		this.name="Tiguan";
		this.price=554876;
		Tiguandetails();
	}
	public void Tiguandetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Passat extends Volkswagen
{
	Passat()
	{
		this.cc= 500;
		this.name="Passat";
		this.price=554876;
		Passatdetails();
	}
	public void Passatdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Jetta extends Volkswagen
{
	Jetta()
	{
		this.cc= 500;
		this.name="Jetta";
		this.price=554876;
		Jettadetails();
	}
	public void Jettadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

//Skoda Cars==================//
class Skoda extends Cars 
{
	public void test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("			Enter 1 for Panigale");
		System.out.println("			Enter 2 for Supersport");
		System.out.println("			Enter 3 for Monster");
		System.out.println("			Enter 4 for Streetfighter");
		System.out.println("			Enter 5 for Scrambler");
		System.out.println("			Enter 6 for Multistrada");
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.print("Enter your input : ");
		int a =sc.nextInt();
		switch (a)
		{
		case 1 : Panigale h = new Panigale(); 
		break;
		case 2 : Supersport b = new Supersport();
		break;
		case 3 : Monster c = new Monster();
		break;
		case 4 : Streetfighter d = new Streetfighter();
		break;
		case 5 : Scrambler e = new Scrambler();
		break;
		case 6 : Multistrada f = new Multistrada();
		break;
		default : System.out.println("Invalid Input");
		}
	}
}
class Slavia extends Skoda
{
	Slavia()
	{
		this.cc= 500;
		this.name="Slavia";
		this.price=554876;
		Slaviadetails();
	}
	public void Slaviadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Superb extends Skoda
{
	Superb()
	{
		this.cc= 500;
		this.name="Superb";
		this.price=554876;
		Superbdetails();
	}
	public void Superbdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Octavia extends Skoda
{
	Octavia()
	{
		this.cc= 500;
		this.name="Octavia";
		this.price=554876;
		Octaviadetails();
	}
	public void Octaviadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Kushaq extends Skoda
{
	Kushaq()
	{
		this.cc= 500;
		this.name="Kushaq";
		this.price=554876;
		Kushaqdetails();
	}
	public void Kushaqdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Kodiaq extends Skoda
{
	Kodiaq()
	{
		this.cc= 500;
		this.name="Kodiaq";
		this.price=554876;
		Kodiaqdetails();
	}
	public void Kodiaqdetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}
class Fabia extends Skoda
{
	Fabia()
	{
		this.cc= 500;
		this.name="Fabia";
		this.price=554876;
		Fabiadetails();
	}
	public void Fabiadetails(){
		System.out.println("|----------------------------------------------------------------------------|");
		System.out.println("Engine capacity : "+cc+ " cc");
		System.out.println("Bike name : "+name);
		System.out.println("Ex- Showroom price :  Rs "+price+" onwards.");
	}
}

