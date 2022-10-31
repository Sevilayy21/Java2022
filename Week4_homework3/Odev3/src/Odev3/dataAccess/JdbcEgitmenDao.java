package Odev3.dataAccess;

import Odev3.entities.Egitmen;

public class JdbcEgitmenDao implements EgitmenDao { 
	
	public void add(Egitmen instructor) {
		System.out.println("Jdbc ile Egitmen veri tabanına eklendi.");
	}
}
