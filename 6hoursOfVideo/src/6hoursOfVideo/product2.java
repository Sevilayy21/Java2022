package homework2;

public class product2 {

	public static void main(String[] args) {
//		int[] sayilar = new int[] {1,2,3};
		
		product product1 = new product();
		product1.setName("Laptop");
		
		product product2 = new product();
		product2.setName("Mouse");
		
//		product[] urunler = new product[] {new product(), new product()};
		product[] urunler = new product[] {product1, product2};

		
		for(int i = 0; i < urunler.length;i++) {
			System.out.println(urunler[i].getName());
			
		}
		
		
		
		
	}

	}


