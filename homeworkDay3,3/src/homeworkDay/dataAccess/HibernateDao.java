package homeworkDay.dataAccess;

import homeworkDay.entities.Category;
import homeworkDay.entities.Course;
import homeworkDay.entities.Teacher;

public class HibernateDao implements ITeacherDao, ICategoryDao,ICourseDao {

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile KURS eklendi");
		
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile KURS silindi");
		
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile KURS güncellendi");
		
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile KATEGORİ eklendi");
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile KATEGORİ silindi");
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Hibernateile KATEGORİ güncellendi");
		
	}

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile EĞİTMEN eklendi");
		
	}

	@Override
	public void delete(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile EĞİTMEN silindi");
		
	}

	@Override
	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile EĞİTMEN güncellendi");
		
	}

}
