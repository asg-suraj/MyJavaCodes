package class_objects;

import trial_package.Person2;

public class Cloning_objects {

	public Cloning_objects() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2("Suraj", "Gurav", "Pune");
		System.out.println(p1);

		Person2 p2;
		p2 = p1.replicate(); // The Object is Now Clonned The method is overriden in person2
		// For More info Please see trial_package.Person2
		System.out.println(p2);
		System.out.println("p1.equals(p2) " + p1.equals(p2));
		// Again Keep Note that we needed to Override the Equals Method in person2
	}

}
