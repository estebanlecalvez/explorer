package fr.mds.explorer.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import fr.mds.explorer.dao.CategoryDao;
import fr.mds.explorer.entity.Category;
import fr.mds.explorer.entity.File;

public class JpaCategoryDao implements CategoryDao {
	private EntityManagerFactory emf;

	public JpaCategoryDao(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getAllCategories() {
		EntityManager em = emf.createEntityManager();
		List<Category> categories = (List<Category>) em.createQuery("SELECT c FROM Category c").getResultList();
		em.close();
		return categories;
	}

	@Override
	public void addCategory(Category c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(c);
		t.commit();
		em.close();
	}

	@Override
	public Category findCategory(Long id) {
		EntityManager em = emf.createEntityManager();
		Category category = em.find(Category.class, id);
		em.close();
		return category;
	}

	public void removeCategory(Long id) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		Category f = em.find(Category.class, id);

		t.begin();
		try {
		em.remove(f);
		t.commit();
		}catch(Exception e) {
			System.out.println("You can't delete a category which have childs" +e);
		}
		em.close();
	}



}
