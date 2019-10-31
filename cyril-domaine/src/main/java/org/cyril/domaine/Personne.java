package org.cyril.domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {

	private int personneId;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private String dateNaissance;
	private ArrayList<Annonce> listeAnnonce;

	public Personne() {

	}

	public Personne(int personneId, String nom, String prenom, String login, String motDePasse, String dateNaissance) {
		super();
		this.personneId = personneId;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.dateNaissance = dateNaissance;
	}

	public int getPersonneId() {
		return personneId;
	}

	public void setPersonneId(int personneId) {
		this.personneId = personneId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Collection<Annonce> getListeAnnonce() {
		return listeAnnonce;
	}

	public void setListeAnnonce(ArrayList<Annonce> listeAnnonce) {
		this.listeAnnonce = listeAnnonce;
	}

}
