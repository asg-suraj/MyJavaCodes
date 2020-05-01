package class_objects;

import trial_package.Product;

public class Counstructors_use {

	public Counstructors_use() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 =new Product(); //Invoking A Default Constructor
		System.out.println(p1);
		Product p2= new Product(1,"Shri",678); //Giving parameters to Parameterized Constructor
		Product p3 = new Product(2, "Shivam");
		System.out.println(p2);
		System.out.println(p3);
	}

}
