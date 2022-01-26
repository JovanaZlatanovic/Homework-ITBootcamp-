package D_24_01_2022;

public class Tetrapak extends Ambalaza {

	private boolean recikabilan;
	private double osnovnaCena;

	public Tetrapak(String naziv, String barkod, double netoTezina, double brutoTezina, boolean recikabilan,
			double osnovnaCena) {
		super(naziv, barkod, netoTezina, brutoTezina);
		this.recikabilan = recikabilan;
		this.osnovnaCena = osnovnaCena;
	}

	public Tetrapak() {
		super();

	}

	public boolean isRecikabilan() {
		return recikabilan;
	}

	public void setRecikabilan(boolean recikabilan) {
		this.recikabilan = recikabilan;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (recikabilan) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		}

		return this.osnovnaCena;
	}

	@Override
	public void print() {
		System.out.println("Naziv artikla: " + this.naziv);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Neto tezina: " + this.netoTezina + ", " + "Bruto tezina: " + this.brutoTezina);
		System.out.println("Cena artikla " + this.cenaArtikla());
		if (recikabilan) {
			System.out.println("Artikal je recikabilan.");
		} else {
			System.out.println("Artikal nije recikabilan.");
		}
	}

}

