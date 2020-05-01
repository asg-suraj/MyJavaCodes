package com.multithreading.programs;
//Runnable is used as Anyonmous Inter class object
public class two {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
//The Same code as one.java and MyThreadClass.java but in single program
			//here Runnable is used as Anyonmous Inter class object
			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("I Am in the Thread"
							+Thread.currentThread().getName()+"The i is"+i);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
					}
				}
				
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("I Am in the Thread"
							+Thread.currentThread().getName()+"The i is"+i);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
					}
				}
				
			}
		});
		
		
		
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("I Am in the Thread"
							+Thread.currentThread().getName()+"The i is"+i);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
					}
				}
				
			}
		});
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
}
