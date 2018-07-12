package fr.mds.explorer.servlet.Category;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.explorer.dao.jpa.JpaCategoryDao;
import fr.mds.explorer.entity.Category;
import fr.mds.explorer.util.PersistenceManager;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/auth/addCategory")
public class AddCategoryServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = PersistenceManager.getEMF();
		String name = req.getParameter("name");
		String description = req.getParameter("description");

		Category category = new Category(name,description);
		
		new JpaCategoryDao(emf).addCategory(category);
		
		 resp.sendRedirect("/Explorer/listCategories");
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/auth/addCategory.jsp").forward(req, resp);
	}
}
