package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_dest {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("D:\\poem.txt");
		FileWriter fw=new FileWriter("poem1.txt");
		/*for(i=0;i<10000;i++){
		fw.write("再别康桥\r\n");
		fw.write("\t--------徐志摩\r\n");
		fw.write("\r\n");}*/
		char []buff=new char[2048];
		int b=fr.read(buff);
		while (b!=-1) {
			fw.write(buff,0,b);
			b=fr.read(buff);
		}
			fr.close();
			fw.close();
	}

}
