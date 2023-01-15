package kodlama.io.languageDay4.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.languageDay4.dataAccess.abstracts.LanguageDao;
import kodlama.io.languageDay4.entities.concretes.Language;

@Repository // Bu sınıf bir dataAccess nesnesidir.
public class InMemoryLanguageDao implements LanguageDao {

	List<Language> languages;

	public InMemoryLanguageDao() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}
	
	@Override
	public void add(Language language) {
		languages.add(language);

	}

	@Override
	public void delete(int id) {
		for (Language L : languages) {
			if (id == L.getId()) {
				languages.remove(L);
			}

		}

	}

	@Override
	public void update(Language language) {
		for (Language L : languages) {
			if (language.getId() == L.getId()) {
				L.setName(language.getName());
			}

		}
	}

	@Override
	public Language getById(int id) {
		for (Language L : languages) {
			if (L.getId() == id) {
				return L;
			}
		}
		return null;
	}

}
