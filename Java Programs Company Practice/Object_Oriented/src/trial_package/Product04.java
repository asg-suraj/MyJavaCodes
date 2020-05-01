package trial_package;
//The Class is Super Class For Television Class in Same Package
public class Product04 {
	private int id;
	private String name;
	private double price;
	

	public Product04() {
		// Default Const.
	}
	
	


	public Product04(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
	
	public void print() {
		System.out.println("Id = "+id+" name= "+name+" Price= "+price);
	}

}
