package D1_14_01_2022;

public class Knjiga {

	private String isbn;
	private String naziv;
	private int godina;
	private Autor autor;

	public Knjiga(String isbn, String naziv, int godina) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godina = godina;

	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;

	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Autor getAutor() {
		return this.autor;
	}

	public void print() {
		System.out.println(isbn);
		System.out.println(naziv + " - " + godina);
		System.out.println("Autor: " + this.autor.getAutor());
		System.out.println();
	}
}
