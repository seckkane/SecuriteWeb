package com.groupeisi.securiteweb.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // generation par ordre continu [auto = hasard]
	private int id;
	@Column(name = "username", nullable = false, length = 100, unique = true)
	private String username;
	@Column(name = "password", nullable = false, length = 100)
	private String password;
	@ManyToMany(fetch = FetchType.LAZY) // au chargement de chaque compte on charge ses droits # LAZY
	List<Droit> droits = new ArrayList<Droit>();
	
	public Compte() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Droit> getDroits() {
		return droits;
	}

	public void setDroits(List<Droit> droits) {
		this.droits = droits;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
