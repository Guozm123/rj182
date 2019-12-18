package com.jbdc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Puthong_query {

	public static void main(String[] args) throws Exception {
				//注册驱动
				Class.forName("com.mysql.jdbc.Driver");
				java.sql.Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbdc","root","gzm123123");
				
				//通过连接对象获得
				Statement yuju=lianjie.createStatement();
				//定义更新SQL 语句
				String sql="select * from tb_user";
				//执行普通查询,得到结果集
				ResultSet rs=yuju.executeQuery(sql);
				System.out.println("id	|	name	|	+set|");
				//遍历结果集
				while (rs.next()) {
					int id=rs.getInt("id");
					String name = rs.getString("name");
					String sex=rs.getString("sex");
					System.out.println(id+"	|	"+name+"	|	"+sex);
					
					
				}

	}

}
