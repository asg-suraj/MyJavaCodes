package Error_handling;



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
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		if (id<0) {
			throw new RuntimeException("You supplied wrong id");
		}
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if (name==null ||name.trim().length()==0) {
			throw new RuntimeException("Your name cannot be empty ");
		}
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		if (price<1) {
			throw new RuntimeException("You supplied wrong price");
		}
		this.price = price;
	}


	@Override
	public String toString() { //To String Method is Created from Source->Generate_toString
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}

