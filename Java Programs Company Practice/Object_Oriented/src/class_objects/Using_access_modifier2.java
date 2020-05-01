package class_objects;

public class Using_access_modifier2 {

	public Using_access_modifier2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		using_access_modifier t1=new using_access_modifier();

	//	System.out.println("t1.a= "+t1.a); //it is private in using_access_modifier so cannot accessed
		System.out.println("t1.b= "+t1.b);
		System.out.println("t1.c= "+t1.c);
		System.out.println("t1.d= "+t1.d);
	}

}
