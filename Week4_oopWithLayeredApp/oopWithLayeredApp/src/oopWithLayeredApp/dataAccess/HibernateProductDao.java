package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		// Sadece ve sadece db erişşim kodları buraya yazılır... SQL
		System.out.println("Hibernate ile veri tabanına eklendi");
	}

}
