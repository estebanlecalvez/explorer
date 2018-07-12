package fr.mds.explorer.servlet.File;

import java.io.IOException;
import java.util.List;

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
@WebServlet(urlPatterns = "/listFiles")
public class ListFileServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManagerFactory emf = PersistenceManager.getEMF();

		List<File> products = new JpaFileDao(emf).getAllFiles();
		req.setAttribute("files", products);
		req.getRequestDispatcher("/listFiles.jsp").forward(req, resp);
	}
}
