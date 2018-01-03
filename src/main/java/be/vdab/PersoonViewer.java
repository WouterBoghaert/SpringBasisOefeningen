package be.vdab;

import java.util.List;

import be.vdab.entities.Persoon;

class PersoonViewer {
	public void afbeelden(List<Persoon> personen) {
		for (Persoon persoon : personen) {
			System.out.println("PersoonNr: \t\t" + persoon.getPersoonNr());
			System.out.println("Voornaam: \t\t" + persoon.getVoornaam());
			System.out.println("Familienaam: \t\t" + persoon.getFamilienaam());
			System.out.println("Aantal kinderen: \t" + persoon.getAantalKinderen());
			System.out.println();
		}
	}
}
