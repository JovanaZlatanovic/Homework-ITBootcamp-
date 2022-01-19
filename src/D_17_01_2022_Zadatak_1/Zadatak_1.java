package D_17_01_2022_Zadatak_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//	U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		ArrayList<Zeleni_karton> karton = new ArrayList<Zeleni_karton>();

		Scanner s = new Scanner(System.in);

		int prosecnaOcena = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Unesite ime studenta: ");
			String imeStudenta = s.next();

			System.out.println("Unesite broj indexa:");
			String brojIn = s.next();

			System.out.println("Unesite naziv predmeta ");
			String imePredmeta = s.next();

			System.out.println("Unesite ime profesora: ");
			String imeProfesora = s.next();

			System.out.println("Unesite ocenu:");
			int ocena = s.nextInt();

			Zeleni_karton z1 = new Zeleni_karton(imeStudenta, brojIn, imePredmeta, imeProfesora, ocena);

			karton.add(z1);

			for (int j = 0; j < ocena; j++) {
				prosecnaOcena = ocena + j;
			}}
			System.out.println();
		System.out.println("Prosecna ocena je " + (prosecnaOcena) / 10);
	System.out.println();
	
	

		for (int i = 0; i < karton.size(); i++) {
			System.out.println("Ime sudenta: " + karton.get(i).getImeIPrezime());
			System.out.println("Broj indeksa: " + karton.get(i).getBrojIn());
			System.out.println("Naziv predmeta: " + karton.get(i).getNazivPr());
			System.out.println("Ime profesora: " + karton.get(i).getImeProf());
			System.out.println("Ocena: " + karton.get(i).getOcena());
			System.out.println();

		}

	}

}
