package class_objects;
//final method can not be overriden
import trial_package.Circle;

public class Method_Overriding {

	public Method_Overriding() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.printArea(); //Method is Overriden 
		c1.info(); //Method is Overriden 
		
		Circle c2 = new Circle(12.22);
		c2.printArea();
		
	}

}
