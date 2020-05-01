
public class Logical_op {


	public static void main(String args[]) {
		int test=90;
		int point=45;
		int ray=89;
		if(ray<test||ray<point)  //or operator is given by ||
		{
			System.out.println("wah");
		}
		else
		{
			System.out.print("wah re wah");
		}
		

		if(ray<test&&ray<point)  //And operator is given by &&
		{
			System.out.println("wah");
		}
		else
		{
			System.out.print("wah re wah");
		}
	}



}


