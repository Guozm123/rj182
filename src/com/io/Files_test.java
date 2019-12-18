package com.io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws Exception {
		Path lujing=Paths.get("D:\\360Downloads333\\444");
		Files.createDirectories(lujing);
		Path wj=Paths.get("D:\\\\360Downloads333\\\\444\\test.txt");
		//Files.createFile(wj);
		List<String> neirong=new ArrayList<String>();
		neirong.add("这是一个测试文件");
		Files.write(wj,neirong,StandardOpenOption.APPEND);
		List<String> list=Files.readAllLines(wj);
		System.out.println("文件的内容为"+list);
		//File file=new File("D:\\D:\\360Downloads333\\444\\test.txt");
		System.out.println("文件大小为"+Files.size(wj)+"个字节");
		
	}

}
