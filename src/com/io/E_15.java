package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.omg.CORBA.PUBLIC_MEMBER;

public class E_15 {
	static HashMap<String,Integer> hMap=new HashMap<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream("18rj2.txt")));
		String xm=br.readLine();
		while (xm!=null) {
			hMap.put(xm,0);
			xm=br.readLine();
		}
		File ml=new File("d:\\18软件2班作业");
		fileDir(ml);
		System.out.println(hMap);
		}
		 private static void fileDir(File ml) {
			 File[] wjsz=ml.listFiles();
			 for(File file : wjsz) {
				 if(file.isDirectory()) {
					 String wjm=file.getName();
					 hMap.forEach((xsm,cs)->{
						 if(wjm.contains(xsm)) {
							 cs=cs+1;
							 hMap.put(xsm,cs);
						 }
					 });
					 fileDir(file);
				 }
			 }
		 }

	}


