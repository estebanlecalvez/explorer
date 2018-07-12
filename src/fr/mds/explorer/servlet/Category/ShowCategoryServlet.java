package fr.mds.explorer.servlet.Category;

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
@WebServlet(urlPatterns="/showCategory")
public class ShowCategoryServlet extends HttpServlet {
	


	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = PersistenceManager.getEMF();
		String idString = req.getParameter("id");
		Long id = Long.parseLong(idString);
		Category category = new JpaCategoryDao(emf).findCategory(id);
		req.setAttribute("category", category);
		req.getRequestDispatcher("/showCategory.jsp")
		.forward(req, resp);
	}
}
