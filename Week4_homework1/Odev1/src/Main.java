
public class Main {

	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
        creditManager.Save();
        
        Customer customer = new Customer(); // Ornegini olusturmak, instance creation
        customer.id =1;
        customer.city = "Istanbul";
//      customer.taxNumber; // Vergi olmama durumunda inharetans dan yarrlanıldı.
        
        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();
        
        Company company = new Company();
        company.taxNumber = "12345";
        company.companyName = "Kodlama.io";
        company.id = 2;
        
        CustomerManager customerManager2 = new CustomerManager(new Person());
        
        
        Person person = new Person();
        person.firstName = "Sevilay";
        person.lastName = "Bozdemir";
        person.NationalIdentify = "12345";
        
        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();


	}

}
