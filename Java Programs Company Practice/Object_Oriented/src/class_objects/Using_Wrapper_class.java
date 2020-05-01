package class_objects;

public class Using_Wrapper_class {

	public Using_Wrapper_class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		primitives - byte,short , int , long , float , double , char , boolean
		// Wrapper Classes are Byte,Short,Integer,Long,Float,Double,Charachter,Boolean
		
		String str = "101000101";
		int num = Integer.parseInt(str,2);
		System.out.println(num);
		
		
		String str1= "abc123";
		int num1 = Integer.parseInt(str1,16); //16 represents Hexadecimal Numbers
		System.out.println(num1);
		
		int num3=12456;
		System.out.println(" The Number 12456 in Hexadecimal is "+Integer.toHexString(num3));
		System.out.println(" The Number 12456 in Binary is "+Integer.toBinaryString(num3));

	}

}
