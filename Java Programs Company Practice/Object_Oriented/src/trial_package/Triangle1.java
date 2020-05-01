package trial_package;

public class Triangle1 extends Shape1 implements Shape_interface{
//also Implementing Interfaces is learnt here
	public Triangle1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("This is Triangle");

	}

	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of Triangle is 0.5*base*height");

	}

}
