package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

// Repository / Dao : Veri tabanı işleri yapacak sınıflara verilen isimlerdir.
public interface BrandRepository { 
	List<Brand> getAll(); // getAll çağıran markaları listeler.
	
}
