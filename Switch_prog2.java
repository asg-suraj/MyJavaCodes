import java.util.Scanner;

public class Switch_prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int age=0;
				System.out.println("Enter Any choices 1 or 2");
				Scanner sc=new Scanner(System.in);
				age=sc.nextInt();
				/*
				if(age==1)
				{
					System.out.println("congo 1 year complete ");
				}
				else if(age==2){
					System.out.println("congo two years completed");
				}
				else if(age==3){
					System.out.println("congo two years completed");
				}
				else if(age==4){
					System.out.println("congo two years completed");
				}
				else
				{
					System.out.println("Wrong Statment");
				}
	*/
	
				//The implementations of above Statments can be done by using Switch case 
				
				switch(age)
				{
					case 1:
					System.out.println("Wow 1 year completed");
					break;
					
					case 2:
					System.out.println("Wow 2 year completed");
					break;
					
					case 3:
					System.out.println("Wow 3 year completed");
						break;
						
					case 4:
					System.out.println("Wow 4 year completed");
						break;
						
					case 5:
					System.out.println("Wow 5 year completed");
						break;
						
					case 6:												//cases
					System.out.println("Wow 6 year completed");
						break;
						
					default:
					System.out.println("I dont know how old you are");
			
				}
	}
}


