package D1_14_01_2022;

public class Zadatak_1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise k

		Knjiga knjiga1 = new Knjiga("8625648562-0", "Demian", 1940);

		Autor autor1 = new Autor("Herman Hese");

		knjiga1.setAutor(autor1);

		knjiga1.print();
		
		

		Knjiga knjiga2 = new Knjiga("8625645562-0", "Majstor i Margarita", 1941);

		Autor autor2 = new Autor("Mihail Bulgakov");

		knjiga2.setAutor(autor2);

		knjiga2.print();
		
		

		Knjiga knjiga3 = new Knjiga("8625245562-0", "Sidarta", 1945);

		knjiga3.setAutor(autor1);
		knjiga3.print();

	}

}
