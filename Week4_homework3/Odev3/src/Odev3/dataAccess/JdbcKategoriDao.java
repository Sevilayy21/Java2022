package Odev3.dataAccess;

import Odev3.entities.Kategori;

public class JdbcKategoriDao implements KategoriDao {
	
	public void add(Kategori category) {
		System.out.println("Jdbc ile Kategori veritabanına eklendi. ");
	}

}
