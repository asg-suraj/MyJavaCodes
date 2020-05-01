package class_objects;
//The class names will be Quite Problamatic and need to bbe changed
import class_objects.Address;
import class_objects.Customer;
import class_objects.SimpleDate;

public class tpclass {

	public tpclass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Address ad = new Address("N4", "Abad");
		
		SimpleDate sd = new SimpleDate(12, 4, 2019);
		Customer c = new Customer(1, "lion", ad, sd);
		
		System.out.println(c);
	}

}
class SimpleDate{
    static int day;
    static int month;
    static int year;
	public SimpleDate(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDate(int day,int month , int year ) {
		String Date;
		Date=day+"/"+month+"/"+year;
	}
	@Override
	public String toString() {
		return day+"/"+month+"/"+year;
	}
		
	static boolean mnthsDate(int day,int month)
	{
		int totaldays = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
		{
				totaldays=31;
		}
		else if ( month == 4 || month == 6 || month == 9 || month == 11 )
		{
			totaldays=30;
		}  
		else if ( month == 2 )
		{
			totaldays=28;
		}
		
		if (day<=totaldays) {
			return true;
		} else {
			return false;
		}
	}
   static boolean validateDate() {
    	if(year>=2000 && month<=12&&month>=1&&mnthsDate(day,month)) {
    		return true;
    	}
    	
    	else{
    	return false;
    }
    }
}

class Address{
	String area;
	String city;
	public Address(String area, String city) {
		this.area = area;
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "area, city";
	}
	
	
}

class Customer{
	int custId;
	String name;
	Address address = null;
	SimpleDate registrationDate =null;
	public Customer(int custId, String name, Address address, SimpleDate registrationDate) {

		this.custId = custId;
		this.name = name;
		this.address = address;
		this.registrationDate = registrationDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public SimpleDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(SimpleDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		if(address==null || registrationDate==null)
		{
			if (registrationDate==null && address!=null) {
				return "ID : " + custId + ", Name : " + name + "\nAddress : " + address + "\nRegistered on : "
						+ "Unknown" ;
			} else if(registrationDate!=null && address==null){
				return "ID : " + custId + ", Name : " + name + "\nAddress : " + "Unknown" + "\nRegistered on : "
						+ registrationDate ;
			}
			else {
				return "ID : " + custId + ", Name : " + name + "\nAddress : " + "Unknown" + "\nRegistered on : "
						+ "Unknown" ;
			}
		}
		else {
		return "ID : " + custId + ", Name : " + name + "\nAddress : " + address + "\nRegistered on : "
				+ registrationDate ;
		}
		}
}
