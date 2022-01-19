package D_18_01_2022_Zadatak_1;

public class Ispit {
	
	private String naziv;
	private int ocena;
	private String imeProf;
	
	
	public Ispit(String naziv, int ocena, String imeProf) {
		
		this.naziv = naziv;
		this.ocena = ocena;
		this.imeProf = imeProf;
		
		
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public int getOcena() {
		return ocena;
	}


	public void setOcena(int ocena) {
		this.ocena = ocena;
	}


	public String getImeProf() {
		return imeProf;
	}


	public void setImeProf(String imeProf) {
		this.imeProf = imeProf;
	}
   
	public boolean jePolozio() {
		if(ocena>5 && ocena<11) { return true;}
		return false;
	}
	
	public void print() {
		System.out.println(this.naziv + " - "+ this.imeProf + " - "+ this.ocena);
		
	}
	
}
