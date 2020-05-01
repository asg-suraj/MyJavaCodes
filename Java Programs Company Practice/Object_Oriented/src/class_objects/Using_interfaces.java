package class_objects;

import trial_package.Circle2;
import trial_package.Shape_interface; //the Interface is imported
import trial_package.Triangle1;

public class Using_interfaces {

	public Using_interfaces() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		
		Shape_interface s1;    //This is of no problem
		
//		But You cannot create object of Interface as
//		s1= new Shape_interface()
		
		s1=new Circle2(); //This is also of no problem because shape can be circular
		s1.printArea();
		
		s1 = new Triangle1(); //This is also of no problem because shape can be Triangular
		s1.printArea();
		
		
	}

}
