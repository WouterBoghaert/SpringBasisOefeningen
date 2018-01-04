package be.vdab.entities;

public class Persoon {
	private final int persoonNr;
	private final String voornaam;
	private final String familienaam;
	private final int aantalKinderen;
	
	public Persoon(int persoonNr, String voornaam, String familienaam, int aantalKinderen) {
		this.persoonNr = persoonNr;
		this.voornaam = voornaam;
		this.familienaam = familienaam;
		this.aantalKinderen = aantalKinderen;
	}

	public int getPersoonNr() {
		return persoonNr;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getFamilienaam() {
		return familienaam;
	}

	public int getAantalKinderen() {
		return aantalKinderen;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aantalKinderen;
		result = prime * result + ((familienaam == null) ? 0 : familienaam.hashCode());
		result = prime * result + persoonNr;
		result = prime * result + ((voornaam == null) ? 0 : voornaam.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Persoon)) {
			return false;
		}
		Persoon other = (Persoon) obj;
		if (aantalKinderen != other.aantalKinderen) {
			return false;
		}
		if (familienaam == null) {
			if (other.familienaam != null) {
				return false;
			}
		} else if (!familienaam.equals(other.familienaam)) {
			return false;
		}
		if (persoonNr != other.persoonNr) {
			return false;
		}
		if (voornaam == null) {
			if (other.voornaam != null) {
				return false;
			}
		} else if (!voornaam.equals(other.voornaam)) {
			return false;
		}
		return true;
	}	
}
