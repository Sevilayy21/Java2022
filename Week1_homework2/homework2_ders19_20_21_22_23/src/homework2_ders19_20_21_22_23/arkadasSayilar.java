package homework2_ders19_20_21_22_23;

public class arkadasSayilar {

	public static void main(String[] args) {
		int sayi1 = 220;
		int sayi2 = 284;
		
		int sayi1Total = 0; 
		int sayi2Total = 0; 
		
		for(int i = 1; i < sayi1; i++) {
			if(sayi1 % i == 0) {
				sayi1Total = sayi1Total + i;
		    }
	    }
		
		for(int i = 1; i < sayi2; i++) {
			if(sayi2 % i == 0) {
				sayi2Total = sayi2Total + i;
		    }
	    }

		if(sayi1Total == sayi2 && sayi2Total == sayi1 ) {
			System.out.println(sayi1 + " ve " + sayi2 + " arkadas sayılardır.");
		}else {
		System.out.println(sayi1 + " ve " + sayi2 + " arkadas sayı değillerdir.");
		}

	}
}
