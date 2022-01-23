package D_21_01_2022_Zadatak_1;

//import java.util.ArrayList;

public class Magacioner extends Radnik {
	

	public Magacioner() {
		super();
		
	}

public Magacioner(String imeIPrezime) {
		super(imeIPrezime);
		
	}

	private double prosecnaPlata() {
		int sumaPlata = 0;

		for (int i = 0; i < sektori.size(); i++) {
			sumaPlata= sumaPlata+ this.sektori.get(i).plata;
		}
		return sumaPlata/ sektori.size() *0.5;

	}

	@Override
	public double plata() {
		
    return (this.prosecnaPlata() *sektori.size());
		

	}

}

//ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//suma plata svih sektor / broj sektora * 0.5
//override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).