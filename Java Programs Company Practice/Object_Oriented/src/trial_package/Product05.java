package trial_package;

public class Product05 {

	

	private int id;
	private String name;
	private double price;
	

	public Product05() {
		// Default Constructor
	}
	
	
//	here we are overriding equals method for Cosmic_class_And_methods to make it True... 
//	because it is Technically true but because of Defination it was returning False there
//	In Cosmic_class_And_methods Pro1 represents this Overriding
	
	/*@Override
	public boolean equals(Object obj) { //equals Method is Overriden
		if(obj==null)
		return false;
		
		if(!(obj  instanceof Product05))
			return false;
		
		Product05 other = (Product05) obj;
		if(this.id!=other.id) {
			return false;
		}
		if(this.name!=other.name)
			return false;
		
		if(this.price!=other.price)
		return false;
		
		return true;
	}
	//The Method Written above is written by me which is also Correct 
//	But we are going to use Eclipse's Source->Generate equals and hashcode and use it to Override which is Written Below
*/
/*	@Override
	public int hashCode() {
		return id; //Written By me
	}
*/
	
	@Override
	public int hashCode() { //overriden Method made by Eclipse For Us
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) { //overriden Method made by Eclipse For Us press Alt+shift+s press Generate equals and hashcode
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product05)) {
			return false;
		}
		Product05 other = (Product05) obj;
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		return true;
	}
	
	
	public Product05(int id, String name, double price) {
//	Constructor	
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
