package months;

public class switch_case {

	public switch_case() {

	}

	public static void main(String[] args) {

		int month = 2, days;

		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 10:
		case 12:
		case 8:
			days = 31;
			break;
		default:
			days = -1;
		}

		if (days == -1) {
			System.out.println("Invalid Month");
		} else {
			System.out.println("valid Month with " + days + " days");

		}
	}

}

//switch(month)
//{
//case 2:
//	days=28;
//case 4:
//case 6:
//case 9:
//case 11:
//	days=30;
//case 1: case 3: case 5: case 7: case 10: case 12: case 8:
// days=31
//	default:
//		days=-1;

//in this condition no matter What month u put answer is all statemtns after that because of not using break
// Ex- if month=2 it will make days=28 and again it wi;; assign
//}
