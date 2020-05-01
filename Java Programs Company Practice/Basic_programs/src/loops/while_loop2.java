package loops;

public class while_loop2 {

	public while_loop2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int num=29;
//		Table of 29
		int i=1;
		while(true) {
			System.out.printf("%d * %d = %d\n" , num , i ,num*i);
			i++;
			if(i>10)
				break;
		}
		System.out.println("End Of Program");
	}

}
