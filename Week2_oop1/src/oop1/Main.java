package oop1;

public class Main {

	public static void main(String[] args) {
		//String mesaj = "Vade oranı";

		Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUr1("Image1.jpg");
		
		Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUr1("Image1.jpg");
		
		
		Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUr1("Image1.jpg");

		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05555555");
		individualCustomer.setCutomerNumber("123");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CooporateCustomer cooporateCustomer = new CooporateCustomer();
		cooporateCustomer.setId(1);
		cooporateCustomer.setPhone("05555555");
		cooporateCustomer.setCutomerNumber("123");
		cooporateCustomer.setCompanyName("Kodlama io");
		cooporateCustomer.setTextNumber("12345");
		
		Customer[] customers = {individualCustomer, cooporateCustomer};
		
		
	}

}
