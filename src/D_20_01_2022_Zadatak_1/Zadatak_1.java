package D_20_01_2022_Zadatak_1;

public class Zadatak_1 {

	public static void main(String[] args) {
//	Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

		Osoba o1 = new Igrac("Milan Misic", "48562485", 1999, 1, "odbrambeni", false);
		Osoba o2 = new Igrac("Ana Misic", "55562485", 1995, 2, "kapiten", true);
		Osoba o3 = new Trener("Dragan Pekic", "42562485", 1985, 7, "kondicioni");
		Osoba o4 = new Trener("Mile Mikic", "13562485", 1982, 9, "za igru");

		o1.print();
		System.out.println();
		o2.print();
		System.out.println();
		o3.print();
		System.out.println();
		o4.print();

	}

}
