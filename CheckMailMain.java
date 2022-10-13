package com.Exception;

public class CheckMailMain {

	public static void main(String[] args) {
		CheckMail c =  new CheckMail();
		c.setName("Adnan");
		
		try 
		{
			c.setEmail("khanadnan18786@gmail.com");
		}
		catch(InvalidMailIdException ime) 
		{
			System.out.println(ime);
		}
		System.out.println("Name is "+c.getName());
		System.out.println("Email ID  is :"+c.getEmail());
	}

}
