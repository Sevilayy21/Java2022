package homework2;

public class metotlar {

	public static void main(String[] args) {
		
		mesajVer("Burak");
		hesapla();
		System.out.println(topla(6,3));
		System.out.println(toplananIkiSayininYuzdeOnu(10,90));

	}
	
		
	public static void mesajVer(String isim) {
		System.out.println("Merhaba " + isim);
	}
	public static void hesapla() {
		System.out.println("Hesaplandi");
	}	
	
	
	//Iki sayinin toplamı
	public static int topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam; //returnde integer donduruyoruz
	}	
		
	
	//Toplanan iki sayinin %10 unu bul
	public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2) {
		int toplam = topla(sayi1, sayi2); //dondurdugumuz integer i da bu sekilde int a atayabildik
		double sonuc = toplam * 10/100;
		return sonuc;
	}		
	
	
	//Genelde return olanlar bir hesaplama sonucudur. 
	//Hangi türde donus gerceklesicekse returne o yazilir.
	public static double krediHesapla(double krediMiktari) {
		//hesaplar yapilir
		return 125000; //hesap sonucu
	}	
	


	}

