package fr.mds.jaxrsjersey.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import fr.mds.explorer.dao.jpa.JpaFileDao;
import fr.mds.explorer.entity.File;

@ApplicationPath("/rest")
public class RestService extends Application{
	
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> returnSet = new HashSet<>();
		
		returnSet.add(FileResource.class);
		returnSet.add(File.class);
		returnSet.add(JpaFileDao.class);
		return returnSet;
	}
}
