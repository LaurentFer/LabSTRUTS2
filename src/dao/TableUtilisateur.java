package dao;

import java.util.ArrayList;
import java.util.List;
import bean.Utilisateur;

public class TableUtilisateur {
	/**
	* Créer une liste d'utilisateurs.
	* @return
	* @return malist
	*/
	public List<Utilisateur> creationList() {
		
		List<Utilisateur> malist = new ArrayList<Utilisateur>();
		Utilisateur a = new Utilisateur();
		a.setUsername("bob");
		a.setPassword("bob123");
		Utilisateur b = new Utilisateur();
		b.setUsername("charlie");
		b.setPassword("charlie123");
		Utilisateur c = new Utilisateur();
		c.setUsername("admin");
		c.setPassword("admin");
		Utilisateur d = new Utilisateur();
		d.setUsername("user");
		d.setPassword("user");
		
		malist.add(a);
		malist.add(b);
		malist.add(c);
		malist.add(d);
		
		return malist;
	}
}