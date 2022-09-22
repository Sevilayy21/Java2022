package homework2;

public class workShop1 {
	public static void main(String[] args) {
		
		int[] P1 = new int[]{1,2,3,4,5,6,7,8,9,10};
		int P2 = 11;
		
		boolean varMi = sayiBul(P1,P2);
		if(varMi == true) {
			System.out.println(P2 + " dizide vardır");
		}
		else{
			System.out.println(P2 + " dizide yoktur");
		}
    }


	public static boolean sayiBul(int[] P1, int P2) {
        boolean varMi = false;
		
	    for(int i = 0; i < P1.length; i++) {
			if(P1[i] == P2) {
	    		varMi = true;
	    		break;
	    	}		
	    } 	
	    return varMi;
    }
	
}
//1. Bir fonksiyon yaz, boolean dödürsün - sayiBul
//2. İki parametresi olsun. P1:Dizi - P2:3(kontrol edilmesi istenilen parametre)
//3. 3 sayısı dizide yoktur - gibi sonuc vericek.
