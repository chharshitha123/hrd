package com.edu;
class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
}

public class threaddemo {

	public static void main(String[] args) {
		MyRunnable t1=new MyRunnable();
		Thread ab=new Thread(t1);
		ab.start();
		
		

	}

}
