package com.edu;
import java.util.*;
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<=5;++i) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class mythread {

	public static void main(String[] args)  {
		MyThread1 t1=new MyThread1();
		t1.start();
		MyThread1 t2=new MyThread1();
		t2.start();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int res=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("the largest value is:"+res);
		System.out.println("enter the year:");
		
		
		

	}

}
