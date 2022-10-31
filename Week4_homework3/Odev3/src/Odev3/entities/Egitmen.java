package Odev3.entities;

public class Egitmen {
	
	private int instructorİd;
	private String firstName;
	private String lastName;
	
	
	// Constructor block
	public Egitmen() {
		
	}

	public Egitmen(int instructorİd, String firstName, String lastName) {
		this.instructorİd = instructorİd;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	// Getters and Setters
	public int getInstructorİd() {
		return instructorİd;
	}
	public void setId(int instructorİd) {
		this.instructorİd = instructorİd;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
