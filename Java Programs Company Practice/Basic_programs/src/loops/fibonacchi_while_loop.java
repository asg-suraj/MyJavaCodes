package loops;

public class fibonacchi_while_loop {

	public fibonacchi_while_loop() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		//fibonachi Series 0 , 1, 1,2,3,5
		
		int a=-1;
		int b=1;
		int c;
		int limit=100;
		
		while(true)
		{
			 c=a+b;
			
			if(c>limit)  // it will print all fibonacchi Series Number till Limit here it is 100
				break;
			a=b;
			b=c;
			System.out.println(c);
		}
				
	}

}
