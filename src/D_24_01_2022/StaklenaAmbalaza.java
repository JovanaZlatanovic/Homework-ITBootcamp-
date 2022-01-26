package D_24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {

	private double kaucijaZaFlasu;
	private boolean kaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaklenaAmbalaza(String naziv, String barkod, double netoTezina, double brutoTezina, double kaucijaZaFlasu,
			boolean kaucija, double osnovnaCena) {
		super(naziv, barkod, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.kaucija = kaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isKaucija() {
		return kaucija;
	}

	public void setKaucija(boolean kaucija) {
		this.kaucija = kaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {

		if (kaucija) {

			return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
		}

		return this.osnovnaCena * 1.2;

	}

	@Override
	public void print() {
		System.out.println("Naziv artikla: " + this.naziv);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Neto tezina: " + this.netoTezina + ", " + "Bruto tezina: " + this.brutoTezina);
		System.out.println("Cena artikla " + this.cenaArtikla());
		if (kaucija) {
			System.out.println("Placa se kaucija za flasu.");
		} else {
			System.out.println("Ne placa se kaucija za flasu.");
		}

	}
}

