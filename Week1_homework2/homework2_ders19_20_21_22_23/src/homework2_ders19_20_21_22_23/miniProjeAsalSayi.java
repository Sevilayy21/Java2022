package homework2_ders19_20_21_22_23;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 11;
		boolean asalMi = true;
		
		
		for(int i = 2; i < number; i++){
			int control = number % i; 
			if(control == 0){
				asalMi = false;
			}
		}
		
		
		if(number==1) {
			System.out.println(number + " sayı asal degildir.");
			return;
		}
		else if(number < 1){
			System.out.println(number + " gecersiz sayı");
			return;
		}
		
		
		if(asalMi) {
			System.out.println(number + " asal sayıdır.");
		}else {
		    System.out.println(number + " asal sayı degildir.");
		}
		
		}
	
	}


