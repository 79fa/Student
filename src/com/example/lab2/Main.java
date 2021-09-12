package com.example.lab2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main{
public static void main(String args[]) {
	
	
	List<Student> al=new ArrayList<Student>();
	
	System.out.println("Student List (ordered by name)");
	
	
	Student s1=new Student(101,"Kim",23);
	al.add(s1);
	
	Student s2=new Student(102,"Chi",24);
	al.add(s2);
	
	Student s3=new Student(103,"Bob",27);
	al.add(s3);
	
	Student s4=new Student(104,"Con",22);
	al.add(s4);

	Student s5=new Student(105,"Hong",20);
	al.add(s5);
	
	Student s6=new Student(106,"Gil",21);
	al.add(s6);
	
	Student s7=new Student(107,"On",40);
	al.add(s7);
	
	Student s8=new Student(108,"Oh",21);
	al.add(s8);
	
	Student s9=new Student(109,"Ha",23);
	al.add(s9);
	
	Student s10=new Student(110,"Wil",30);
	al.add(s10);
	
	//System.out.println(s8);
	
	Collections.sort(al);
	
	for (Student s:al) {
		System.out.println("Student [no="+s.no+", name="+s.name+", age="+s.age+"]");
	}
	
	}
}
	

