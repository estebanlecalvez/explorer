package fr.mds.explorer.dao;

import java.util.List;

import fr.mds.explorer.entity.Category;

public interface CategoryDao {
	void addCategory(Category p);

	Category findCategory(Long id);

	List<Category> getAllCategories();

	void removeCategory(Long id);
}
