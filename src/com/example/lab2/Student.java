package com.example.lab2;

public class Student implements Comparable<Student> {
	int no;
	String name;
	int age;
	
	public Student(int no1,String name1, int age1)  {
		no=no1;
		name=name1;
		age=age1;
	}
	
	
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	

}
