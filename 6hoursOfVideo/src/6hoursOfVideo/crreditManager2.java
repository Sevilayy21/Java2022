package homework2;

import java.util.ArrayList;


public class crreditManager2 {

	public static void main(String[] args) {
		
		//CreditManager_Interface creditManager = new CreditManager();
		//creditManager.add();
		//creditManager.calculate();

		//MortgageManager mortgageManager = new MortgageManager();
		//mortgageManager.add();
        // Interface new lenmez, tek basına anlamı yoktur. Bu yuzden yorum satırı haline getirildi.
		
		//Asagıda kredi manager turunde bir array new lediğimiz için gerceklesebilmektedir. 
		//CreditManager_Interface[] credits = new CreditManager_Interface[3];
		/*
		credits[0] = new MortgageManager();
		credits[1] = new VehicleManager();
		credits[2] = new officerCredit();
		
		for (int i = 0; i < credits.length; i++) {
			credits[i].calculate();
		}
		
		*/

		
		//ArrayList<String> sehirller = new ArrayList<String>();
		ArrayList<CreditManager_Interface> credits = new ArrayList<CreditManager_Interface>();
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		credits.add(new officerCredit());

		for (CreditManager_Interface credit : credits) {
			credit.calculate();
		}


	}

}

// Yzılım geliştirme prensipleri : SOLID 
