package trial_package;

import javax.management.RuntimeErrorException;

@SuppressWarnings("unused")
public class Product2 {
	final private int id;  //use of Final Keyword
	private String name;
	private double price;
	

	public int getId() {
		if(id<=0)
			throw new RuntimeException("Invalid Input");
		
		return id;
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	public void print1(){
		System.out.println("id= " +id + " name= "+name+" Price=$"+price);
//		They can directly access above variable as in same class
	}
	public static void print(Product2 p1) {
		System.out.println("id= " +p1.id + " name= "+p1.name+" Price=$"+p1.price);
		//can't access Directly becuase method is static
		//hence have to get Object of the Class
	}


	public Product2(int _id) {
		// TODO Auto-generated constructor stub
		id=_id;
	}

}
