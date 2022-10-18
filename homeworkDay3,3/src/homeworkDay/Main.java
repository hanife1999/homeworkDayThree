package homeworkDay;

import homeworkDay.business.CourseManager;
import homeworkDay.core.loging.DatabaseLogger;
import homeworkDay.core.loging.Logger;
import homeworkDay.core.loging.MailLogger;
import homeworkDay.dataAccess.HibernateDao;
import homeworkDay.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Course course1= new Course(1,"JAVA Kamp", 5);
		Course course2 = new Course(2, "JAVA Kamp", 100);
		
		Logger [] loggers = {new DatabaseLogger(), new MailLogger() };
		
		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);

	}

}
