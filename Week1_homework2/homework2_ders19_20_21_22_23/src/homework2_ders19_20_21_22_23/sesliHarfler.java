package homework2_ders19_20_21_22_23;

public class sesliHarfler {

	public static void main(String[] args) {
		char name = 'g';
		char[] kalinHarfler = new char[] {'a','ı','o','u'}; 
		char[] inceHarfler = new char[] {'e','i','ö','ü'}; 

		for(char kalin : kalinHarfler) {
			if(name == kalin) {
				System.out.println(name + " kalın bir harftir.");
				return;
			}
		}
		
		for(char ince : inceHarfler) {
			if(name == ince) {
				System.out.println(name + " ince bir harftir.");
				return;
			}
		}
		System.out.println("Lütfen sesli bir harf giriniz !");
	}
}

// Switch yöntemi
/*
        switch(name) {
        	case 'a':
        	case 'ı':
        	case 'o':
        	case 'u':
        		System.out.println(name + " kalın bir harftir.");
        		break;
        	default:
        		System.out.println(name + " ince bir harftir.");
                
        }
*/