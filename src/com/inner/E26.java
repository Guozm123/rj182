package com.inner;
@FunctionalInterface
interface personBuilder{
	person buildperson(String name);
}
class person {
	private String name;
	public person (String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	}
public class E26 {
	public static void printName(String name,personBuilder builder) {
		System.out.println(builder.buildperson(name).getName());
	}
	public static void main(String[] args) {
		printName("赵丽颖",name->new person(name));
		printName("赵丽颖",person::new);
	}
}
