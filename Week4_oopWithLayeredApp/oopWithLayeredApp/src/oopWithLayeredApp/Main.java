package oopWithLayeredApp;

import oopWithLayeredApp.business.ProductManager;
import oopWithLayeredApp.core.logging.DatabaseLogger;
import oopWithLayeredApp.core.logging.FileLogger;
import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.core.logging.MailLogger;
import oopWithLayeredApp.dataAccess.HibernateProductDao;
import oopWithLayeredApp.dataAccess.JdbcProductDao;
import oopWithLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone Xr",10000);
		Logger[] loggers = {};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		
		

	}

}
