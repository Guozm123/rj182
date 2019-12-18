package com.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket client = new DatagramSocket(3000);
		String str ="我们遇到什么困难，也不要怕，微笑着面对它，加油，奥利给！";
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket packet = new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.34"),8900);
		System.out.println("开始发送消息...");
		client.send(packet);
		client.close();

	}

}
