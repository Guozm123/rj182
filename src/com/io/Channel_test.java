package com.io;


import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Channel_test {

	public static void main(String[] args) throws Exception {
		RandomAccessFile inFile=new RandomAccessFile("source/tp.jpg","rw");
	FileChannel inChannel = inFile.getChannel();
	RandomAccessFile outfile=new RandomAccessFile("dest1/ll.jpg","rw");
	FileChannel outChannel = outfile.getChannel();
	long transferto = inChannel.transferTo(0,inChannel.size(),outChannel);
	if (transferto>0){
		System.out.println("复制成功");
	}
	//关闭资源
	inFile.close();
	inChannel.close();
	outfile.close();
	outChannel.close();
	}

}
