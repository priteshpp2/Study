package JAVA8;

public class Person {

	private String firstName;
	private String lastName;
	
	public Person(String firstName,String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString()
	{
		return "First Name  = " + firstName.toString() + "Last Name  = " + lastName.toString();
		
	}
}
