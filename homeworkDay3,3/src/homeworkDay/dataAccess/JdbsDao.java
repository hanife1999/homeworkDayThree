package homeworkDay.dataAccess;

import homeworkDay.entities.Category;
import homeworkDay.entities.Course;
import homeworkDay.entities.Teacher;

public class JdbsDao implements ITeacherDao, ICategoryDao,ICourseDao{

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile KURS eklendi");
		
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile KURS silindi");
		
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile KURS güncellendi");
		
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile KATEGORİ eklendi");
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile KATEGORİ silindi");
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile KATEGORİ güncellendi");
		
	}

	@Override
	public void add(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile EĞİTMEN eklendi");
		
	}

	@Override
	public void delete(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile EĞİTMEN silindi");
		
	}

	@Override
	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		System.out.println("Jdbs ile EĞİTMEN güncellendi");
		
	}
	

}
