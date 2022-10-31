package Odev3.dataAccess;

import Odev3.entities.Kurs;

public class JdbcKursDao implements KursDao {

	public void add(Kurs course) {
		System.out.println("Jdbc ile Kurs veritabanına eklendi.");
    }
}
