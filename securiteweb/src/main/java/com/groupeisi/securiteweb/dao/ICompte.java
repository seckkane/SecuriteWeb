package com.groupeisi.securiteweb.dao;
import java.util.List;

import com.groupeisi.securiteweb.entities.Compte;

public interface ICompte {

	public int addCompte(Compte compte);
	public Compte getCompte(int id);
	public boolean login(String username, String password);
	public List<Compte> ListeCompte();

}
