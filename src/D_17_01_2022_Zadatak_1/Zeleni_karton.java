package D_17_01_2022_Zadatak_1;

public class Zeleni_karton {
	
	private String imeIPrezime;
	private String brojIn;
	private String nazivPr;
	private String imeProf;
	private int ocena;
	
	public Zeleni_karton(String imeIPrezime, String brojIn, String nazivPr, String imeProf, int ocena) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.brojIn = brojIn;
		this.nazivPr = nazivPr;
		this.imeProf = imeProf;
		this.ocena=ocena;
		
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getBrojIn() {
		return brojIn;
	}

	public void setBrojIn(String brojIn) {
		this.brojIn = brojIn;
	}

	public String getNazivPr() {
		return nazivPr;
	}

	public void setNazivPr(String nazivPr) {
		this.nazivPr = nazivPr;
	}

	public String getImeProf() {
		return imeProf;
	}

	public void setImeProf(String imeProf) {
		this.imeProf = imeProf;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	public boolean pass(int grade) {
		if (grade>5) { return true;}
	return false;

	}
	public void print() {
		
		System.out.println(this.nazivPr + " - " + this.ocena);
		System.out.println("Student: "+ this.imeIPrezime+ ", "+ this.brojIn);
		System.out.println("Profesor "+ this.imeProf);
		
		System.out.println();
	}
}

