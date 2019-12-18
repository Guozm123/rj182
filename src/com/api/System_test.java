package com.api;

import java.util.Properties;
import java.util.Set;

public class System_test {

	public static void main(String[] args) {
		Properties shuxing=System.getProperties();
		//system.out.println(shuxing);
		Set<String> shuxingming=shuxing.stringPropertyNames();
		for (String key : shuxingming) {
			String value=System.getenv(key);
			System.out.println(key+"---->"+value);
		}

	}

}
