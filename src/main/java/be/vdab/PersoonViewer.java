package be.vdab;

import java.io.IOException;

import org.springframework.stereotype.Controller;

import be.vdab.entities.Persoon;
import be.vdab.services.PersoonService;

@Controller
class PersoonViewer {
	private final PersoonEigenschap [] eigenschappen;
	private final PersoonService persoonService;
	
	PersoonViewer (PersoonEigenschap [] eigenschappen, 
		PersoonService persoonService) {
		this.eigenschappen = eigenschappen;
		this.persoonService = persoonService;
	}


	public void afbeelden() throws IOException {
		for (Persoon persoon : persoonService.findAll()) {
			for (PersoonEigenschap eigenschap : eigenschappen) {
				if(eigenschap.equals(PersoonEigenschap.PERSOON_NR)) {
					System.out.println("PersoonNr: \t\t" + persoon.getPersoonNr());
				}
				if(eigenschap.equals(PersoonEigenschap.VOORNAAM)) {
					System.out.println("Voornaam: \t\t" + persoon.getVoornaam());
				}
				if(eigenschap.equals(PersoonEigenschap.FAMILIENAAM)) {
					System.out.println("Familienaam: \t\t" + persoon.getFamilienaam());
				}
				if(eigenschap.equals(PersoonEigenschap.AANTAL_KINDEREN)) {
					System.out.println("Aantal kinderen: \t" + persoon.getAantalKinderen());
				}
			}
			System.out.println();
		}
	}
}
