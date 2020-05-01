import java.util.*;

class message{
	void messageprint(String name)
	{
		System.out.println("Hello "+ name);
	}
	
}
public class method_widParameters {
	public static void main (String[] args)
	{
		String point;
		Scanner sc =new Scanner(System.in); //System.in means input from system
		System.out.println("Enter ur name");
		point=sc.nextLine();
		message obj =new message();
		obj.messageprint(point);  // passed variable created here only  that should be of same type declared above just name can be changed...
		
		obj.messageprint("Surya");
		
	}

}
