package months;

public class program_02 {

	public program_02() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) {
		int  days=31;
		Months monthEnum;
		monthEnum = Months.April;
		
		
		switch (monthEnum) {
		case FEB:
		case Ferbraury:
			days = 28;
			break;
		case APR:
		case April:
		case AUG:
		case Augest:
		case SEPT:
		case September:
		case NOV:
		case November:
			days = 30;
			break;
	

		}
		System.out.println("The Number of Days in Month "+monthEnum+" are " + days);
	}
}
