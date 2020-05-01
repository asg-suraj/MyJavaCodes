package class_objects;

import trial_package.*;

public class MultiLevelInheritence {
//	Person<-Employee2<-Manager The Inheritence is in this fashion
	

	public MultiLevelInheritence() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Manager m1 = new Manager();
		//int d=10;
		m1.setName("Pal");
		m1.setCity("Paris");
		m1.setId(1);
		m1.setSalary(1234567);
		m1.setPost("junior manager");
		System.out.println(m1); //Manager object is able to access both Employee Class and Person Class Methods 
//		System.out.printf("%-15s%03d%n", s1, x); where s is for String ,-15 is for Spaces After and  n mean new line
		
		
		
	}

}
