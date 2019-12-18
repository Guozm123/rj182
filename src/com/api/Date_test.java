package com.api;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
public class Date_test {

	
	@SuppressWarnings("unused")
	private static String instant;

	public static void main(String[] args) throws ParseException {
	System.out.println(System.currentTimeMillis());
	Date date1=new Date();
	Date date2=new Date(System.currentTimeMillis());
	Date date3=new Date(System.currentTimeMillis()+1000);
	System.out.println(date1);
	System.out.println(date2);
	System.out.println(date3);

	SimpleDateFormat sdf=new SimpleDateFormat("Gyyy年MM月dd日 HH：mm：ss E");
	System.out.println(sdf.format(date1));
	
	Calendar calendar=Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH)+1;
	int date = calendar.get(Calendar.DATE);
	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);
	System.out.println("当前时间为："+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+ "秒");
	
	calendar.add(Calendar.DATE,100);
	year=calendar.get(Calendar.YEAR);
	month =calendar.get(Calendar.MONTH)+1;
	date =calendar.get(Calendar.DATE);
	hour =calendar.get(Calendar.HOUR);
	minute =calendar.get(Calendar.MINUTE);
	second =calendar.get(Calendar.SECOND);
	System.out.println("一百天以后："+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+ "秒");
	
	SimpleDateFormat sdf1=new SimpleDateFormat("yyy-MM-dd");
	LocalDate ldt=LocalDate.now();
	//sdf1对象来解析当前日期加100天
	//SimpleDateFormat:format方法将Date类的对象格式化为字符串
	//SimpleDateFormat：Parse方法将字符串解析为Date类的对象
	Date date4=sdf1.parse(""+ldt.plusDays(100));
	SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年M月d日");
	System.out.println("一百天以后是"+sdf2.format(date4));
	
	System.out.println("今年是"+Year.now()+"年");
	
	SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM");
	Date date5=sdf3.parse(""+YearMonth.now());
	SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月");
			System.out.println("当前年月时："+sdf4.format(date5));
	
		//输出系统时区
			ZoneId zoneId=ZoneId.systemDefault();
			System.out.println("当前系统时区是"+zoneId);
			
			//Instant:此刻以UTC为基准
			Instant instant=Instant.now();
			System.out.println("当前时间是"+instant);
	}
}
