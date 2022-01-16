package D2_14_01_2022;

public class Proizvod {


	private String sifra;
	private String naziv;
	private double cena;

	public Proizvod(String sifra, String naziv, double cena) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.cena = cena;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSifra() {
		return this.sifra;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public double getCenaKg() {
		return this.cena;
	}

	public double getCenaLb() {
		return this.cena = cena / 2.2046;

	}

	public void print() {
		System.out.println(sifra + " " + naziv);
	}
}

