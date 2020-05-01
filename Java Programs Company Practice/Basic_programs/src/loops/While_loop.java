package loops;
public class While_loop {

	public While_loop() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		int num=29;
//		Table of 29
		int i=1;
		while(i<=10) {
			System.out.printf("%d * %d = %d\n" , num , i ,num*i);
			i++;
		}
		
		System.out.println("End Of Program");
	}

}
