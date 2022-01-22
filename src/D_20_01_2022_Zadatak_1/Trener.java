package D_20_01_2022_Zadatak_1;

public class Trener extends Osoba{
	
	protected int godIskustva;
	private String tipTrenera;
	
	public Trener(String imeIPrezime, String jmbg, int godRodjenja,   int godIskustva, String tipTrenera) {
		super( imeIPrezime,  jmbg,  godRodjenja);
		this.godIskustva = godIskustva;
		this.tipTrenera = tipTrenera;
	}

	public Trener() {
		super();
	}

	public int getGodIskustva() {
		return godIskustva;
	}

	public void setGodIskustva(int godIskustva) {
		this.godIskustva = godIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}
	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	@Override
	public void print() {
		System.out.println(this.imeIPrezime+ ", "+this.jmbg+ ", "+ this.godRodjenja);
		System.out.println("Tip trenera je "+ this.tipTrenera);
		System.out.println("Godine iskustva trenera: "+this.godIskustva);
		
		
		
	}
}
