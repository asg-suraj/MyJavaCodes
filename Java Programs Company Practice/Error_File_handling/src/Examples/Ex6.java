//package Examples;
//
//import java.util.Scanner;
//
//public interface Shape {
//double getArea();
//double getPerimeter();
//}
//
// abstract class AbstractShape implements Shape{
//    String colour;
//   
//    public AbstractShape(String colour) {
//		this.colour = colour;
//	}
//
//	@Override
//	public double getArea() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public double getPerimeter() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//    
//    @Override
//	public String toString() {
//		return "colour="+colour;
//	}
//}
//class Rectangle extends AbstractShape{
//	int length;
//    int breadth;
//	public Rectangle(String colour, int length, int breadth) {
//		super(colour);
//		this.length = length;
//		this.breadth = breadth;
//	}
//	@Override
//	public double getArea() {
//		// TODO Auto-generated method stub
//		return length*breadth;
//	}
//	@Override
//	public double getPerimeter() {
//		// TODO Auto-generated method stub
//		return 2*(length+breadth);
//	}
//	@Override
//	public String toString() {
//		return "Rectangle [colour=" + colour +", length="+length+", breadth + "+breadth +"]";
//	}
//	
//	
//	
//}
//
//class Circle extends AbstractShape{
//	int radius;
//
//	public Circle(String colour, int radius) {
//		super(colour);
//		this.radius = radius;
//	}
//
//	@Override
//	public double getArea() {
//		// TODO Auto-generated method stub
//		return Math.PI*radius*radius;
//	}
//
//	@Override
//	public double getPerimeter() {
//		// TODO Auto-generated method stub
//		return 2*Math.PI*radius;
//	}
//
//	@Override
//	public String toString() {
//		return "Circle [ colour=" + colour +", radius=" + radius + "]";
//	}
//	
//	
//}
//public class Ex6{
//	static void printShape(Shape s) {
//		double a,p;
//		if(s instanceof Circle)
//		{
//			a=s.getArea();
//			p=s.getPerimeter();
//			System.out.println("Area: "+a+", Perimeter"+p);
//		}
//		else
//		{
//			a=s.getArea();
//			p=s.getPerimeter();
//			System.out.println("Area: "+a+", Perimeter"+p);
//
//		}
//	}
//	public static void main(String[] args) {
//		String shapeName;
//		String color;
//		Scanner sc =new Scanner(System.in);
//		// if(sc.hasNext())
//		shapeName=sc.next();
//		
//		// if(sc.hasNext())
//		color=sc.next();
//		if (shapeName=="CIRCLE") {
//			int radius;
//		//	if(sc.hasNext())
//			radius= sc.nextInt();
//			Shape s =new Circle(color,radius);
//			printShape(s);
//		} else {
//			int length;
//			int breadth;
//		//	 if(sc.hasNext())
//			length= sc.nextInt();
//			
//		//	 if(sc.hasNext())
//			breadth= sc.nextInt();
//			
//			Shape s = new Rectangle(color, length, breadth);
//			printShape(s);
//		}
//	}
//}
