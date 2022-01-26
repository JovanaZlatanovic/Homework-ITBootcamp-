package D_24_01_2022;

import java.util.ArrayList;

public class Korpa {
	
	protected ArrayList<Ambalaza>ambalaze= new ArrayList<Ambalaza>();

	public Korpa() {
		super();
	}
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.ambalaze.add(ambalaza);
	}

	public void izvaciAmbalazu(String barkod) {
		for(int i=0;i<this.ambalaze.size();i++)
			if(this.ambalaze.get(i).barkod==barkod)
			{
				System.out.println("Izbacili ste iz korpe: ");
				this.ambalaze.get(i).print();
				this.ambalaze.remove(i);
				
			}
		
	}
	
	private double cenaAmbSaPopustom(int popust) {double suma=0;
	for(int i =0; i<ambalaze.size(); i++) {
		suma=suma+ ambalaze.get(i).cenaArtikla();
	}
		return suma-popust;
		
	}
	
	public double ukupnaCenaKorpe(SuperKartica popust) { double suma=0;

	double ukupnaCenaKorpe = cenaAmbSaPopustom(popust.getPopust());
	System.out.println();
	System.out.println("Ukupna cena korpe je  " + ukupnaCenaKorpe);
	return ukupnaCenaKorpe;
		
	}
	
	public void print()  {
		System.out.println();
		System.out.println("Sadrzaj korpe: ");
		for(int i=0;i<this.ambalaze.size();i++)
		{
			this.ambalaze.get(i).print();
			System.out.println();
		}
	}
}
