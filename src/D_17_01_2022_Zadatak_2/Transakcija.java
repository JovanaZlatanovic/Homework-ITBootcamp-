package D_17_01_2022_Zadatak_2;

public class Transakcija {

	private int id;
	private Racun prenosSa; // sa kojeg se prenosi
	private Racun prenosNa;

	public Transakcija(int id, Racun prenosSa, Racun prenosNa) {

		this.id = id;
		this.prenosSa = prenosSa;
		this.prenosNa = prenosNa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Racun getPrenosSa() {
		return prenosSa;
	}

	public void setPrenosSa(Racun prenosSa) {
		this.prenosSa = prenosSa;
	}

	public Racun getPrenosNa() {
		return prenosNa;
	}

	public void setPrenosNa(Racun prenosNa) {
		this.prenosNa = prenosNa;
	}

	private int provizija(int transakcija) {
		int prov = 0;
		if (transakcija < 4500) {
			prov = 45;
		} else {
			prov = transakcija * 1 / 100;
		}
		return prov;

	}

//	public void izvrsiTransakciju(int sumaTransakcije, Racun posiljalac, Racun primaoc) {
//
//		if (posiljalac.getStanje() >= posiljalac.getStanje() + provizija(sumaTransakcije)) {
//			posiljalac.exchange(-(sumaTransakcije + provizija(sumaTransakcije)));
//			primaoc.exchange(sumaTransakcije);
//		} else {
//			System.out.println("Nemate dovoljno sredstava na racunu za odabranu transakciju.");
//

	
	public void izvrsiTransakciju(int sumaTransakcije) {

		if (this.prenosSa.getStanje() >= sumaTransakcije + provizija(sumaTransakcije)) {
			
			this.prenosSa.exchange(-(sumaTransakcije + provizija(sumaTransakcije)));
			
			this.prenosNa.exchange(sumaTransakcije);
		} else {
			System.out.println("Nemate dovoljno sredstava na racunu za odabranu transakciju.");

		}
	}

	public void print() {
		System.out.println(this.id);
		System.out.println("Racun sa " + this.prenosSa.getIme() + " - " + this.prenosSa.getBrojRacuna());
		System.out.println("stanje na racunu sa kojeg se prenosi novac je "+ this.prenosSa.getStanje());
		System.out.println();
		System.out.println("Racun na " + this.prenosNa.getIme() + " - " + this.prenosNa.getBrojRacuna());
System.out.println("stanje na racunu na koji se prenosi novac je "+ this.prenosNa.getStanje());
	}

}

