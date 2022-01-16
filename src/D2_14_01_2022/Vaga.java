package D2_14_01_2022;



public class Vaga {

	private boolean mernaJedinica; // true = kg, false= lb!
	private Proizvod proizvod;
	private int tezina;

	public Vaga() {

	}

	public int getTezina() {
		return this.tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

	public boolean getMernaJedinica() {
		return this.mernaJedinica;
	}

	public void setMernajedinica(boolean mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvodd() {
		return this.proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public double sracunajCenu(int kg) {

		boolean mernaJedinica = getMernaJedinica();
		Proizvod proizvodd = getProizvodd();
		if (mernaJedinica == true) {

			double CenaPoKg = proizvodd.getCenaKg();
			double ukupnaCenaZaTezinu = CenaPoKg * kg;
			return ukupnaCenaZaTezinu;

		} else {
			double CenaPoLb = proizvodd.getCenaLb();
			return CenaPoLb * kg;
		}
	}

	public void print() {

		System.out.println(getProizvodd().getSifra() + " - " + getProizvodd().getNaziv());

		String mernaJedinica = "";
		double cenaZaMernuJedinicu = 0;
		if (getMernaJedinica()) {
			mernaJedinica = "kilogram";
			cenaZaMernuJedinicu = getProizvodd().getCenaKg();
		}

		else {
			mernaJedinica = "lb";
			cenaZaMernuJedinicu = getProizvodd().getCenaLb();
		}
		System.out.println(cenaZaMernuJedinicu + " " + mernaJedinica + " x " + getTezina());

		System.out.println("ukupno " + sracunajCenu(getTezina()));
		System.out.println();
	}
}

