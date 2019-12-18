package com.thread;
class SaleThread3 implements Runnable{
	private int tickets = 10;
	public void run() {
		while (true) {
			saleTicket();
		}
	}			
	private void saleTicket() {
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
public class Thread_test13 {
	public static void main(String[] args) {
		SaleThread3 saleThread = new SaleThread3();
		new Thread(saleThread,"窗口1").start();
		new Thread(saleThread,"窗口2").start();
		new Thread(saleThread,"窗口3").start();
		new Thread(saleThread,"窗口4").start();
	}

}


