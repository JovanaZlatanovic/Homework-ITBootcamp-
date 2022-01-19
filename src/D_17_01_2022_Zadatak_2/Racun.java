package D_17_01_2022_Zadatak_2;

public class Racun {

	private String brojRacuna;
	private String ime;
	private int stanje;
	
	
public Racun(String brojRacuna, String ime, int stanje) {
	
		this.brojRacuna = brojRacuna;
		this.ime = ime;
		this.stanje = stanje;
	}


	public String getBrojRacuna() {
		return brojRacuna;
	}


	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public int getStanje() {
		return stanje;
	}

	public void exchange(int amount) {
		
		this.stanje=stanje+amount;
		
		
	}
	
	public void print() {
		System.out.println(this.ime+ " - "+ this.brojRacuna);
		System.out.println("Stanje na racunu je " + stanje + " rsd.");
	}
	
}
