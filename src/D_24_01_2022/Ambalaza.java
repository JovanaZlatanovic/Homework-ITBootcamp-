package D_24_01_2022;

public abstract class Ambalaza {
	
	protected String naziv;
	protected String barkod;
	protected double netoTezina;
	protected double brutoTezina;
	
	
	public Ambalaza() {
}


	public Ambalaza(String naziv, String barkod, double netoTezina, double brutoTezina) {
		super();
		this.naziv = naziv;
		this.barkod = barkod;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}


	public String getAmbalaza() {
		return naziv;
	}


	public void setAmbalaza(String ambalaza) {
		this.naziv = ambalaza;
	}


	public String getBarkod() {
		return barkod;
	}


	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}


	public double getNetoTezina() {
		return netoTezina;
	}


	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}


	public double getBrutoTezina() {
		return brutoTezina;
	}


	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}
	
     public double tezinaPakovanja() {
    	 return this.brutoTezina-this.netoTezina;
    	 
     }
     
     public abstract double cenaArtikla();
     
     public abstract void print();
}
