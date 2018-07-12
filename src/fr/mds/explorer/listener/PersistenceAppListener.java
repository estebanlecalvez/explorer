package fr.mds.explorer.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.mds.explorer.util.PersistenceManager;
	
@WebListener
public class PersistenceAppListener implements ServletContextListener{
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		PersistenceManager.closeEMF();
	}
	
}
