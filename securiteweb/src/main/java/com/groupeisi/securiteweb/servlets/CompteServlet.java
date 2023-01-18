package com.groupeisi.securiteweb.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.groupeisi.securiteweb.dao.ICompte;
import com.groupeisi.securiteweb.dao.ICompteImpl;
import com.groupeisi.securiteweb.entities.Compte;

/**
 * Servlet implementation class CompteServlet
 */
@WebServlet("/CompteServlet")
public class CompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ICompte compteDao = new ICompteImpl();	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Compte> comptes = new ArrayList<Compte>();
		try {
	        comptes = compteDao.ListeCompte();
		} catch (Exception e) {
			request.setAttribute("erreur", e.getMessage());
		}
		request.setAttribute("comptes", comptes);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/compte/ajoutcompte.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {	
			Compte compte = new Compte();
			compte.setUsername(request.getParameter("username"));
			compte.setPassword(request.getParameter("password"));
			int result = compteDao.addCompte(compte);
			if(result == 1)
				request.setAttribute("ajout", "sucess");
		} catch (Exception e) {
    	}   
	      this.getServletContext().getRequestDispatcher("/WEB-INF/views/compte/ajoutcompte.jsp").forward(request, response);
	}

}
