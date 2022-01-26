package D_24_01_2022;

public class Main {

	public static void main(String[] args) {
//		Kreirati abstraktnu klasu Ambalaza koja ima:
//			barkod (primer: 328232-2823)
//			naziv artikla
//			neto tezinu
//			bruto tezinu
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere
//			metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//			abstraktnu metodu koja vraca cenu artikla
//			abstraktnu metodu stampaj
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//			atribut koji kaze da li se moze reciklirati
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu tako da ispunjava uslova:
//			ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//			ako nije u cenu ulazi samo osnovna cena
//			metoda stampaj stampa sve podatke iz klase tetrapak.
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//			kaucija za flasu
//			atribut koji kaze da li se za flasu placa kaucija
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu
//			ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//			ako se ne placa, (osnovna cena) * 1.2
//			metoda stampaj stampa sve podatke iz klase staklena flasa.
//Kreirati klasu SuperKartica koja ima:
//			broj kartice
//			ime i prezime vlasnika
//			popust (200, 500, … )
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere 
//			metodu stampaj koja stampa karticu u formatu:
//			(broj kartice), (ime i prezime)
//Kreirati klasu Korpa koja ima:
//			niz ambalaza
//			metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar
//funkcije se prima Super karticu iz koje se cita popust.
//U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova 
//i istestirati sve metode i ispisati ukupnu cenu sa popustom.

		Korpa k1 = new Korpa();

		StaklenaAmbalaza s1 = new StaklenaAmbalaza("flasa", "58-565", 100, 120, 40, true, 60);

		StaklenaAmbalaza s2 = new StaklenaAmbalaza("tegla", "99-565", 120, 140, 0, false, 70);

		Tetrapak t1 = new Tetrapak("tetraedar", "485-5865", 60, 80, true, 30);

		Tetrapak t2 = new Tetrapak("kocka", "123-5865", 70, 90, false, 40);

		SuperKartica sk = new SuperKartica("5632589625", "Jelena", 10);

		k1.dodajAmbalazu(t1);
		k1.dodajAmbalazu(t2);
		k1.dodajAmbalazu(s1);
		k1.dodajAmbalazu(s2);

		k1.ukupnaCenaKorpe(sk);
		System.out.println();

		k1.izvaciAmbalazu("123-5865");

		k1.ukupnaCenaKorpe(sk);

		k1.print();

	}

}
