package com.yichang;
class BlcException extends Exception{

	public BlcException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BlcException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
public class E31 {
	public static int divide(int x, int y)throws 	BlcException{
		if(y<=0) {
			throw new BlcException("输入的信息错误");
		}
		int result = x/y;
		return result;
	}
	public static void main(String[] args) {
		int result;
		try {
			result = divide(4,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(""+e.getMessage());
		}
	}
}
