package homework2_ders17_18;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);

		/*
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4)); //index ile elemanı bulma - .charAt()
		System.out.println(mesaj.concat(" yasasın!"));        //string ifade ekleme - .concat()
		System.out.println(mesaj.startsWith("B"));            //baslangıcına göre true veya false dondur - .startsWith("B")
        System.out.println(mesaj.endsWith("."));              //bitişine göre true veya false dondur - .endsWith(".")
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);                 //string in 0 dan 4 indexine kadar al, karakterler dizisine 0. indexinden itibaren ata
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));              //karakterin ya da string in mesaj string de kacıncı eleman oldugunu bulmaya yarar
        System.out.println(mesaj.lastIndexOf('a'));           //karakterin ya da string i sağdan aramaya baslar ama eleman numarası normal sayar
        */
                                                      		
		String yeniMesaj = mesaj.replace(" ", "-");           //yer değiştirme 
		System.out.println(yeniMesaj);         
		System.out.println(mesaj);
		System.out.println(mesaj.substring(2,5));             //istenilen index aralığını kesme
		
		for (String kelime : mesaj.split(" ")) {              //bosluklardan ayırma  
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());              //tum harfleri kucult
		System.out.println(mesaj.toUpperCase());              //tum harfleri buyult
		System.out.println(mesaj.trim());                     //bas ve sondaki boslukları atar
		

		
	}

}
