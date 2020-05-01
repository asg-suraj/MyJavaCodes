
public class if_else {

	public if_else() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	
		int num1 , num2;
		num1 = 120;
		num2 = 30;
		
		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		}
		
		else {
			System.out.println("num 1 is smaller than num 2");
		}
		
		
		int year=2001;
		if((year%4 == 0 && year %100 !=0 )|| year %400 == 0 )
			System.out.println("Year " +year + " is leap year");
		else
		{
			System.out.println("Year " +year + " is not a leap year");
		}
		
		
		
	}

}
