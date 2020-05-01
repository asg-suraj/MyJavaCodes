package com.multithreading.programs;

public class join_program {
	public static void main(String[] args) throws Exception {
		Thread t1 = new MyThreadClass("MTC-1");
		t1.start();
		
		t1.join(); //if this statement is not written then t1.start will execute after End of Demo line 
		//meaning this statement actually makes Main Thread wait for thread t1
		System.out.println("End of Demo");
	}

}
