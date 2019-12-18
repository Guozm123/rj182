package com.api;

public class Zfc_test {

	public static void main(String[] args) {
		String zfc=new String("Helloworld");
		/*for (int i=zfc,length()-1;i>=0;i--){
		 if (zfc.charAt(i)>='a'&&zfc.charAt(i)<='z')
		 	system.out.print((char)(zfc.charAt(i)-32));
		 else if (zfc.charAt(i) >='A'&&zfc.charAt(i)<='Z');
		 system.out.print((char)(zfc.charAt(i)+32));
		 
		 }*/
		StringBuffer sb=new StringBuffer();
		char[] zfsz=zfc.toCharArray();
		for (int i=zfsz.length-1;i>=0;i--) {
			char zf = zfsz[i];
			if (Character.isUpperCase(zf)) {
				String zfc1=(""+zf).toLowerCase();
				sb.append(zfc1);
			}
			else if(Character.isLowerCase(zf)) {
				String zfc2=(""+zf).toUpperCase();
				sb.append(zfc2);
			}
		}
		System.out.println(sb);
	}

}
