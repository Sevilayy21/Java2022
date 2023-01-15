package kodlama.io.languageDay4.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.languageDay4.business.abstracts.LanguageSevice;
import kodlama.io.languageDay4.dataAccess.abstracts.LanguageDao;
import kodlama.io.languageDay4.entities.concretes.Language;

@Service // Bu sınıf bir business nesnesidir.
public class LanguageManager implements LanguageSevice {

	private LanguageDao languageDao;

	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		this.languageDao = languageDao;
	}

	@Override
	public List<Language> getAll() {
		return languageDao.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez!");
		}
		for (Language L : getAll()) {
			if (language.getId() == L.getId()) {
				throw new Exception("İsimler tekrar edemez!");
			}
		}

		languageDao.add(language);
	}

	@Override
	public void delete(int id) {
		languageDao.delete(id);
	}

	@Override
	public void update(Language language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez!");
		}
		languageDao.update(language);

	}

	@Override
	public Language getById(int id) {
		return languageDao.getById(id);
	}
}
