package class_objects;

import trial_package.Product3_methods;

public class UsingMethods {

	public UsingMethods() {
		
	}

	public static void main(String[] args) {
			Product3_methods p1 =new Product3_methods();
		p1.init(1, "Optical Mouse", 123);
		p1.print();
	}

}
