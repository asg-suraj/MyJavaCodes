package class_objects;

import java.util.*;

import trial_package.Person2;
import trial_package.Product04;
import trial_package.Product05;

//The Java have Default Class java.lang.object which is Extended By all other Classes by Default
//The class is hence Called Cosmic Classs Which Do not have Any Parent
public class Cosmic_class_And_methods {
//here we are trying to use Equals and HashCode From Cosmic Class 
	public Cosmic_class_And_methods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String s1 = new String("Suraj"); // s1 is Object of String Class
		String s2 = new String("Suraj"); // s2 is Object of String Class

		System.out.println("s1==s2 -->" + (s1 == s2));
		System.out.println("s1.equals(s2)-->" + s1.equals(s2)); // here Object Contents are Compared
		// means when s2 is initalized with same string it will not Create another
		// String with Suraj but point to s1's block only

		// Now
//		The Product04 is imported from another Package...
		Product04 p1 = new Product04(1, "Samosa", 15.3);
		Product04 p2 = new Product04(1, "Samosa", 15.3);

		System.out.println("p1==p2 -->" + (p1 == p2));
		System.out.println("p1.equals(p2)-->" + p1.equals(p2));

//		Now we Will override equals method from java.lang.objectand do Something in Product05 which have same code as Product04 with some Addition
		Product05 pro1 = new Product05(1, "Samosa", 15.3);
		Product05 pro2 = new Product05(1, "Samosa", 15.3);

		System.out.println("pro1==pro2 -->" + (pro1 == pro2));
		System.out.println("pro1.equals(pro2)-->" + pro1.equals(pro2));

		System.out.println("----------------------------------------------------------------------");
		System.out.println("p1.hashcode() is " + p1.hashCode());
		System.out.println("p2.hashcode() is " + p2.hashCode());
		int hashprev = p1.hashCode();
		System.out.println("Before overriding\np1.hashcode() is " + hashprev + " \nthe p1.hashcode==p2.hashcode "
				+ (p1.hashCode() == p2.hashCode()));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("After Overriding");
		System.out.println("pro1.hashcode() is " + pro1.hashCode() + " \nthe pro1.hashcode==pro2.hashcode "
				+ (pro1.hashCode() == pro2.hashCode()));
		// here In class Product04 the method is not overriden
//		But for Product05 we have Defined overriden method

//		The toString Method is also from java.lang.object so let's quickly see the method and it's overriding
//		So for this we are using date from java.util.Date
		System.out.println("----------------------------------------------------------------------");
		System.out.println("For toString Method");
		Date dt = new Date();
		System.out.println(dt);
		
		
		Person2 m1 = new Person2("dhana","Jadhav" , "from jagat germany bhartat Parbhani");
		System.out.println(m1); 
//		if toString is not specified in Person2 then it will print trial_package.Person2@33909752
//		But we want to override the toString method in java.lang.object
		
		
		
	}

}
