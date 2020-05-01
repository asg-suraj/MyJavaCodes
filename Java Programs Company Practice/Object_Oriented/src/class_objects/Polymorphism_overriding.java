package class_objects;

import trial_package.Circle;
import trial_package.Triangle;
import trial_package.shape;

//Polymorphism means many forms

public class Polymorphism_overriding {

	public Polymorphism_overriding() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		shape s1 =new shape();
		s1.info();
		s1.printArea();
		
		s1 = new Circle(12); //as Circle Extends shape so
		//means A Circle can be a Shape
		s1.info();  //in Circle the method is Overriden
		s1.printArea(); //in Circle the method is Overriden
		
		s1 = new Triangle(4,7.5);
		s1.info(); //in Circle the method is Overriden
		s1.printArea(); //in Circle the method is Overriden 
		
		
	}

}

/*
//The Interface can be used in this Way
//or we can use Abstract Class 
public interface Shape{
	 double PI=3.1416;  //It is Automatically Detect as public static final;
	 double getArea();
}
public class circle implements Shape{
	private double radius;
	public circle(double radius) {
		this.radius=radius;
	}
	@Override
	public double getArea() {
		
		return PI*radius*radius;
	}
}

*/




/*
 
 Public abstract Class Shape(){
 
 double PI=3.1416;
 public abstract double getArea();
 }
 //Instead of above we can also use Interface
 
 public class Circle extends Shape(){
 private double radius;
 
 @override
 public double getArea(){
 return PI*radius*radius;
 }
 
 }
 */
