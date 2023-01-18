package com.groupeisi.securiteweb.test;
import com.groupeisi.securiteweb.dao.IDroit;
import com.groupeisi.securiteweb.dao.IDroitImpl;
import com.groupeisi.securiteweb.entities.Droit;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDroit droitDao = new IDroitImpl();	
		Droit droit = new Droit();
		droit.setName("DROIT_USER");
		int result = droitDao.addDroit(droit);
		System.out.println(result);

	}

}

