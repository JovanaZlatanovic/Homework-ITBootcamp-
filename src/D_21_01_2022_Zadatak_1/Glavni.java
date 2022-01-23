package D_21_01_2022_Zadatak_1;

import java.util.ArrayList;



public class Glavni {

	public static void main(String[] args) {
//		Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog



		Sektor s1 = new Sektor("s1", 15000);
		Sektor s2 = new Sektor("s2", 2500);
		Sektor s3 = new Sektor("s3", 22500);
		Sektor s4 = new Sektor("s4", 3500);
		Sektor s5 = new Sektor("s5", 24500);

		ArrayList<Sektor> sektori = new ArrayList<Sektor>();
		sektori.add(s1);
		sektori.add(s2);
		sektori.add(s3);
		sektori.add(s4);
		sektori.add(s5);

		Menadzer m1 = new Menadzer("Jovan Jovanic");
		m1.zaposliSeUSektor(s1);
		m1.zaposliSeUSektor(s2);

		System.out.println("Radnik " + m1.getImeIPrezime() + " je zaposljen u sledecim sektorima ");
		for (int i = 0; i < m1.sektori.size(); i++) {
			System.out
					.println(m1.sektori.get(i).getNazivSektora() + " plata u sektoru " + m1.sektori.get(i).getPlata());

		}
		System.out.println("Ukupna plata " + m1.getImeIPrezime() + " " + m1.plata());

		Magacioner mag1 = new Magacioner("Milan Misic");
		mag1.zaposliSeUSektor(s3);
		mag1.zaposliSeUSektor(s4);
		mag1.zaposliSeUSektor(s5);

		System.out.println();
		System.out.println("Radnik " + mag1.getImeIPrezime() + " je zaposljen u sledecim sektorima ");
		for (int i = 0; i < mag1.sektori.size(); i++) {
			System.out.println(
					mag1.sektori.get(i).getNazivSektora() + " plata u sektoru " + mag1.sektori.get(i).getPlata());

		}
		System.out.println("Ukupna plata " + mag1.getImeIPrezime() + " " + mag1.plata());

	}

}
