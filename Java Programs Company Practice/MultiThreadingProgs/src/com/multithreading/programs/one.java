package com.multithreading.programs;
//first program of showing multiThreading
public class one extends Thread {
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println("The Thread run is Started");
//		System.out.println(100);
//		System.out.println("The Thread run is Ended");
//	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new MyThreadClass("My Thread class 1");
		Thread t2 = new MyThreadClass("My Thread class 2");
		Thread t3 = new MyThreadClass("My Thread class 3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}