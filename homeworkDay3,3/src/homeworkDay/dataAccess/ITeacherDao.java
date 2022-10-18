package homeworkDay.dataAccess;

import homeworkDay.entities.Teacher;

public interface ITeacherDao {
	void add (Teacher teacher);
	void delete (Teacher teacher);
	void update (Teacher teacher);

}
