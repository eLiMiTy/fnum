package ARBEIT;
//FABIAN TEISE
public class Aktie extends Gegenstand {
	
	private String unternehmen;
	private int nennwert;
	
	public String getUnternehmen() {
		return unternehmen;
	}

	public void setUnternehmen(String unternehmen) {
		this.unternehmen = unternehmen;
	}

	public int getNennwert() {
		return nennwert;
	}

	public void setNennwert(int nennwert) {
		this.nennwert = nennwert;
	}

	public double getVersicherungswert() {
		return versicherungswert;
	}

	public void setVersicherungswert(int versicherungswert) {
		this.versicherungswert = versicherungswert;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aktie(int id, double versicherungwert, String unternehmen , int nennwert) {
		this.id = id;
		this.nennwert = nennwert;
		this.unternehmen = unternehmen;
		this.versicherungswert = versicherungswert;
	}
}
