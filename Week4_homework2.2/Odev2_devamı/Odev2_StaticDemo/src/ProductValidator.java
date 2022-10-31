
public class ProductValidator {
	

	static {
		System.out.println("Static yapıcı blok calıstı.");
	}

	public ProductValidator() {
		System.out.println("Yapıcı blok calıstı.");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void bisey() {
		System.out.println("000");
	}
	
	
}
