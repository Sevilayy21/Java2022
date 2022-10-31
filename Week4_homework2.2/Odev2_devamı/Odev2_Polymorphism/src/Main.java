
public class Main {

	public static void main(String[] args) {
		
//		EmailLogger logger = new EmailLogger();
//		logger.Log("Email Log Mesajı");
//		DataBaseLogger dataBaseLogger = new DataBaseLogger();
//		dataBaseLogger.Log(" 000 ");
		
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};
//		for (BaseLogger logger : loggers) {
//			logger.Log("Log Mesajı");		
//		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

		
}
