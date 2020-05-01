//package class_objects;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class Customer {
//	// STUDENT CODE BEGINS HERE
//	int CustomerId;
//	String name,city,phone,email;
//	// Default constructor
//    public Customer(){}
//	//Parameterized constructor
//    public Customer(int custid, String name, String city, String phone, String email) {
//	
//		this.CustomerId = custid;
//		this.name = name;
//		this.city = city;
//		this.phone = phone;
//		this.email = email;
//	}
//	
//    
//	public int getCustid() {
//		return CustomerId;
//	}
//	public void setCustid(int custid) {
//		this.CustomerId = custid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Customer)) {
//			return false;
//		}
//		Customer other = (Customer) obj;
//		if (city == null) {
//			if (other.city != null) {
//				return false;
//			}
//		} else if (!city.equals(other.city)) {
//			return false;
//		}
//		if (CustomerId != other.CustomerId) {
//			return false;
//		}
//		if (email == null) {
//			if (other.email != null) {
//				return false;
//			}
//		} else if (!email.equals(other.email)) {
//			return false;
//		}
//		if (name == null) {
//			if (other.name != null) {
//				return false;
//			}
//		} else if (!name.equals(other.name)) {
//			return false;
//		}
//		if (phone == null) {
//			if (other.phone != null) {
//				return false;
//			}
//		} else if (!phone.equals(other.phone)) {
//			return false;
//		}
//		return true;
//	}
//	
//	// STUDENT CODE ENDS HERE
//
//public static void main(String[] args) {
//	 Scanner sc = new Scanner(System.in);
//	    String testString = null;
//	    if(testString==null)
//	    {
//	        System.out.println("[]");
//	    }
//	    else{
//	   String[] p=testString.split(" ");
//		
//		Arrays.sort(p);
//		System.out.println(java.util.Arrays.toString(p));
//	    }
//}
//	
//}