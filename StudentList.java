package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class StudentList  {
	
	static ArrayList <Student>list1=new  ArrayList<>();
	 static ArrayList <Student>list2=new  ArrayList<>();
	

	    public static void fillArrayList1()
		{
		    list1=new ArrayList<>();
		   
		    Student a1=new Student(18,"Adnan","9876544323");
		    Student a2=new Student(20,"Aman","8766544323");
		    Student a3=new Student(15,"Arbaaz","8765944323");
		    list1.add(a1);
		    list1.add(a2);
		    list1.add(a3);
		    list2=new ArrayList<>();
		    Student s1=new Student(5,"Danish","9876544323");
		    Student s2=new Student(6,"Kashif","8766544323");
		    Student s3=new Student(3,"	Moin","8765944323");
		    list2.add(s1);
		    list2.add(s2);
		    list2.add(s3);

		}
	private static void printArrayList() {

		Collections.sort(list1, new stdid());
		Collections.sort(list2, new stdid();
		Collections.sort(list1, new stdname());
		Collections.sort(list2, new stdname());
			   
			   
			    Iterator itr=list1.iterator();
			    System.out.println("list1 elements ");
			   while(itr.hasNext())
			   {
				   System.out.println(itr.next());
			   }
			  
			    Iterator itr2=list2.iterator();
			    System.out.println("list2 elements");
			   while(itr2.hasNext())
			   {
				   System.out.println(itr2.next());
			   }
		

				public static void main(String[] args) {
					fillArrayList1();
					printArrayList();

				}
	
    }
	
	
	}

	
	


