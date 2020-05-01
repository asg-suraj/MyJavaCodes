package com.multithreading.programs;
//Example of Interrupt
public class three  {
public static void main(String[] args) throws Exception{
	Thread t1 = new MyThreadClass("MTC -1");
	Thread t2 = new MyThreadClass("MTC -2");
	t1.start();
	t2.start();
	
	Thread.sleep(500);
	t1.interrupt();
	
	Thread.sleep(500);
	t2.interrupt();
	
	System.out.println("End Of Demo");
}
}
