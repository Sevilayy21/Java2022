package Odev3.business;

import Odev3.core.logging.Logger;
import Odev3.dataAccess.EgitmenDao;
import Odev3.entities.Egitmen;

public class EgitmenManager {
	private EgitmenDao egitmenDao;
	private Logger[] loggers;

	public EgitmenManager(EgitmenDao egitmenDao, Logger[] loggers) {
		this.egitmenDao = egitmenDao;
		this.loggers = loggers;
	}

	
	public void add(Egitmen instructor) {	
		egitmenDao.add(instructor);
		
		for(Logger logger : loggers) {
			logger.log(instructor.getFirstName() +" "+ instructor.getLastName());
		}
	}
	
	
	
}
