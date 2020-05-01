package com.multithreading.programs;
//explain Deamon Thread
public class DemonThread {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (; ;) { //Endless Infinte Loop
					System.out.println("I Am in the Thread"
							+Thread.currentThread().getName());
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
					}
				}
				
			}
		});
		
		t1.setDaemon(true); //this will kill t1 thread after all threads ends Executing
		t1.start();
		
		for (int j = 0; j < 15; j++) {
			System.out.println("Inside the main (Thread)function");
			Thread.sleep(100);
		}
		
		System.out.println("End Of Demo.");
	}

}
