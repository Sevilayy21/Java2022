package Odev3.business;

import Odev3.core.logging.Logger;
import Odev3.dataAccess.KursDao;
import Odev3.entities.Kurs;

public class KursManager {
	
	private KursDao kursDao ;
	private Logger[] loggers;
	
	public KursManager(KursDao kursDao,  Logger[] loggers) {
		this.kursDao = kursDao;
		this.loggers = loggers;
	}

	
	public void add(Kurs course) throws Exception {
		
		Kurs[] courses = {new Kurs(1, ".Net","xxx", 1, 250), new Kurs(2,"Java","yyy", 1,130)};
		
		// business rules
		if(course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz!");
		}
		
		for(Kurs courseList : courses) {
			if(course.getCourseName() == courseList.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edilemez!");
			}	
			
		}

//		KursDao kursDao = new JdbcKursDao();
		kursDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
	}
}
