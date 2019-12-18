package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

import javax.naming.directory.DirContext;

public class FileList_test {

	public static void main(String[] args) {
		File ml=new File("E:\\java基础");
		fileDir(ml);
	}
		private static void fileDir(File ml) {
			File[] wjsz=ml.listFiles();
			
			for (File file : wjsz) {
				if(file.isDirectory()) {
					fileDir(file);
				}
				else if (file.isFile()) {
					String[] zml=ml.list((dir,name)->name.endsWith(".java"));
					Arrays.stream(zml).forEach(f->System.out.println(f));
				}
			}
		}
				//if(ml.isDirectory()) {
					//String[] zml=ml.list((dir,name)->name.endsWith(".java"));
					//Arrays.stream(zml).forEach(f->System.out.println(f));
				//}

	

	
}
