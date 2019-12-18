package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception {
		// 定义标准字节输入流
		//InputStream jpsr=System.in;
		//将标准字节输入流转换成字符流
		//InputStreamReader ir=new InputStreamReader(jpsr);
		//将字符流包装成缓冲字符流
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("profile.txt")));
		System.out.println("请输入您的姓名:");
		//	bw.write("请输入您的姓名:");
		
		//System.out.println("请输入年龄:");
		//String line=bReader.readLine();
		//System.out.println("您的年龄是:"+line);
		
		//int age=Integer.parseInt(line);
		//System.out.println("您明年将是"+(age+1)+"岁");
		String line=br.readLine();
		bw.write("您叫"+line);
		br.close();
		bw.flush();
		bw.close();
		
	}

}
