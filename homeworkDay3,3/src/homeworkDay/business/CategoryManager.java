package homeworkDay.business;

import homeworkDay.core.loging.Logger;
import homeworkDay.dataAccess.ICategoryDao;
import homeworkDay.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private Logger [] loggers;
	
	public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	public void add(Category category) throws Exception {

		String getName = null;
		if (category.getName() == getName) {
			throw new Exception("KATEGORİ isimleri aynı olamaz");
		}
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	

}
