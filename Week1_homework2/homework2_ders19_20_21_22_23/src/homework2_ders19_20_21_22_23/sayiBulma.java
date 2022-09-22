package homework2_ders19_20_21_22_23;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak =3;
		
		for(int sayi : sayilar) {
			if(aranacak == sayi)  {
				System.out.println(aranacak + " sayisi dizi içerisinde mevcuttur.");
				return;
			}
		}
		
		System.out.println(aranacak + " sayisi dizi içerisinde mevcut degildir");

	}
	
}

