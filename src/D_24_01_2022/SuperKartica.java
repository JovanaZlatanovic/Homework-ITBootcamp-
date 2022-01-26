package D_24_01_2022;

public class SuperKartica {

	private String brojKartice;
	private String ime;
	private int popust;

	public SuperKartica() {
		super();
	}

	public SuperKartica(String brojKartice, String ime, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.ime = ime;
		this.popust = popust;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

	public void print() {
		System.out.println(this.brojKartice + ", " + this.ime);
	}

}
