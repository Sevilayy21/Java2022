
public class Main2 {

	public static void main(String[] args) {
		
		// IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager() );
		customerManager.giveCredit();

		/* Interface :İş yapan sınıfların (CustomerManager or CreditManager) 
		 * operasyonlarının sadece imza seviyesinde yazarak yazılımda 
		 * bağımlılığı korumak adına yapılan çalışmadır.
		 * Amacı yazılımdaki bagımlılıkları engellemek ve if lerden kurtulmaktır.
		*/
		
	}
}

//Bir sınıf birden fazla interface i implemente edebilir. Bir sınıf sadece 1 sınıfı inherit edeblr.

