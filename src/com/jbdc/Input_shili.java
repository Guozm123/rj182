package com.jbdc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Input_shili {

	public static void main(String[] args) throws Exception {
		File file = new File("E:\\java基础\\软件\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for (File file2 : wenjian_jihe) {
			System.out.println(file2);
			if(file2.getName().endsWith("xlsx")) {
				dwj_xlsx(file2);
			}
			else if(file2.getName().endsWith("xlsx")) {
				dwj_xls(file2);
			}
			//System.out.println(file2);
			//dwj(file2);
		}
	}
	public static void dwj(File wjm) throws Exception {
		FileInputStream fin = new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for (int i = 0; i < rows; i++) {
			//读取每一行
			XSSFRow row = sheet.getRow(i);
			//找到第四个单元格
			XSSFCell cell = row.getCell(3);
			//读取这个单元格的值
			String xuehao = cell.getStringCellValue();
			
			if(xuehao.equals("学号"))
			//读取这个单元格的值
			XSSFCell cell16=row.getCell(15);
			String zuo_shili=cell16.getStringCellValue();
			System.out.println(zuo_shili);
			//找到第十六个单元格
			XSSFCell cell17=row.getCell(16);
			//读取这个单元格的值
			String you_shili=cell16.getStringCellValue();
			System.out.println(you_shili);
			
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动获得连接对象
			Connection lianjie=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dddd?characterEncoding=utf8","root","gzm123123");
			//通过连接对象获得语句对象
			//Statement yuju=(Statement) lianjie.createStatement();
			//定义更新SQL语句
			//String sql="UPDATE sheet1 SET `左眼裸眼视力` = '"+zuo_shili+"' WHERE `学号` = '"+xuehao+"'";
			//System.out.println(sql);
			//通过语句对象执行sql
			//yuju.execute(sql);
			//String sql1="UPDATE sheet1 SET `右眼裸眼视力` = '"+you_shili+"' WHERE `学号` = '"+xuehao+"'";
			//System.out.println(sql1);
			//通过语句对象执行sql
			//yuju.execute(sql1);
			PreparedStatement ydy_yuju = (PreparedStatement) lianjie.prepareStatement(""+ "update dddd set ``=?,``=?where ``=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(2, you_shili);
			ydy_yuju.setString(3, xuehao);
	}
}
	}
