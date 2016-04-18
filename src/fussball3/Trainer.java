package fussball3;

public class Trainer extends Person{

	private int erfahrung;

	public Trainer (String name, int alter,int erfahrung) {
		super(name, alter);
		this.erfahrung = erfahrung;

	}

	public int getErfahrung() {
		return erfahrung;
	}

	public void setErfahrung(int erfahrung) {
		this.erfahrung = erfahrung;
	}

	@Override
	public String toString() {
		String text = "\nName: " + getName() + "\nAlter: " + getAlter() + "\nErfahrung: " + getErfahrung();
		return text;
	}
}