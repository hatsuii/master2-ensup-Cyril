package org.cyril.dao;

import java.util.List;

import org.cyril.domaine.Annonce;
import org.cyril.domaine.Personne;

public class AnnonceDao implements IDaoAnnonce {

	@Override
	public int creerAnnonce(Personne personne, Annonce a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Annonce getAnnonce(int idAnnonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAnnonce(int idAnnonce, Annonce a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAnnonce(Personne p, Annonce a) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Annonce> findAllAnnonce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAnnonceId(Annonce a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
