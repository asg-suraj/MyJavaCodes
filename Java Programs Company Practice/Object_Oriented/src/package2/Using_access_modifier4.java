package package2;

import class_objects.using_access_modifier;

public class Using_access_modifier4 extends using_access_modifier {

	public Using_access_modifier4() {
		// TODO Auto-generated constructor stub
	}
	public void someMethod() {
	//System.out.println("t1.a= "+a); //private Not Accessible
	//	System.out.println("t1.b= "+b); //not Accessible as package Level Access 
		System.out.println("t1.c= "+c); 
		System.out.println("t1.d= "+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	using_access_modifier t1=new using_access_modifier();

//		System.out.println("t1.a= "+t1.a); 
//		System.out.println("t1.b= "+t1.b);
//			System.out.println("t1.c= "+t1.c); 	//not Applicable because of Static method although it is Extending
			System.out.println("t1.d= "+t1.d);
		
		Using_access_modifier4 t2 = new Using_access_modifier4();
	//	System.out.println("t1.a= "+t2.a); //private 
//		System.out.println("t1.b= "+t2.b); //package level Access
		t2.someMethod();
			System.out.println("t1.c= "+t2.c); 
			System.out.println("t1.d= "+t2.d);
	}

}
