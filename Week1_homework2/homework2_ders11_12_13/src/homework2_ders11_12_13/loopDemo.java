package homework2_ders11_12_13;

public class loopDemo {

	public static void main(String[] args) {
		//For
		for (int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For dongusu bitti");

		
		//While
		int i = 2;
		while (i <= 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While dongusu bitti");
		
		
		//Do while : Gercek hayatta bir dongu calısmasa bile yapılmak istenilen bir operasyon varsa calıstırılır.
		int j = 2;
		do {
			//Dongu calısmasa bile o dongunun calıstıgına dair log atmak istenildiginde .println("loglandı") if(j<10) gibi bir ifade yazılabilmektedır. 
			System.out.println(j);
			j+=2;
		} while (j <= 10);
		System.out.println("Do while dongusu bitti");
		
		
		
	}
}
