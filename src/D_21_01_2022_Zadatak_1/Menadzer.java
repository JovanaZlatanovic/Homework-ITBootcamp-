package D_21_01_2022_Zadatak_1;

//import java.util.ArrayList;

public class Menadzer extends Radnik{
	
	
	public Menadzer() {
		super();
	}

	
	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
		
	}
	
	

	@Override
	public double plata() { int suma=0;
	
	for(int i =0; i<this.sektori.size(); i++) { 
		suma = suma + this.sektori.get(i).getPlata();
	}
		
		return suma;
	}
	
	

}

//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.