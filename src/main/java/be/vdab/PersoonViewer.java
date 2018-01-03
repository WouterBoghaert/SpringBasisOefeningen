package be.vdab;

import java.util.List;

import be.vdab.entities.Persoon;

class PersoonViewer {
	private final PersoonEigenschap [] eigenschappen;
	
	PersoonViewer(PersoonEigenschap [] eigenschappen) {
		this.eigenschappen = eigenschappen;
	}

	public void afbeelden(List<Persoon> personen) {
		for (Persoon persoon : personen) {
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
				System.out.println();
			}
		}
	}
}
