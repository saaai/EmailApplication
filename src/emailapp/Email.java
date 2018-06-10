package emailapp;

import java.util.Scanner;

public class Email {

	private String FirstName;
	private String LastName;
	private String Password;
	private String Department;
	private String Email;
	private int MailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String AlternateEmail;
	private String companySuffix = "anyCompany.com";
	
	
	
	//constructor to receive the first name and last name 
	public Email (String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName; 	//this.(class level variable) = (local variable)
		//System.out.println("Email Created: " + this.FirstName +  "" + this.LastName);
		
		//call a method asking for the department  -  return the department
		this.Department =  setDepartment();
		//System.out.println("Department : " + this.Department);
		
		//call a method that returns a random password
		this.Password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.Password);
		
		//Combine elements to generate email
		Email = FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+Department +"."+companySuffix;
		//System.out.println("Your Email is : " + Email);
	}

	//Ask for the department
	public String setDepartment() {
		System.out.println("New Worker:" + FirstName + ". Department Codes : \n 1 for sales \n 2 for Development \n 3 for Accounting \n 0 for none \n Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice =  in.nextInt();
		if(depChoice == 1) {
			return " Sales" ;
		} else if (depChoice == 2)
		{
			return " Dev";
		} else if (depChoice == 3)
		{
			return " Acc";
		} else {
			return "";
		}
		
	}
	
	// Generate a random password 
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+=";
		char[] password = new char[length];
		for (int i=0; i<length ; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			//System.out.print(rand);
			//System.out.println(passwordSet.charAt(rand));
		}
		return new String(password); 
			
	}
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int capacity ) {
		this.MailBoxCapacity = capacity;
		 
	}
	
	
	//Set an alternate email
	public void setAlternateEmail(String alternateEmail) {
		// TODO Auto-generated method stub
		this.AlternateEmail = alternateEmail;
	}
	
	//change the passwords
	public void changePassword(String password) {
		this.Password = password;
	}
	
	public int getMailBoxCapacity()
	{
		return MailBoxCapacity; //class variable
	}
	
	public String getAlternateEmail() {
		return AlternateEmail;
	}
	
	public String getPassword() {
		return Password;
	}

	public String showInfo() {
		return "Dsiplay Name : " + FirstName + "" + LastName + "" + 
				"\n Company Email: " + Email +
				"\n MailBoxCapacity : " + MailBoxCapacity  + "mb" ;
				
		
	}
	
	
}



/* 
* This class file will have objects.
* 
* Setting is actually defining properties, Getting is actually proving them.
* 

*/


