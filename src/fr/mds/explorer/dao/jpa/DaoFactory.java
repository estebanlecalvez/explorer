package fr.mds.explorer.dao.jpa;

import fr.mds.explorer.dao.CategoryDao;
import fr.mds.explorer.dao.FileDao;
import fr.mds.explorer.util.PersistenceManager;

public class DaoFactory {
	
	
	private DaoFactory() {
	}

	public static CategoryDao getCategoryDao() {
		return new JpaCategoryDao (PersistenceManager.getEMF());
	}
	
	public static FileDao getFileDao() {
		return new JpaFileDao(PersistenceManager.getEMF());
	}
	
}
