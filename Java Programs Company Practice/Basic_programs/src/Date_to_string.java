import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date_to_string {

	public Date_to_string() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt = new Date();
		System.out.println(dt); //prints Date time Year day etc
		
		
		
		DateFormat df;
		df= DateFormat.getDateInstance();
		System.out.println(df.format(dt)); //only prints Date
		
		df=DateFormat.getDateTimeInstance();
		System.out.println(df.format(dt));
		
		df=DateFormat.getTimeInstance();
		System.out.println(df.format(dt));
		
		df= DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(dt));
		
		df= DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(dt));
		
		df= DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(dt));
		
		df= DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(dt));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(dt));
		sdf.setLenient(false);
		
		SimpleDateFormat sdft = new SimpleDateFormat("EEE dd-MM-yyyy");
		System.out.println(sdft.format(dt));
		
		SimpleDateFormat sdfm = new SimpleDateFormat("EEEE dd-MM-yyyy");
		System.out.println(sdfm.format(dt));
	
		SimpleDateFormat sdfp = new SimpleDateFormat("EEEE dd-MMM-yyyy");
		System.out.println(sdfp.format(dt));
		
		SimpleDateFormat sdfo = new SimpleDateFormat("EEEE dd-MMMM-yyyy");
		System.out.println(sdfo.format(dt));
		
		
		System.out.println("Enter your Date Of Birth in DD-MM-YYYY");
		Scanner sc =new Scanner(System.in);
		String input =sc.nextLine();
		
		try {
			dt=sdf.parse(input);
		} catch (ParseException e) {
		System.out.println("Values are wrong");
		}
		sc.close();
	}

}
