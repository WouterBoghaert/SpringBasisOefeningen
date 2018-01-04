package be.vdab.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.entities.Persoon;

public class PersoonRepositoryMeerdereRegels implements PersoonRepository {
	private final String bestandsnaam;
	
	public PersoonRepositoryMeerdereRegels(String bestandsnaam) {
		this.bestandsnaam = bestandsnaam;
	}
	
	@Override
	public List<Persoon> findAll() throws IOException {
		List<Persoon> personen = new ArrayList<>();
		File inputFile = new File(bestandsnaam);
		try(Scanner scanner = new Scanner(inputFile)) {
			while(scanner.hasNextLine()) {
				int persoonNr = Integer.parseInt(scanner.nextLine());
				String voornaam = scanner.nextLine();
				String familienaam = scanner.nextLine();
				int aantalKinderen = Integer.parseInt(scanner.nextLine());
				personen.add(new Persoon(persoonNr,voornaam,familienaam,aantalKinderen));			
			}
		} 
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		return personen;
	}
}
