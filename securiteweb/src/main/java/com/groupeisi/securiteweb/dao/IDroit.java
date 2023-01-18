package com.groupeisi.securiteweb.dao;
import java.util.List;

import com.groupeisi.securiteweb.entities.Droit;

public interface IDroit {

	public int addDroit (Droit droit);
	public List<Droit> ListeDroit();
}
