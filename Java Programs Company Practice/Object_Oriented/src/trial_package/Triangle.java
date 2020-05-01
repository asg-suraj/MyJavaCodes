package trial_package;

public class Triangle extends shape {
	private double base;
	private double height;


	public Triangle() {
		// TODO Auto-generated constructor stub
	}


	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("This is a triangle");
	}
	@Override
	public void printArea() {
		// TODO Auto-generated method stub
		System.out.println("The Area of the Triangle is "+0.5*height*base);
	}

}
