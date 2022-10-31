package Odev3.entities;

public class Kategori {
	
	private int categoryİd;
	private String name;
	
	
	// Constructor block
	public Kategori() {
		
	}

	public Kategori(int categoryİd, String name) {
		this.categoryİd = categoryİd;
		this.name = name;
	}


	// Getters and Setters
	public int getCategoryİd() {
		return categoryİd;
	}
	public void setCategoryİd(int categoryİd) {
		this.categoryİd = categoryİd;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}
