public class Product {
	// 3. Constructor
	public Product(int id, String name, String descriptin, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok calıstı.");
		this.id =id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = descriptin;
		this.stockAmount = stockAmount;
	}
	
    // 2. Classes ın diger ozelliği özellik tutmasıdır.
	// Attribute / field
	// private : Sadece tanımlandığı blok içerisinde gecerli olduğunu belirtir.
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//getter 
	public int get_id() {
		return id;
	}
	//setter
	public void set_id(int id) {
		//this.id = id;
		this.id = id;
	}
	
	public String get_name() {
		return name;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public String get_description() {
		return description;
	}
	public void set_description(String description) {
		this.description = description;
	}
	public double get_price() {
		return price;
	}
	public void set_price(double price) {
		this.price = price;
	}
	public int get_stockAmount() {
		return stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String get_renk() {
		return renk;
	}
	public void set_renk(String renk) {
		this.renk = renk;
	}
	public String get_kod() {
		return this.name.substring(0,1) + id;
		
	}
		
	// * Product class ı hem attribute hem de operasyon içermemeli. Bir class, bir method, bir if bloğu.. sadece bir iş yapar.
}
