package com.inner;

import javax.rmi.CORBA.Stub;

@FunctionalInterface
interface printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {
	public static void main(String[] args) {
		StringUtils stringUtils=new StringUtils();
		printUpper("Hello",t->stringUtils.printUpperCase(t));
		printUpper("World",stringUtils::printUpperCase);
	}
	
	private static void printUpper(String str, printable pt) {
		pt.print(str);
	}
	

}
