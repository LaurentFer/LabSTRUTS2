package service;

import java.util.List;

import bean.Utilisateur;
import dao.TableUtilisateur;

public class UtilisateurService {

	//-------------------------------------------------------------
	// Méthodes du modèle
	//-------------------------------------------------------------
	/**
	* Méthode d'authentification de l'utilisateur
	* 
	* * @param loginForm
	* @param passwordForm
	* @return
	*/
	public boolean isAuthentifier(String loginForm, String passwordForm) {
		
	// Récupérer la liste dans la base de données (ici en dur dans une collection)
	TableUtilisateur currentListe = new TableUtilisateur();
	List<Utilisateur> malist = currentListe.creationList();
	
	// Parcourir et tester les entrées du formulaire.
	for (int i = 0; i < malist.size(); i++) {
		if (loginForm.equalsIgnoreCase(malist.get(i).getUsername()) & passwordForm.equalsIgnoreCase(malist.get(i).getPassword())) {
			return true;
		}
	}
	return false;
	}
	
}