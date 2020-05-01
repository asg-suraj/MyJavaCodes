public class var_length_method{
	public static void main(String[] args) {
		System.out.println(average(12,13,15,17,23,2,34,56,67));  //here finding AVERAGE via following Method.... 
	}
	public static int average(int...numbers) {   //this ... specifies We dont know exact Number of arguments so we can take any.....
		int total=0;
		for(int x:numbers)
		{
			total+=x;
		}
		return total/numbers.length;   //'.length' measures the number of arguments passed 
	}
}