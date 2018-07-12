package fr.mds.explorer.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import fr.mds.explorer.dao.FileDao;
import fr.mds.explorer.entity.Category;
import fr.mds.explorer.entity.File;

public class JpaFileDao implements FileDao {

	private EntityManagerFactory emf;

	public JpaFileDao(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@SuppressWarnings("unchecked")
	public List<File> getAllFiles() {
		EntityManager em = emf.createEntityManager();
		List<File> files = (List<File>) em.createQuery("SELECT f FROM File f").getResultList();
		em.close();
		return files;
	}

	public void addFile(File f) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();
		em.persist(f);
		t.commit();
		em.close();
	}

	public File findFile(Long id) {
		EntityManager em = emf.createEntityManager();

		File file = em.find(File.class, id);

		em.close();
		return file;
	}

	public void removeFile(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		File p = em.find(File.class, id);

		t.begin();
		try {
			em.remove(p);
			t.commit();
		} catch (Exception e) {
			System.out.println("You can't remove this file. caused by :" + e);
		}
		em.close();
	}

	public void modifyFile(Long id, String name, String type,String url,Float weight,String description,Category category) {
		File file = findFile(id);
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		t.begin();
		file.setName(name);
		file.setCategory(category);
		file.setType(type);
		file.setUrl(url);
		file.setWeight(weight);
		file.setDescription(description);
		try {
			t.commit();
		}catch(Exception e) {
			System.out.println("cant commit");
		}
		em.close();
	}

}
