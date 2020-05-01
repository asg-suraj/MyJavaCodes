package class_objects;

import trial_package.Circle;
import trial_package.Employee;

public class Using_static_class_members {

	public Using_static_class_members() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(1.23);
		Circle c2=new Circle(2.46);
		Circle c3=new Circle(3.69);
		c1.printArea();
		c2.printArea();
		c3.printArea();
//		To use pi use ctrl+shift+T to see math class and use Math.PI for value of PI
		
		Employee e1 = new Employee();
		Employee e2 = new Employee("Shrinivas",32445);
		System.out.println(e1);
		System.out.println(e2);

		
	}

}
