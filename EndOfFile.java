import java.util.*;
public class EndOfFile{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s="";
		

				for(int i=1;sc.hasNext()&&s=="quit";i++)  //
				{
					
				 s=sc.nextLine();
					System.out.println(i+" "+s);

				}
				
		



	}
}