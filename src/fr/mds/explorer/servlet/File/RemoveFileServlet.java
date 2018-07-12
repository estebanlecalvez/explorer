package fr.mds.explorer.servlet.File;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.explorer.dao.jpa.JpaFileDao;
import fr.mds.explorer.util.PersistenceManager;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/auth/removeFile")
public class RemoveFileServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = PersistenceManager.getEMF();
		long id = Long.parseLong(req.getParameter("id"));
		
		new JpaFileDao(emf).removeFile(id);
		resp.sendRedirect("/Explorer/listFiles");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
