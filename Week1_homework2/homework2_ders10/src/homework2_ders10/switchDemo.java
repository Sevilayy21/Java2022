package homework2_ders10;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'R';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Cok guzel : Gectiniz");
			break;
		case 'C':
			System.out.println("İyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena değil : Gectiniz");
			break;
		case 'F':
			System.out.println("Malesef kaldınız");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");
		}

		
//Dağılmıs kod düzenleme kısayolu_eclips format kod : Ctrl + shift + F 
	}
}
