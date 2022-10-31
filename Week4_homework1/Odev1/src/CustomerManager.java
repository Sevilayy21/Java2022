
public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) { // Constructor
		this.customer = customer;
		this.creditManager = creditManager;
		
	}
	
	public void Save() {
		System.out.println("Müşteri kaydedildi: " ); //+ customer.firstName
	}
	
	public void Delete() {
		System.out.println("Müşteri silindi: " ); //+ customer.firstName
	}

	public void giveCredit() {
		creditManager.Calculate();
		System.out.println("Kredi verildi.");
	}
}
