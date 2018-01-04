package be.vdab.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.entities.Persoon;

public class PersoonRepositoryCSV implements PersoonRepository {
	private final String bestandsnaam;
	
	public PersoonRepositoryCSV(String bestandsnaam) {
		this.bestandsnaam = bestandsnaam;
	}
	
	@Override
	public List<Persoon> findAll() throws IOException {
		List<Persoon> personen = new ArrayList<>();
		File inputFile = new File(bestandsnaam);
		try(Scanner scanner = new Scanner(inputFile)) {
			while(scanner.hasNextLine()) {
				String regel= scanner.nextLine();
				try(Scanner regelScanner = new Scanner(regel)) {
					regelScanner.useDelimiter(",");
					int persoonNr = regelScanner.nextInt();
					String voornaam = regelScanner.next();
					String familienaam = regelScanner.next();
					int aantalKinderen = regelScanner.nextInt();
					personen.add(new Persoon(persoonNr,voornaam,familienaam,aantalKinderen));
				}
			}
		} 
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		return personen;
	}
}
