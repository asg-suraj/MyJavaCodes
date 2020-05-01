package trial_package;

public class Product3_methods {
	private int id;
	private String name;
	private double price;

	public void init(int id , String name , double price) { //The Method to be Called....
		if (id<0) {
			throw new RuntimeException("Invalid Input Please Add Id >0");
		}
		this.id=id;
		this.name=name;
		this.price = price;    //here this.id Represents the Value which is Private Declared above 
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("Id = "+id+" name= "+name+" Price=$"+price);
	}

}
