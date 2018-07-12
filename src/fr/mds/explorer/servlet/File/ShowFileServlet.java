package fr.mds.explorer.servlet.File;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.mds.explorer.dao.jpa.JpaFileDao;
import fr.mds.explorer.entity.File;
import fr.mds.explorer.util.PersistenceManager;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/showFile")
public class ShowFileServlet extends HttpServlet {
	


	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = PersistenceManager.getEMF();
		String idString = req.getParameter("id");
		Long id = Long.parseLong(idString);
		File file = new JpaFileDao(emf).findFile(id);
		req.setAttribute("file", file);
		req.getRequestDispatcher("/showFile.jsp")
		.forward(req, resp);
	}
}
