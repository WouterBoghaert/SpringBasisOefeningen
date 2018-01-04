package be.vdab.repositories;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import be.vdab.entities.Persoon;

public class PersoonRepositoryMeerdereRegelsTest {

String bestandsnaam;
	
	@Before
	public void before() {
		bestandsnaam = "C:\\Users\\Wouter Boghaert\\Documents\\VDAB Opleiding\\Java\\12 Spring\\personen.txt";
	}
	
	@Test
	public void findAllTest() throws IOException {
		List<Persoon> personen = new ArrayList<>();
		personen.add(new Persoon(1,"Willy","Sommers",2));
		personen.add(new Persoon(2,"Jan","Boghaert",4));
		personen.add(new Persoon(3,"Hans","Desmet",3));
		
		assertEquals(personen, new PersoonRepositoryMeerdereRegels(bestandsnaam).findAll());
	}

}
