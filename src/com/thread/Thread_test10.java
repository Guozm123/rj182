package com.thread;
class YieladThread extends Thread{
	public YieladThread (String name) {
		super(name);
	}
	public void run() {
		for (int i=0;i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if (i==2) {
				System.out.println("线程让步:");
				Thread.yield();
			}
		}
	}
}
public class Thread_test10 {

	public static void main(String[] args) {
		Thread thread1 = new YieladThread("thread1");
		Thread thread2 = new YieladThread("thread2");
		//开启两个线程
		thread1.start();
		thread2.start();
	}
}
