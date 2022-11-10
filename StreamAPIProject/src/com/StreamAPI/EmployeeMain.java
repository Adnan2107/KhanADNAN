package com.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
	
public static void main(String[] args) {
	
		List <Employee> ep=new ArrayList<>();
		
		Employee e1=new Employee("Adnan",21,"IT",50000 );
		Employee e2=new Employee("Arbaz",20,"Engineer",25000);
		Employee e3=new Employee("Moin",21,"Pharmacy",40000);
		Employee e4=new Employee("Aman",23,"Aerospace",20000);
		Employee e5=new Employee("Kashif",24,"DMLT",10000);
		Employee e6=new Employee("Haider",21,"Collector",30000);
		
		ep.add(e1);
		ep.add(e2);
		ep.add(e3);
		ep.add(e4);
		ep.add(e5);
		ep.add(e6);
		
		Collections.sort(ep, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println("Sorting Name => " + ep);
        
        
      //filter and print employees whose salary is greater than 10000 and also print the total number of employees having salary  greater than 10000.

        
        List<Employee>nep=ep.stream().filter((p1)->p1.getSalary()> 10000).collect(Collectors.toList());
        System.out.println("employee whose salary is greater than 10000:\n"+nep);
    	System.out.println("Total no of of employee whose salary is greater than 10000 ="+nep.stream()
    	.count());
      		
      		//Print employee name whose salary is maximum.
        System.out.println("Maximum Salary"+ep.stream().max((p1,p2)->p1.getSalary()>p2.getSalary()?1:-1)
		   .map(e->e.getName()));

}
}
