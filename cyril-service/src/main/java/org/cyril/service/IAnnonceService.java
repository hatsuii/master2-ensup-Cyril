package org.cyril.service;

import java.util.List;

import org.cyril.domaine.Annonce;
import org.cyril.domaine.Personne;

public interface IAnnonceService {
	// Crud Annonce

	public int creerAnnonce(Personne personne, Annonce a);

	public Annonce getAnnonce(int idAnnonce);

	public void deleteAnnonce(int idAnnonce);

	public void updateAnnonce(Annonce a);

	public List<Annonce> findAllAnnonce();

	public int getAnnonceId(Annonce a);
}
