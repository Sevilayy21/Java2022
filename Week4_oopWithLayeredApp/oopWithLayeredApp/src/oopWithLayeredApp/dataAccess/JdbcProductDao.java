package oopWithLayeredApp.dataAccess;

import oopWithLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// Sadece ve sadece db erişşim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veri tabanına eklendi");
	}
}

//Hibernate
