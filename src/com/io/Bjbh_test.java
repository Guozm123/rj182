package com.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.Line;

public class Bjbh_test {

	public static void main(String[] args) throws Exception {
		Path wj=Paths.get("D:\\班级信息.txt");
		Path bjmc=Paths.get("D:\\求班级编号.txt");
		Path bjbh=Paths.get("D:\\班级编号.txt");
		List<String> neirong=new ArrayList<>();
		Files.createFile(bjbh);
		List<String> lines=Files.readAllLines(wj);
		List<String> names=Files.readAllLines(bjmc);
		Map<String,String> map=new HashMap<>();
		//System.out.println("文件的内容为"+list);
		//System.out.println("文件大小为"+Files.size(wj)+"个字节");
		for (String line : lines) {
			String[] zfcsz=line.split("\t");
			map.put(zfcsz[1],zfcsz[0]);	
			}
		for(String name:names) {
			neirong.add(map.get(name));
		}
		Files.write(bjbh,neirong,StandardOpenOption.APPEND);
	}
}
