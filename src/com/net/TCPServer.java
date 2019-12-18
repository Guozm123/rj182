package com.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.mysql.fabric.xmlrpc.Client;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ServerSocket fwqtjz = new ServerSocket(8899);
		while(true) {
			Socket khdtjz = fwqtjz.accept();
			String ip = khdtjz.getInetAddress().getHostAddress();
			int port = khdtjz.getPort();
			System.out.println("和客户端ip地址是"+ip+",端口是"+port+"连接上了来自服务的问候");
			String xinxi="客户端你好，来自服务的问候";
		OutputStream os = khdtjz.getOutputStream();
		os.write(("服务器端向客户做出响应！").getBytes());
		Thread.sleep(5000);
		os.close();
		khdtjz.close();
		}
		
	}

}
