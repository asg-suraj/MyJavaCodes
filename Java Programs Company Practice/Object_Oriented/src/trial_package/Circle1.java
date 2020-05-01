package trial_package;

//this program is to Understand the abstract methods and classes

public class Circle1 extends Shape1 {
	
	private double radius;
	public Circle1() {
		
	}

	
	public Circle1(double radius) {
			this.radius = radius;
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("This is Circle");
	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("The Area of The Circle is "+Math.PI*radius*radius);
	}

	//now the class given is extending(Inheriting) abstract class Shape1
	//hence this class needs to Implement all the methods of Shape1 in ou case printArea() and info()
}
