package ganti.randomthings.models;

public class Street {
	private int nr;
	private String name;
	
	public Street(int nr, String name) {
		this.nr = nr;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " " + nr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
}
