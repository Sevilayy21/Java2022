package kodlama.io.languageDay4.dataAccess.abstracts;

import java.util.List;

import kodlama.io.languageDay4.entities.concretes.Language;

public interface LanguageDao {
	
	List<Language> getAll();
	public void add(Language language);
	public void delete(int id);
	public void update(Language language);
    Language getById(int id);
}
