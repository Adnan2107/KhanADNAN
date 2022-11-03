package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {
	
	HashSet<Student> hset=new HashSet<>();
	Student s1=new Student(1, "Adnan", "9307515220");
	Student s2=new Student(2,"Saba","8530895620");
	Student s3=new Student(3,"Danish","8830501654");
	Student s4=new Student(4,"Arbaz","9011202277");
	Student s5=new Student(5,"Amaan","9856235478");
	Student s6=new Student(6,"Moin","8778562360");
	hset.add(s1);
	hset.add(s3);
	hset.add(s6);
	hset.add(s5);
	hset.add(s4);
	hset.add(s2);
	for(Student s:hset) {
		Student student;
		if(student.getSid()>3) {
			System.out.println(student);
		}
	}  

}

