
public class using_operators {

	public using_operators() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
//		Arithmatic , Releational , Logical , etc are some types of Operators
		
		int n1,n2,result;
		n1=10;
		n2 = -2;
		
		int x=-n2;
		System.out.println("x="+x);
	
//		Arithmatic Opertaors
		result = n1+n2;
		System.out.println("sum of -2 and 10 = "+result);
		
		result = n1-n2;
		System.out.println("Subtraction of 10 and -2 = "+result);
		
		result = n1*n2;
		System.out.println("Multiplication of 10 and -2 = "+result);
		
		result = n1/n2;
		System.out.println("Division of 10 by -2 ="+result);
		
		result = n1%n2;
		System.out.println("Remainder after Division of 10 by -2 ="+result);
		
//		Short Circuit Operators
		int count=10;
		count+=1;  //count = count+1;
		System.out.println(count);
		
		count=10;
		count-=1;   //count = count-1;
		System.out.println(count);
		
		count=10;
		count*=2; //count = count*2;
		System.out.println(count);
		
		count=10;
		count%=2; //count = count%2;
		System.out.println(count);
		
		
//		Ternary Operation
	    int j=3;
		System.out.println(j>2 ? "The Condition is True " : "The Condition is False");
//		if J>2 (here TRUE) then first Sentence will be printed else Second Statement Will be printed
		String res = j>2 ? "The Condition is True " : "The Condition is False";
//		here we need to take String Variable To store as both condition o/p is String
		
//		Relational Operators  are" > , < , <= , >= , != , == "
		
		
		
		
	}

}
