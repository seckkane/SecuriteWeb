package com.groupeisi.securiteweb.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.groupeisi.securiteweb.config.HibernateUtil;
import com.groupeisi.securiteweb.entities.Droit;



public class IDroitImpl implements IDroit {

	private Session session;
	private Transaction transaction;
	
	public IDroitImpl () {
		session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public int addDroit(Droit droit) {
		try {
			transaction = session.beginTransaction();
			session.save(droit);
			transaction.commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			session.close();
			return 0;
		}	
	}

	public List<Droit> ListeDroit() {
		
		Criteria criteria= session.createCriteria(Droit.class);
		List droits = criteria.list();
		return droits;
		
	}

}
