package service;

import java.util.List;

import bean.Utilisateur;
import dao.TableUtilisateur;

public class UtilisateurService {

	//-------------------------------------------------------------
	// M�thodes du mod�le
	//-------------------------------------------------------------
	/**
	* M�thode d'authentification de l'utilisateur
	* 
	* * @param loginForm
	* @param passwordForm
	* @return
	*/
	public boolean isAuthentifier(String loginForm, String passwordForm) {
		
	// R�cup�rer la liste dans la base de donn�es (ici en dur dans une collection)
	TableUtilisateur currentListe = new TableUtilisateur();
	List<Utilisateur> malist = currentListe.creationList();
	
	// Parcourir et tester les entr�es du formulaire.
	for (int i = 0; i < malist.size(); i++) {
		if (loginForm.equalsIgnoreCase(malist.get(i).getUsername()) & passwordForm.equalsIgnoreCase(malist.get(i).getPassword())) {
			return true;
		}
	}
	return false;
	}
	
}