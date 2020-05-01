package class_objects;

import trial_package.Television;

public class Using_Constructor_in_Inheritence {
	public Using_Constructor_in_Inheritence() {
		// TODO Auto-generated constructor stub

	}
public static void main(String[] args) {
	Television t1 = new Television();
	t1.print();
	

	Television t2 = new Television(12,"mi Tv",12345,"LED",15);
	t2.print();
}
}
