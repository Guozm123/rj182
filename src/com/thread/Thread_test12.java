package com.thread;

import java.util.concurrent.locks.Lock;

class SaleThread2 implements Runnable{
	private int tickets = 10;
	Object lock = new Object();
	public void run() {
		while (true) {
			synchronized (lock) {
			if (tickets > 0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
				}
			}
		}
	}
}
public class Thread_test12 {

	public static void main(String[] args) {
		SaleThread2 saleThread = new SaleThread2();
		new Thread(saleThread,"窗口1").start();
		new Thread(saleThread,"窗口2").start();
		new Thread(saleThread,"窗口3").start();
		new Thread(saleThread,"窗口4").start();
	}

}

