package com.multithreading;

class MyCounter extends Thread{
	private int threadNo;
	
	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	public void run() {
		CountMe();
	}
	public void CountMe() {
		for(int i = 1; i < 9; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + " and thread no is: " + threadNo);
		}
	}
}

public class App {

	public static void main(String[] args) {
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		long startTime = System.currentTimeMillis();
		counter1.start();
		System.out.print("_______________________________");
		counter2.start();
		long endTime = System.currentTimeMillis();
		System.out.print("Total time:" + (endTime-startTime));
	}

}
