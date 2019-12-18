package com.thread;
import java.util.concurrent.locks.*;
class LockThread implements Runnable{
	private int tickets = 10;
	private final Lock lock= new ReentrantLock();
	public void run() {
		while (true) {
		lock.lock();
			if (tickets > 0) {
				try {
					Thread.sleep(100);
					
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
					}
				}
				if (tickets>0) {
					System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
				}
			}
		}
	}

public class Thread_test14 {

	public static void main(String[] args) {
		SaleThread saleThread = new SaleThread();
		new Thread(saleThread,"窗口1").start();
		new Thread(saleThread,"窗口2").start();
		new Thread(saleThread,"窗口3").start();
		new Thread(saleThread,"窗口4").start();

	}

}
