package Odev3.entities;

public class Kurs {
	
	private int courseİd;
	private String courseName;
	private String description;
	private int instructorİd;
	private double coursePrice;
	
	
	// Constructor block
	public Kurs() {
	
	}

	public Kurs(int courseİd, String courseName, String description, int instructorİd, double coursePrice) {
		this.courseİd = courseİd;
		this.courseName = courseName;
		this.description = description;
		this.instructorİd = instructorİd;
		this.coursePrice = coursePrice;
	}


	// Getters and Setters
	public int getCourseİd() {
		return courseİd;
	}
	public void setCourseİd(int courseİd) {
		this.courseİd = courseİd;
	}


	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public int getInstructorİd() {
		return instructorİd;
	}
	public void setInstructorİd(int instructorİd) {
		this.instructorİd = instructorİd;
	}


	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
	
	

}
