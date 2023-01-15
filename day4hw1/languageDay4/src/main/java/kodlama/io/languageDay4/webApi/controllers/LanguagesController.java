package kodlama.io.languageDay4.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.languageDay4.business.abstracts.LanguageSevice;
import kodlama.io.languageDay4.entities.concretes.Language;

@RestController // anotation
@RequestMapping("/api/programmingLanguages")
public class LanguagesController {
	private LanguageSevice languageService;

	@Autowired
	public LanguagesController(LanguageSevice languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getAll")
	public List<Language> getAll() {
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(Language language) throws Exception {
		languageService.add(language);
	}
	
	@DeleteMapping("/delete")
	public void delete(int id){
		languageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(Language language)throws Exception {
		languageService.update(language);
	}
	
	@GetMapping("/getById")
	public void getById(int id){
		languageService.getById(id);
	}

}







