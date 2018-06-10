package emailapp;

public class EmailApp {
	
	public static void main (String[] args) {
		Email em1 = new Email("John", "Smith");
		
		//em1.changePassword(password);
		//em1.setMailBoxCapacity(capacity);
		//em1.setAlternateEmail("js@gmail.com");
		//System.out.println(em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());
	}
	
	

}




/* 
* This class file will have main function.
* 

*/





/* Email Application:
Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires.
Your application should do the following:
 Generate an email with the following syntax: firstname.lastname@department.company.com
 Determine the department (sales, development, accounting), if none leave blank
 Generate a random String for a password
 Have set methods to change the password, set the mailbox capacity, and define an alternate email address
 Have get methods to display the name, email, and mailbox capacity */