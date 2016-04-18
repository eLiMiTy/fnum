package Fussball;

public class Spieler {

	private String name;
	private int alter;
	private int staerke;
	private int torschuss;
	private int tore;
	private int motivation;
	
	public Spieler (String name, int alter, int staerke, int torschuss, int tore, int motivation) {
		this.name = name;
		this.alter = alter;
		this.staerke = staerke;
		this.torschuss = torschuss;
		this.tore = tore;
		this.motivation = motivation;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
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
