package trial_package;

public class Circle  extends shape{ //Also using for method_Overriding Program
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	private double radius;
	static final public double pi=Math.PI; //The Final makes it unchangeable
	//static -- it's Value Become Common for all Objects .it save space by not repeating  
//	To use pi use ctrl+shift+T to see math class and use Math.PI for value of PI
	public Circle() {
		// TODO Auto-generated constructor stub
		
	}
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	
	@Override
		public void info() {
		System.out.println("This is Class Circle, do you want to be circular??");
	}
	public void printArea() {
		double area = pi*radius*radius;
		System.out.println("Area = "+area);
	}

}
