package D_21_01_2022_Zadatak_1;

public class Sektor {
	
	protected String nazivSektora;
	protected int plata;
	
	
public Sektor() {
		
	}


	public Sektor(String nazivSektora, int plata) {
		super();
		this.nazivSektora = nazivSektora;
		this.plata = plata;
	}


	public String getNazivSektora() {
		return nazivSektora;
	}


	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}


	public int getPlata() {
		return plata;
	}


	public void setPlata(int plata) {
		this.plata = plata;
	}
	
	

}
//Kreirati klasu Sektor koja ima:
//naziv sektora
//platu koja je za taj sektor