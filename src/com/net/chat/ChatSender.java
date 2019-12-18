package com.net.chat;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket ds;
	private int i;
	public ChatSender(DatagramSocket ds, int i) {
		this.ds=ds;this.i=i;
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
		byte[] zjsz;
		try {
			zjsz = str.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.60"),8900);
			System.out.println("开始发送消息...");
			ds.send(packet);

		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	}
}
