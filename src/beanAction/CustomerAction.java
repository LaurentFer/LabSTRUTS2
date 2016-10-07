package beanAction;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import bean.Customer;

public class CustomerAction extends ActionSupport implements SessionAware {
	
	private static final 	long serialVersionUID = 1L;
	private					Customer 				monClient;
	private static 			ArrayList<Customer> 	maListe = new ArrayList<Customer>();
	private 				Map<String,Object> 		maSession;
	
	public String execute(){
		// Récupérer les données du formulaire
		//monClient = this.monClient;
		maListe.add(monClient);	
		//maSession.put("Last",monClient);
		maSession.put("Listing",maListe);
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> pMaSession) {
		this.maSession = pMaSession;		
	}

	public Customer getMonClient() {
		return monClient;
	}

	public void setMonClient(Customer pMonClient) {
		this.monClient = pMonClient;
	}

}
