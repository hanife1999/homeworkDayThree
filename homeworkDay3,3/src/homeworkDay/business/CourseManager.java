package homeworkDay.business;

import homeworkDay.core.loging.Logger;
import homeworkDay.dataAccess.ICourseDao;
import homeworkDay.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private Logger [] loggers;
	
	public CourseManager(ICourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
//		iş kuralları yazılır
		if (course.getUnitPrice() < 0) {
			throw new Exception("KURSUN fiyatı 0 dan küçük olmaz");
		}
		courseDao.add(course);
		
		String getName = null;
		if(course.getName() == getName) {
			throw new Exception("KURS ismi aynı olamaz");
		}
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	

}
