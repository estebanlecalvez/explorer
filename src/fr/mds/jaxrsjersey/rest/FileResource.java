package fr.mds.jaxrsjersey.rest;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.mds.explorer.dao.jpa.JpaFileDao;
import fr.mds.explorer.entity.File;
import fr.mds.explorer.util.PersistenceManager;

@Path("/products")
public class FileResource {
	EntityManagerFactory emf = PersistenceManager.getEMF();
	//
	@GET @Path("/xml") @Produces(MediaType.APPLICATION_XML)
	public List<File> getAllProductsInXML(){
		return new JpaFileDao(emf).getAllFiles();
	}
	
	@GET @Path("/json") @Produces(MediaType.APPLICATION_JSON)
	public List<File> getAllProductsInJSON(){
		return new JpaFileDao(emf).getAllFiles();
	}
	
	@GET @Path("/{id}") @Produces(MediaType.APPLICATION_XML)
	public void getProductInXML(@PathParam("id")Long id) {
		new JpaFileDao(emf).findFile(id);
	}
	
	@GET @Path("/{id}") @Produces(MediaType.APPLICATION_JSON)
	public void getProductInJSON(@PathParam("id")Long id) {
		new JpaFileDao(emf).findFile(id);
	}
	
	@DELETE @Path("/remove/{id}")
	public void removeProduct(@PathParam("id")Long id) {
		new JpaFileDao(emf).removeFile(id);
	}	
}
