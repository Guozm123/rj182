package com.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.io.Person;

public class ObjectOutputStream_test {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:\\obj.txt"));
		Person p1=new Person("mike",40);
		out.writeObject(p1);
		//
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\obj.txt"));
		Person person=(Person)in.readObject();
		System.out.println("name="+person.getName());
		System.out.println("age="+person.getAge());
	}

}
