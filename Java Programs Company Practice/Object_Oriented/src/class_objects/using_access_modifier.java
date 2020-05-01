package class_objects;

public class using_access_modifier {
//let's Declare all types of Variables like public,private,protected,package level
	private int a = 1;
	int b = 2;   //this is called package level access access modifier
	protected int c = 3;
	public int d = 4;

	public using_access_modifier() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		using_access_modifier t1=new using_access_modifier();
		System.out.println("t1.a= "+t1.a+"\nt1.b= "+" "+t1.b+"\n"+"t1.c= "+t1.c+"\nt1.d= "+" "+t1.d);
	}
}
