package Odev3.business;

import Odev3.core.logging.Logger;
import Odev3.dataAccess.KategoriDao;
import Odev3.entities.Kategori;

public class KategoriManager {
	
	private KategoriDao kategoriDao;
	private Logger[] loggers;
	
	public KategoriManager(KategoriDao kategoriDao, Logger[] loggers) {
		this.kategoriDao = kategoriDao;
		this.loggers = loggers;
	}

	
	public void add(Kategori category) throws Exception {
		
	Kategori[] categories = {new Kategori(1,"Web Programlama"), new Kategori(2,"Mobil Programlama")};
	
	for(Kategori List : categories) {
		if(category.getName() == List.getName()) {
			throw new Exception("Kategori ismi tekrar edilemez!");
		}
		
	}

//	KategoriDao kategoriDao = new JdbcKategoriDao();
	kategoriDao.add(category);
	
	for(Logger logger : loggers) {
		logger.log(category.getName());
	}
	
	}
}
