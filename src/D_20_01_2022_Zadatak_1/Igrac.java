package D_20_01_2022_Zadatak_1;

public class Igrac extends Osoba{
	
	protected int brojIgraca;
	protected String pozicija;
	protected boolean kapiten;
	
	
	public int getBrojIgraca() {
		return brojIgraca;
	}


	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}


	public String getPozicija() {
		return pozicija;
	}


	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}


	public boolean isKapiten() {
		return kapiten;
	}


	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}


	public Igrac(String imeIPrezime, String jmbg, int godRodjenja,int brojIgraca, String pozicija, boolean kapiten) {
		super( imeIPrezime,  jmbg,  godRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}


	public Igrac() {
		super();
	}
	@Override
	public void print() {
		System.out.println(this.imeIPrezime+ ", "+this.jmbg+ ", "+ this.godRodjenja);
		System.out.println("Broj igraca je: "+this.brojIgraca);
		System.out.println("Pozicija igraca je: " +this.pozicija);
		if(kapiten) {System.out.println("Igrac je kapiten.");
		
		}
	}

}
