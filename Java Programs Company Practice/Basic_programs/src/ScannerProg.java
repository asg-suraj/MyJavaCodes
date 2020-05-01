import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class ScannerProg {


	public ScannerProg() {
		
			
	}
	public static Date getIsoDate(String Message)
	{
	String pattern = "yyyy-MM-dd";	
	SimpleDateFormat sdf =new SimpleDateFormat(pattern);
	System.out.print(Message);
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	sc.close();
	try {
		return sdf.parse(input);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Input is Different");
		return null;
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
////				next functions
//				sc.nextByte(); //takes Byte values
//				sc.nextInt(); //takes Int values
//				sc.next(); //Takes string
//				sc.nextLine();
//				
////				1. like wise sc.nextDouble , nextShort , nextLong , nextBoolean are methods
////				2. any value numbers, symbols are called Tokens
////				3. Any other symbols like whitespaces which used to seaprate tokens are called Delimeters. 				
////				
//				
////				4.has methods ,returns whether entered value(Tokens) is of mentioned Type or Not as boolean value 
//
//				System.out.println(sc.hasNextBoolean()); 
//				System.out.println(sc.hasNextDouble());
//				System.out.println(sc.hasNextInt());
//				System.out.println(sc.hasNext());  //if there is any value Entered or not and Gives O/p
				
				String name;
				int age;
				Date dob;
				double height;
				
				name =sc.nextLine();
				age = sc.nextInt();
				height = sc.nextDouble();
				dob = getIsoDate("enter your Birthdate in YYYY-MM-DD");
				System.out.println("your name is "+name);
				System.out.println("your age is "+age);
				System.out.println("your height is "+height);
				System.out.println("your BirthDate is "+dob);
	}
	

}
