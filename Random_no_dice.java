import java.util.*;
public class Random_no_dice{
	public static void main(String[] args) {
		Random dice=new Random();  //the class Random is present in util.* and we have taken object of that class as dice
		int number;

		for(int counter=1 ;counter<= 11;counter++)
		{
			number=dice.nextInt(6);   //it will genrate any random value from 0-5
			System.out.println(number);
			//to get values from 1-6 (as dice can have this values only)all we need to do is
			number=1+dice.nextInt(6);  //	this 1 is illusion for 
			System.out.println(number);

			System.out.println("");
		}
	}
}
