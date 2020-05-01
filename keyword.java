import java.util.*;

public class keyword{
	public static void main(String[] args) {
		String key="";
		Scanner sc =new Scanner(System.in);
		key=sc.nextLine();

//		System.out.println(match("raja", "raja"));

		if(match(key,"printf") || match(key,"scanf") ||match(key,"void"))
	{
		System.out.println(key+" is a keyword");
	}
	else
	{
		System.out.println(key+" is not a keyword");
	}
		
	}




	 static boolean match(String s , String p)
	{
		if(s.equals(p))
		{
			return true;
		}
		return false;
	}
}