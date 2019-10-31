package org.cyril.dao;

import java.util.List;

import org.cyril.domaine.Annonce;
import org.cyril.domaine.Personne;

public interface IDaoAnnonce {
	// Crud Annonce

	public int creerAnnonce(Personne personne, Annonce a);

	public Annonce getAnnonce(int idAnnonce);

	public void deleteAnnonce(int idAnnonce, Annonce a);

	public void updateAnnonce(Personne p, Annonce a);

	public List<Annonce> findAllAnnonce();

	public int getAnnonceId(Annonce a);

}
