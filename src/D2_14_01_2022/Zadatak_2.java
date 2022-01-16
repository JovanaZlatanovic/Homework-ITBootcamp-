package D2_14_01_2022;


public class Zadatak_2 {

	public static void main(String[] args) {
//		Kreirati klasu Proizvod koja ima:
//			sifru proizvoda
//			naziv proizvoda
//			cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//			konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//			gettere i settere za sifru i naziv
//			setter za cenu po kilogramu
//			metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//			metodu getCenaLb koja vraca cenu za 1lb prozvoda
//			 		konverzija: 1 kg = 2.2046 lb
//			metodu koja stampa proizvod u formatu:
//			(sifra) - (naziv)
//
//				Kreirati klasu Vaga koja ima:
//			merna jedinica (kg ili lb)
//			proizvod (proizvod koji se meri)
//			default-ni konstuktor
//			getteri i setteri za sve atribute
//			metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//			metodu stampaj koja stampa racun u formatu:
//			               (sifra) - (naziv)
//			   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//			   Ukupno: (ukupna cena) 	      


		Proizvod p1= new Proizvod("12345", "Banane", 150);
		
		Vaga v1 = new Vaga();
		v1.setMernajedinica(true);
		v1.setTezina(5);
		
		v1.setProizvod(p1); 
		
		v1.print();
		
        Proizvod p2= new Proizvod("12346", "Jabuke", 100);
		
		Vaga v2 = new Vaga();
		v2.setMernajedinica(false);
		v2.setTezina(3);
		
		v2.setProizvod(p2);
		
		v2.print();
		
		
		  Proizvod p3= new Proizvod("12346", "Kruske", 130);
			
			Vaga v3 = new Vaga();
			v3.setMernajedinica(true);
			v3.setTezina(4);
			
			v3.setProizvod(p3);
			
			v3.print();
		

	}

}
