
public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop", "ASUS Laptop", 15000, 3, "mavi");
		
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("ASUS Laptop");
//		product.setPrice(15000);
//		product.setStockAmount(3);
		
        System.out.println(product.getKod());
	}

}
