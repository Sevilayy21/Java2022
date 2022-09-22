package homework2;

public class diziler2 {
	
	public static void main(String[] args) {
		
		String[] sehirler1 = new String[] {"Ankara","İstanbul","İzmir"};	
		String[] sehirler2 = new String[] {"Antep","Diyarbakır","Urfa"};

		
		//OOP Calısma Mantıgı (Steak / Heap)		

	    // Ornek1
		//sehirler1 = new String[4];
		//sehirler1[3] = "Bursa";
		//System.out.println(sehirler1[1]);  -  cıktı : null
		
		
		// Ornek2
		//sehirler1 = sehirler2;
		//sehirler1[0] = "Adana";
		//System.out.println(sehirler2[0]);  -  cıktı : Adana
		
		
		// Ornek3
		 int sayi1 = 10;
		 int sayi2 = 20;
		 sayi1 = sayi2;
		 sayi2 = 30;
		 System.out.println(sayi1);//  -  cıktı : 20
		 
		 /*
		 Value types : bool, int, doubles...(Tamamen deger üzerinden staek te calısırlar.)
		 Reference types : array, class, abstract, interface...(Steak / Heap)
		 */
	}
}
