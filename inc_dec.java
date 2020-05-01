import java.util.Scanner;
public class inc_dec {
	
	public static void main(String args[]) {
		int mar=0;
		int latha=0;
		// System.out.println(mar);  // if mar++ is written then 0 displayed just Because operator prcedance 
		int p=0;							// mar++ prints 1
		 p=mar++;
		System.out.println(mar);
		System.out.println(p);
		p=++mar;
		System.out.println(mar);
		System.out.println(p);
		
		
		 p=mar--;
			System.out.println(mar);
			System.out.println(p);
			p=--mar;
			System.out.println(mar);
			System.out.println(p);
	//Shortcut methods
			mar+=8; //mar=mar+8 asssignment varable
			System.out.println(mar);

			mar-=5; //mar=mar-5 asssignment varable
			System.out.println(mar);

			mar*=8; //mar=mar*8 asssignment varable
			System.out.println(mar);

	}
	
}
