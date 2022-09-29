
class Member
{
	String name;
	int age;
	String phoneNumber;
	String address;
	double Salary;
	
	public void  printSalary(double salary) 
	{
		System.out.println("salary is "+salary); 
	}
}

class Employee extends Member
{
	String specialization;
	
	
	public void showDetails() 
	{
		System.out.println("Name of the employee is "+name);
		System.out.println("age of the employee is "+age);
		System.out.println("phone Number of the employee is "+phoneNumber);
		System.out.println("Address of the employee is "+address);
		System.out.println("Specialization of the employee is "+specialization);
	}
	public void  printSalary(double salary) 
	{
		System.out.println("salary is "+salary); 
	}
}
class Manager extends Member
{
	String department;
	public void showDetails() 
	{
		System.out.println("Name of the Manager is "+name);
		System.out.println("age of the Manager is "+age);
		System.out.println("phone Number of the Manager is "+phoneNumber);
		System.out.println("Address of the Manager is "+address);
		System.out.println("Department of the Manager is "+department);
	}
	public void  printSalary(double salary) 
	{
		System.out.println("salary is "+salary); 
	}
}


public class MemberMain {

	public static void main(String[] args) {
		
		Manager man = new Manager();
		Employee e = new Employee();
		man.name="Adnan";
		man.age=21;
		man.department="IT";
		man.phoneNumber="7977653630";
		man.address="Vikhroli";
		man.printSalary(25000);
		man.showDetails();
		
		e.name="Arbaz";
		e.age=21;
		e.specialization="Doctor";
		e.phoneNumber="7987437361";
		e.address="Thane";
		e.printSalary(50000);
		e.showDetails();
		
		
	}

}
