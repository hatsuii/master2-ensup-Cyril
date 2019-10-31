package org.cyril.dao;

import java.util.List;

import org.cyril.domaine.Personne;

public interface IDaoPersonne {

	// Crud Personne

	public int creerPersonne(Personne personne);

	public Personne getPersonne(int idPersonne);

	public void deletePersonne(int idPersonne);

	public void updatePersonne(Personne p);

	public List<Personne> findAllPersonnes();

	public int getPersonneId(Personne p);
}
