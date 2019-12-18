package com.thread;
class TicketWindow2 implements Runnable{
	private int tickets = 100;
	public void run() {
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在售卖第" + tickets--+"张票");			
			}else {break;}
		}
	}
}
public class Thread_test5 {

	public static void main(String[] args) {
		TicketWindow2 tw = new TicketWindow2();
		new TicketWindow("窗口1").start();
		new TicketWindow("窗口2").start();
		new TicketWindow("窗口3").start();
		new TicketWindow("窗口4").start();


	}

}
