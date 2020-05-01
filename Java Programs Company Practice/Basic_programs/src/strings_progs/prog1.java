package strings_progs;

public class prog1 {

	public prog1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//1
		String namA ="Vinod";
		//2
		String nameB = new String("Vinod"); 
		
		//Now we can use String Directlly like
		int len = "Suraj".length();
		
//		To get Indivual Charachter from String
		char p = namA.charAt(2);
		
		
		
		
		String name1 = "Surya";
		String name2 = "Surya"; //Due to Interned Pool of Values
		// name2  will Just Reference to name1
		//Hence name1 reference is equal to name 2 reference
		//Therefore
		System.out.println("name1==name2 is "+(name1==name2));
		
		//Now
		//Here it will create Seaprate Blocks
		String name3 = new String("Surya");
		String name4 = new String("Surya"); //But Still using This Is Discouraged
		System.out.println("name3==name4 is "+(name3==name4));
	//	but Also
		System.out.println("name3.equals(name4) is "+(name3.equals(name4)));
		

	}

}
