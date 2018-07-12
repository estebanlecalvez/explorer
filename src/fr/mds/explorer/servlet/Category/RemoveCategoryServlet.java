package fr.mds.explorer.servlet.Category;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.explorer.dao.jpa.JpaCategoryDao;
import fr.mds.explorer.util.PersistenceManager;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/auth/removeCategory")
public class RemoveCategoryServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = PersistenceManager.getEMF();
		long id = Long.parseLong(req.getParameter("id"));
		
		new JpaCategoryDao(emf).removeCategory(id);
		resp.sendRedirect("/Explorer/listCategories");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
