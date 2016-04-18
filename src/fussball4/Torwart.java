package fussball4;

public class Torwart extends Spieler{

	private int reaktion;
	
	public Torwart (String name, int alter, int staerke, int motivation, int reaktion) {
		super(name, alter, staerke, 0, motivation, 0);
		this.reaktion = reaktion;
	}

	public int getReaktion() {
		return reaktion;
	}

	public void setReaktion(int reaktion) {
		this.reaktion = reaktion;
	}
	
	@Override
	public String toString() {
		String text = "\nName: " + getName() + "\nAlter: " + getAlter() + "\nStärke: " + getStaerke() + "\nMotivation: " + getMotivation() + "\nReaktion: " + getReaktion();
		return text;
	}
}
