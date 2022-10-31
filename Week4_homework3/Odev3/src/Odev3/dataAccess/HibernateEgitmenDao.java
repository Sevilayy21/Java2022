package Odev3.dataAccess;

import Odev3.entities.Egitmen;

public class HibernateEgitmenDao implements EgitmenDao {
	
	public void add(Egitmen egitmen) {
		System.out.println("Hibernate ile Egitmen veri tabanına eklendi.");
	}

}
