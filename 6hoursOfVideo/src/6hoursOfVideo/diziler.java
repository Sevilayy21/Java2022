package homework2;

public class diziler {

	public static void main(String[] args) {
		String[] sehirler1 = new String[]{"Ankara","İstanbul","İzmir"};
		
		//her bir eleman sehir ya da s denir
		for(String sehir : sehirler1) {
			System.out.println(sehir);
		}
		
		//bir önceki for döngüsünün aynısı
		for(int i = 0; i < 3; i++) {
			System.out.println(sehirler1[i]);
		}
			
		
		
		
	}

}
