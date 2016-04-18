package fussball4;

public class Spieler extends Person {
	
	private int staerke;
	private int torschuss;
	private int tore;
	private int motivation;
	
	public Spieler (String name, int alter, int staerke, int torschuss, int tore, int motivation) {
		super(name, alter);
		this.staerke = staerke;
		this.torschuss = torschuss;
		this.tore = tore;
		this.motivation = motivation;
		
	}

	public int getStaerke() {
		return staerke;
	}

	public void setStaerke(int staerke) {
		this.staerke = staerke;
	}

	public int getTorschuss() {
		return torschuss;
	}

	public void setTorschuss(int torschuss) {
		this.torschuss = torschuss;
	}

	public int getTore() {
		return tore;
	}

	public void setTore(int tore) {
		this.tore = tore;
	}

	public int getMotivation() {
		return motivation;
	}

	public void setMotivation(int motivation) {
		this.motivation = motivation;
	}
	
	@Override
	public String toString() {
		String text = "\nName: " + getName() + "\nAlter: " + getAlter() + "\nStärke: " + getStaerke() + "\nTorschuss: " + getTorschuss() + "\nTore: " + getTore() + "\nMotivation: " + getMotivation();
		return text;
	}
}
