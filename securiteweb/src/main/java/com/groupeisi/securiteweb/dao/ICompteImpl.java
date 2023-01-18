package com.groupeisi.securiteweb.dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupeisi.securiteweb.config.HibernateUtil;
import com.groupeisi.securiteweb.entities.Compte;


public class ICompteImpl implements ICompte {
	
	private Session session;
	private Transaction transaction;
	
	public ICompteImpl () {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	public int addCompte(Compte compte) {
		try {
			transaction = session.beginTransaction();
			session.save(compte);
			transaction.commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}	
	}

	public Compte getCompte(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Compte> ListeCompte() {
		Criteria criteria= session.createCriteria(Compte.class);
		List comptes = criteria.list();
		return comptes;
	}

}
