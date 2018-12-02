package ganti.randomthings.models;

public class Place {
	
	private String ort;
	private int plz;
	
	public Place(String ort, int plz) {
		this.ort = ort;
		this.plz = plz;
	}
	
	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

}
