package com.jhart;

public class Course {
	private String course_id;//课程ID属性
	private String course_name;//课程名属性
	private String course_book;//参考教材属性
	//读取课程ID
	public String getCourse_id() {
		return course_id;
	}
	//设置课程ID
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	//读取课程名
	public String getCourse_name() {
		return course_name;
	}
	public Course() {}//无参数
	//有参数
	public Course(String course_name, String course_book) {
		super();
		this.course_name = course_name;
		this.course_book = course_book;
	}
	//设置课程名
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	//读取参考教材
	public String getCourse_book() {
		return course_book;
	}
	//设置参考教材
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}
	
}
