package com.api;

public class E54 {

	public static void main(String[] args) {
		String s1="abc55c小b58黑a1b52c3b7aca.jpg";
		System.out.println("数字是：");
		char[] zfsz=s1.toCharArray();
		for(char zf : zfsz) {
			if (zf >='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		for(char zf : zfsz) {
			if (zf >='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
	}
}
