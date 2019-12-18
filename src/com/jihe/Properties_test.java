package com.jihe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pps=new Properties();
		pps.load(new FileInputStream("d:\\test.Properties"));
		pps.forEach((k,v)->System.out.println(k+"="+v));
		FileOutputStream out=new FileOutputStream("d:\\test.Properties");
		pps.setProperty("charset","UTF-8");
		pps.store(out,"新增charset编码");
	}

}
