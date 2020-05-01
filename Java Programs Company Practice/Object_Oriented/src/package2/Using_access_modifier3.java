package package2;

import class_objects.using_access_modifier;

public class Using_access_modifier3 {

	public Using_access_modifier3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		using_access_modifier t1=new using_access_modifier();
		
		//The b variable is Package Level
//		it is public within package and private Outside a class
//		so we Cannot use b in this Package
		//System.out.println("t1.b= "+t1.b);
		
		
//		The C variable is Protected it cannot be used Outside the Package
	//System.out.println("t1.c= "+t1.c);
		System.out.println("t1.d= "+t1.d); //The public variable can be accessed from Anywhere
	
	}

}
