package Odev3;

import Odev3.core.logging.DatabaseLogger;
import Odev3.core.logging.FileLogger;
import Odev3.core.logging.Logger;
import Odev3.core.logging.MailLogger;
import Odev3.business.EgitmenManager;
import Odev3.business.KategoriManager;
import Odev3.business.KursManager;
import Odev3.dataAccess.HibernateKategoriDao;
import Odev3.dataAccess.HibernateKursDao;
import Odev3.dataAccess.JdbcEgitmenDao;
import Odev3.entities.Egitmen;
import Odev3.entities.Kategori;
import Odev3.entities.Kurs;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Egitmen instructor = new Egitmen(1, "Engin", "Demiroğ");
		Kategori category = new Kategori(1, "Programlama");
		Kurs course = new Kurs(1, "Yazılım Geliştirici Yetiştirme Kampı", "Takip buradan sağlanacaktır.", 1, 250);
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
				
		
		EgitmenManager egitmenManager = new EgitmenManager(new JdbcEgitmenDao(), loggers);
		egitmenManager.add(instructor);
		

		KategoriManager kategoriManager = new KategoriManager(new HibernateKategoriDao(), loggers);
		kategoriManager.add(category);
		

		KursManager kursManager = new KursManager(new HibernateKursDao(), loggers);
		kursManager.add(course);

	}

}
