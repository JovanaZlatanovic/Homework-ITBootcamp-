package D_13_01_2022;

public class FaceBookPost {
	private String ime;
	private String ime2;
	private String tekst;
	private int brojLajkova;
	private int brojDeljenja;

	public FaceBookPost(String ime, String ime2, String tekst, int brojLajkova, int brojDeljenja) {
		this.ime = ime;
		this.ime2 = ime2;
		this.tekst = tekst;
		this.brojLajkova = brojLajkova;
		this.brojDeljenja = brojDeljenja;

	}

	public String getIme() {
		return ime;
	}

	public String getTekst() {
		return tekst;
	}

	public String getIme2() {
		return ime2;
	}

	public int getBrojLajkova() {
		return brojLajkova;
	}

	public int getBrojDeljenja() {
		return brojDeljenja;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public void setIme2(String ime2) {
		this.ime2 = ime2;
	}

	public void like() {
		this.brojLajkova++;

	}

	public void dislike() {

		if (brojLajkova > 0) {
			brojLajkova = brojLajkova - 1;
		}

	}

	public void share() {
		brojDeljenja++;
	}

	public void print() {

		System.out.println(ime + " >>> " + ime2);
		System.out.println(tekst);
		System.out.println("Likes " + brojLajkova + " | " + " Shares " + brojDeljenja);
		System.out.println();

	}

}
