package class_objects;

import trial_package.Product04;
import trial_package.Television;

public class Inheritence_use {

	public Inheritence_use() {
		
	}

	public static void main(String[] args) {
		Product04 p1 = new Product04();
		p1.setId(1);
		p1.setName("Priya");
		p1.setPrice(123);
		p1.print();
		
		Television t1 =new Television();
		t1.setId(2); //The object of television is Offering Method of Product class
		t1.setName("Sony");
		t1.setPrice(12345);
		t1.setScreenType("LED");
		t1.setScreenSize(15);
		t1.print(); //The object of television is now Offering Method of it's own class
		
	}

}
