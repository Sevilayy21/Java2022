package Odev3.dataAccess;

import Odev3.entities.Kategori;

public class HibernateKategoriDao implements KategoriDao {
	
	public void add(Kategori category) {
		System.out.println("Hibernate ile Kategori veritabanına eklendi. ");
	}
}
