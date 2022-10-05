package oopWithLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithLayeredApp.core.logging.Logger;
import oopWithLayeredApp.dataAccess.HibernateProductDao;
import oopWithLayeredApp.dataAccess.JdbcProductDao;
import oopWithLayeredApp.dataAccess.ProductDao;
import oopWithLayeredApp.entities.Product;

public class ProductManager {
	// depended enjection
	private ProductDao productDao;
	private Logger[] loggers; // List<Logger>
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// business rules
		if(product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan kucuk olamaz");
		}
		
		productDao.add(product);
		
		//Bir katman başka bir katmanın classını kullanıyorken sadece interface inden erişim kurmalıdır!
			
		for(Logger logger : loggers) { // [db,mail]
			logger.log(product.getName());
		}
	}

}
