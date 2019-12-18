package com.jbdc;
import java.sql.DriverManager;
import java.sql.*;



public class Gengxin {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbdc","root","gzm123123");
		
		//通过连接对象获得
		Statement yuju=(Statement) lianjie.createStatement();
		//定义更新sqL 语句
		String sql="UPDATE tb_user SET email = 'jack@163.com' WHERE id = 1";
		//通过语句对象执行SQL
		yuju.execute(sql);
	}

}
