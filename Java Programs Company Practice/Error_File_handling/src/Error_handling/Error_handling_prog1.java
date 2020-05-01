package Error_handling;

public class Error_handling_prog1 {

	public Error_handling_prog1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=b=c=0;
	
		try {
			a=b/c;  //Arithmatic Exception 
			//this Exception is Unchecked Exception
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot Divide By Zero");
		}
		finally {
			//whatsoever happen above for try and catch
//			This block will finally Execute
			System.out.println("You are in the Finally block");
		}
	}

}
