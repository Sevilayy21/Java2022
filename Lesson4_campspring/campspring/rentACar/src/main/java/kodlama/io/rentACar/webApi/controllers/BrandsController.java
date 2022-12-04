package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController // annotation
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;

	@Autowired // Git parametrelerine bak BrandService
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall") // www.kodlama.io/api/brands/getAll
	public List<Brand> getAll(){
		// BrandManager brandManager = new BrandManager(new InMemoryBrandRepository()); --> gecen derslerde kullanılan 
		// Spring ---> IoC yapısı mevcuttur. 
		
		return brandService.getAll();
	}
	
	
}




// dataAccess Business içinde kullanıldı.Business ıda api çagırıcak.
//DA ---> B ---> API