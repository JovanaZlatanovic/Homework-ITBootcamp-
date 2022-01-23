package D_21_01_2022_Zadatak_1;

import java.util.ArrayList;

public abstract class Radnik {

	protected String imeIPrezime;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();

public Radnik() {
		
	}

	public Radnik(String imeIPrezime) {

		this.imeIPrezime = imeIPrezime;
		this.sektori = new ArrayList<Sektor>();

	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public abstract double plata();

	public void zaposliSeUSektor(Sektor nazivSektora) {
	   
	
		 this.sektori.add(nazivSektora);
		
		}
}
		

//Kreirati abstraktnu klasu Radnik koja ima:
//ime i prezime ++ 
//niz sektora u kojima radi ++ 
//abstraktnu metodu koja vraca platu radnika
//metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom