package com.multithreading.programs;
//program about Thread class used in next few programs
public class MyThreadClass extends Thread {

	
	
	
	public MyThreadClass() {
		super();
		// Constructor from superclass 
	}

	public MyThreadClass(String name) {
		super(name);
		// Constructor from superclass 
	}

	//Task can be provided for thread
	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	super.run();
		for (int i = 0; i < 15; i++) {
			System.out.println("I Am in the Thread"
					+Thread.currentThread().getName()+"The i is"+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+" got interrupted");
				break; //if this break not written program three.javaExecutes after the line End of Demo
			}
		}
	}
}
