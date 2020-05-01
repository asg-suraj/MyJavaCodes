package trial_package;

public class Product {
	public int id;
	public String name;
	public double price;

	public Product() {
//		Default Counstructor
//		Let's Assign Some Default Values
		name="Unknown";
		price=0.0;
	}
	

	public Product(int id, String name, double price) {
//		This is parametrized Constructor
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(int id, String name) {
//		This is also parametrized Constructor with 2 parametrs
		this.id = id;
		this.name = name;
}
	
	


	@Override
	public String toString() { //To String Method is Created from Source->Generate_toString
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
