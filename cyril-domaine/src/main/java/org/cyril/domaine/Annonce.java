package org.cyril.domaine;

public class Annonce {
	private int idAnnonce;
	private String intitule;
	private String detail;
	private int prix;
	private Personne proprietaire;

	public Annonce(int idAnnonce, String intitule, String detail, int prix, Personne proprietaire) {
		super();
		this.idAnnonce = idAnnonce;
		this.intitule = intitule;
		this.detail = detail;
		this.prix = prix;
		this.proprietaire = proprietaire;
	}

	public int getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public Personne getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}

	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", intitule=" + intitule + ", detail=" + detail + ", prix=" + prix
				+ ", proprietaire=" + proprietaire + "]";
	}

}
