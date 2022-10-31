
public class Customer {
	
    public Customer() { // Constructor
		System.out.println("Musteri nesnesi baslatıldı.");
	}
	
	public int id;
	public String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	
// Bir class sadece 1 işi yapmalıdır !!!
// Katmanlı Mimariler*
}
