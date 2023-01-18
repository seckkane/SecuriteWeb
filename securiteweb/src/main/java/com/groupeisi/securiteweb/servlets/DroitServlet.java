package com.groupeisi.securiteweb.servlets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.groupeisi.securiteweb.dao.IDroit;
import com.groupeisi.securiteweb.dao.IDroitImpl;
import com.groupeisi.securiteweb.entities.Droit;
/**
 * Servlet implementation class DroitServlet
 */
@WebServlet("/DroitServlet")
public class DroitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IDroit droitDao = new IDroitImpl();	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DroitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Droit> droits = new ArrayList<Droit>();
		try {
	        droits = droitDao.ListeDroit();
		} catch (Exception e) {
			request.setAttribute("erreur", e.getMessage());
		}
		request.setAttribute("droits", droits);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/droit/ajoutdroit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {	
			Droit droit = new Droit();
			droit.setName(request.getParameter("namedroit"));
			int result = droitDao.addDroit(droit);
			if(result == 1)
				request.setAttribute("ajout", "sucess");
		} catch (Exception e) {
    	}   
	      this.getServletContext().getRequestDispatcher("/WEB-INF/views/droit/ajoutdroit.jsp").forward(request, response);
	}

}
