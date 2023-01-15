package kodlama.io.languageDay4.business.abstracts;

import java.util.List;

import kodlama.io.languageDay4.entities.concretes.Language;

public interface LanguageSevice {
	
	List<Language> getAll();
	public void add(Language language) throws Exception;
	public void delete(int id);
	public void update(Language language) throws Exception;
    Language getById(int id);
	
}
