package class_objects;

import trial_package.Circle1;
import trial_package.Shape1;
import trial_package.Triangle1;

public class Abstract_method_overriding {
	
	//The Class Containing Abstract methods should be abstract itself

	public Abstract_method_overriding() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Shape1 s1;  //The Refrence variable can be just created for Abstract class
		//The Obeject of Abstract class cannot be creted using new Keyword 
		// s1= new Shape1(); is not valid...
		//so we need to create Indirect Refrence
		
		s1 = new Circle1(3.7); //We Indirectly Created Shape Object as Circle is a shape type
		s1.printArea();
		s1.info();
		
		//Now The Object is pointing to Triangle and hence Shape Object is Behaving as Triangle Object Type just like Circle in Above Sentence
		s1 = new Triangle1();
		s1.info();
		s1.printArea();
	}

}
