package fr.mds.explorer.servlet.File;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.explorer.dao.jpa.JpaCategoryDao;
import fr.mds.explorer.dao.jpa.JpaFileDao;
import fr.mds.explorer.entity.Category;
import fr.mds.explorer.entity.File;
import fr.mds.explorer.util.PersistenceManager;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/auth/modifyFile")
public class ModifyFileServlet extends HttpServlet {
	EntityManagerFactory emf = PersistenceManager.getEMF();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String url = req.getParameter("url");
		Float weight = Float.parseFloat(req.getParameter("weight"));
		String description = req.getParameter("description");
		Long categoryId = Long.parseLong(req.getParameter("categoryId"));
		Category category = new JpaCategoryDao(emf).findCategory(categoryId);
		
		File f = new File(name, type, url, description, weight, category);

		new JpaFileDao(emf).modifyFile(id,name,type,url,weight,description,category);

		resp.sendRedirect("/Explorer/listFiles");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Category> categories = new JpaCategoryDao(emf).getAllCategories();
		req.setAttribute("categories", categories); 
		req.getRequestDispatcher("/auth/modifyFile.jsp").forward(req, resp);
	}
}
