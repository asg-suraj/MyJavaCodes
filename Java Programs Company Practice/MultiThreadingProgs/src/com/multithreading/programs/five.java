package com.multithreading.programs;

import java.util.ArrayList;
import java.util.List;

public class five {
	private List <String> words = new ArrayList<String>();
	public  void  addwords(String sentence)
	{
		String arr[] = sentence.split("\\s");
		synchronized (words) {  //to use shared resource in multithraded environment
			for (String a: arr)
			{
				words.add(a);
			}	
		}
		
	}
public synchronized void printwords() {  //we can use synchronized here also
	//This synchronized keyword is making threads to create lock on function so that they can happen one after the other 
	//otherwise mixed o/p will be shown Example-- 
	System.out.println(words);
}
public static void main(String[] args) throws Exception {
	five f =new five();
	f.addwords("hello is Hola! in Espaniol");
	f.printwords();
	
	//now for doing this for Multiple times we need to implement Multithreading and 
	//we will use Anyomous Object to declare threads 
	
	Thread t1 =new Thread(new Runnable() {
		
		@Override
		public void run() {
			f.addwords("Vomosh means go ahead in spanish");
	//To access f here in anyonmous object  sometimes you have to declare it as final in main
			//[hello, is, Hola!, in, Espaniol, si, means, yes, in, spanish, Vomosh, means, go, ahead, in, spanish]
			//after synchronized keyword o/p is [hello, is, Hola!, in, Espaniol, Vomosh, means, go, ahead, in, spanish, si, means, yes, in, spanish]
		}
	});
	
Thread t2 =new Thread(new Runnable() {
		
		@Override
		public void run() {
			f.addwords("si means yes in spanish");
			
		}
	});
	
	
	t1.start();
	t2.start();
	
	t1.join();
	t2.join(); //now all will run and main method will be executed at the End
	
	f.printwords();
}
}
