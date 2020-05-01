package class_objects;

import trial_package.Product;

public class UsingVariablesInClass {

	public UsingVariablesInClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Product p1;  //The Import Statement gets Class Product from Trial Package
		
		p1=new Product();
		p1.id=1;
		p1.name="Suraj";
		p1.price=123;
		System.out.println("id= " +p1.id + " name= "+p1.name+" Price=$"+p1.price);
	}
}
