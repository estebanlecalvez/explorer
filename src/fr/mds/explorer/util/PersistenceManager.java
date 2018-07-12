package fr.mds.explorer.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class PersistenceManager {
	private static EntityManagerFactory emf;
	
	public static EntityManagerFactory getEMF() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("Explorer-PU");
		}
		return emf;
	}
	
	public static void closeEMF() {
		if(emf!=null && emf.isOpen()) {
			emf.close();
		}
	}
	
	
}
