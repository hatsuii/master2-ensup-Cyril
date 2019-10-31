package org.cyril.service;

import static org.junit.Assert.assertEquals;

import java.security.Provider.Service;

import org.cyril.dao.AnnonceDao;
import org.cyril.domaine.Annonce;
import org.cyril.domaine.Personne;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestService {

	@Mock

	private AnnonceDao mockAnnonce;
	private Personne mockPersonne;

	@InjectMocks

	private Service service;

	@Before

	public void setUp() throws Exception

	{

		MockitoAnnotations.initMocks(this);

	}

	@Test

	public void TestCrerPersonne() {

		Personne personne = new Personne(1, "jacky", "michel", "123", "123", "0102/18");

		Mockito.when(mockPersonne.creerPersonne(personne)).thenReturn(0);

		assertEquals(0, mockPersonne.creerPersonne(personne));

	}

	@Test

	public void TestCrerAnnonce() {

		Personne personne = new Personne(1, "jacky", "michel", "123", "123", "0102/18");

		Annonce annonce = new Annonce(1, "intituke", "detail", 12, personne);

		Mockito.when(mockAnnonce.creerAnnonce(personne, annonce)).thenReturn(0);

		assertEquals(0, mockAnnonce.creerAnnonce(personne, annonce));

	}

	@Test

	public void TestGetAnnonce() {

		Personne personne = new Personne(1, "jacky", "michel", "123", "123", "0102/18");

		Annonce annonce = new Annonce(1, "intituke", "detail", 12, personne);

		Mockito.when(mockAnnonce.getAnnonce(1)).thenReturn(annonce);

		assertEquals(annonce, mockAnnonce.getAnnonce(1));

	}

	@Test

	public void TestGetPersonne() {

		Personne personne = new Personne(1, "jacky", "michel", "123", "123", "01/02/18");

		Annonce annonce = new Annonce(1, "intituke", "detail", 12, personne);

		Mockito.when(mockPersonne.getPersonne(1)).thenReturn(personne);

		assertEquals(personne, mockPersonne.getPersonne(1));

	}

}
