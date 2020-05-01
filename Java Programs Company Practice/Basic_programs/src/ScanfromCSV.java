import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanfromCSV {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan =new Scanner(new File("data.csv")); //run this file in command line in Same Directory it will run 
	while (true) {
	try {
		String text = scan.nextLine();
		Scanner sc =new Scanner(text);
		sc.useDelimiter(",");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
	sc.close();	
	} catch (NoSuchElementException e) {
		// TODO: handle exception
			break;
			
	}
		
	}
	
	
	}

}
