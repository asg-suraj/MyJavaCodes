//the all this programs are learned from thenewboston
//This is program that illustartes we can use array as Counter
//here Dice is thrown at Random and we are measuring frequency of each face from 1-6

import java.util.*;
public class Random_no_dice_freq 
{
	public static void main(String[] args) {
		Random dice =new Random();
		int freq[]=new int[7];  //we are taking this Number 7 because there are 6 faces in dice and we allocate each index as face except 0 

		for(int roll=1;roll<=1000;roll++)
		{
			++freq[1+dice.nextInt(6)];   //it will increment value at index by one (here index is showing dice face Numbers)
		}
		System.out.println("face numbers\tfrequency");
		for(int face=1;face<7;face++)
		{
			System.out.println(i+"\t\t"+freq[face]);
		}
	}
}