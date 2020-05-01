package class_objects;

import trial_package.Product2;

public class UsingVariablesInClass2 {

	public UsingVariablesInClass2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product2 p1;  //The Import Statement gets Class Product from Trial Package
		
		p1=new Product2(1); //id is Supplied in Constructor because ID is Final Type in product2
		p1.setName("Suraj");
		p1.setPrice(343);
		
		
		System.out.println("id= " +p1.getId() + " name= "+p1.getName()+" Price=$"+p1.getPrice());
		

//		Also I can take function Print in Product2 class as print
		p1.print1();
		
//		Also can be created Static function but then we can't Directly call like print in above
		Product2.print(p1);
		
		Product2 p2 = new Product2(2);
		p2.setName("Abhishek");
		p2.setPrice(121231);
		
		p2.print1();
//		p2.print(p2); In Java for Static Method we can call by object like this but it is Recommended that 
//		you should use Class Name
		Product2.print(p2);
		
		
	}

}
