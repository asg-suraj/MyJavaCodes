//constructors
//import java.util.*;

public class pointer_p {
	 static String name;
	static String surname;
	static int p;
	pointer_p()    //Default Constructor....
	{
		name="Srj";
		surname ="grv";
		p=0;
		
	}
	pointer_p(String name ,String Surname)   //parametrized Constructor 
	
	{
			this.name=name;     //this specifies the variable in global (Toh static vala vr declare kelela)
			this.surname=Surname;
	}
	pointer_p(String name ,String Surname,int p)   //parametrized Constructor && Constructor overloading
	
	{
			this.name=name;     //this specifies the variable in global (Toh static vala vr declare kelela)
			this.surname=Surname;
			this.p=p;
	}
	
	public static void main(String[] args) 
	{
		pointer_p point =new pointer_p(); //calling Default constructor
		pointer_p pointp =new pointer_p("raj", "rav");   //calling constructor with parameter
				System.out.println("value in constructor"  +name+" "+surname);
				
				pointer_p point_po =new pointer_p("Suraj", "Gurav",38);
				System.out.println("value in constructor"  +name+" "+surname+ " "+p);

	}
}
