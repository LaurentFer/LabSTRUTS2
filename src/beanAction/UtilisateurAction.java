package beanAction;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.UtilisateurService;
import bean.Utilisateur;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UtilisateurAction extends ActionSupport implements SessionAware {
	//-------------------------------------------------------------
	// Properties
	//-------------------------------------------------------------
	/**
	* Description :
	* long serialVersionUID
	*/
	private static final long serialVersionUID = 1L;
	// Objets
	private Utilisateur utilisateur;
	private Map<String,Object> maSession;
	/**
	* utilisateur authentifié ?
	*/
	private boolean authentificationUtilisateur;
	//-------------------------------------------------------------
	// Getters et setters
	//-------------------------------------------------------------
	/**
	* Accesseur
	* @return l’utilisateur
	*/
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	/**
	* Mutateur
	* @param utilisateur à positionner
	*/
	public void setUtilisateur(Utilisateur pUtilisateur) { //on préfixe les paramétre (naming unique, 'p' c'est bien )
		this.utilisateur = pUtilisateur;
	}
	/**
	* Methode
	* Description : Permet d'authentifier un utilisateur en fonction de son mot de passe et son
	* login.
	* @return @struts ERROR or SUCCESS
	*/
	public String authentifierUtilisateurs() {
		// Récupérer les données du formulaire
		//utilisateur = this.utilisateur; pas besoin le submit de la jsp grâce à struts va déclencher le setter
		// Créer un service
		UtilisateurService monService = new UtilisateurService();
		//Vérifier si l'authentification est ok
		authentificationUtilisateur = monService.isAuthentifier(this.utilisateur.getUsername(), this.utilisateur.getPassword());
		//Si l'authentification est ok
		if (authentificationUtilisateur){
			//Récupérer la session courante	
			//--->Implémenter à l'appel de la classe avec SessionAware
			//Renseigner la session avec les variables nécessaires
			maSession.put("authentification", authentificationUtilisateur);
			maSession.put("nom", this.utilisateur.getUsername());
			//Afficher message dans la console
			System.out.println("Etat auth :"+authentificationUtilisateur);
			System.out.println("Nom :"+this.utilisateur.getUsername());
			//Retourner authentification ok
			return "success";
		} else {
			//Affichermessage dans la console
			System.out.println("Etat auth :"+authentificationUtilisateur);
			//Retourner authentification incorrecte
			if (this.utilisateur.getUsername().equals("") && this.utilisateur.getPassword().equals("")){
				return "input";
			} else {
				addActionError(getText("error.login"));
				return "error";
			}
		}
	}
	@Override
	public void setSession(Map<String, Object> pMaSession) {
		this.maSession = pMaSession;
	}
}