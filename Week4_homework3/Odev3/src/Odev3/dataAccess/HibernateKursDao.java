package Odev3.dataAccess;

import Odev3.entities.Kurs;

public class HibernateKursDao implements KursDao {
	
	public void add(Kurs course) {
		System.out.println("Hibernate ile Kurs veritabanına eklendi.");
    }

}
