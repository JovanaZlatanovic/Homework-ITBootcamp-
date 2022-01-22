package D_20_01_2022_Zadatak_1;

public class Osoba {
	
	protected String imeIPrezime;
	protected String jmbg;
	protected int godRodjenja;
	
	public Osoba() {
		super();
}

	public Osoba(String imeIPrezime, String jmbg, int godRodjenja) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getJmbg() {
		return jmbg;
	}



	public int getGodRodjenja() {
		return godRodjenja;
	}

	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}
	

	public void print() {
		System.out.println(this.imeIPrezime+ ", "+this.jmbg+ ", "+ this.godRodjenja);
	}
}
