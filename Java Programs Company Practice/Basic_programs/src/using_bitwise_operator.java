
public class using_bitwise_operator {

	public using_bitwise_operator() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
	int num1, num2;
	num1 = 65;
	System.out.println(num1 << 1); // left Shift Operator used
	
//	 65 in binary     1000001
//	after left Shift 10000010  which is 130
	
	num2=65;
	System.out.println(num2 << 3);  // will now print 520 
//	Similarly Right Shift can be used
	
	
	short x1=64,x2=32;
	
	System.out.println(x1  &  x2);  //bitwise and 
	//each 0 or 1 in x1 is AND with x2's 0 and 1 
	System.out.println(x1  | x2);  //bitwise OR
	//Similarly Bitwise OR
	
	//bitwise Not 
	System.out.println(~x1 +" Binary Complement of 32 is "+ ~x2 );  //bitwise NOT


	
	
	}
}
