package D_18_01_2022_Zadatak_1;

import java.util.ArrayList;

public class Student {

	private int brojIn;
	private String ime;
	private String tip;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(int brojIn, String ime, String tip) {
		super();
		this.brojIn = brojIn;
		this.ime = ime;
		this.tip = tip;
		this.ispiti = new ArrayList<Ispit>();
	}

	public int getBrojIn() {
		return brojIn;
	}

	public void setBrojIn(int brojIn) {
		this.brojIn = brojIn;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public ArrayList<Ispit> getIspit() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public double prosek() {
		double suma = 0;
		double brojac = 0;

		for (int i = 0; i < ispiti.size(); i++) {

			if (ispiti.get(i).jePolozio()) {
				brojac++;
				suma = suma + ispiti.get(i).getOcena();
			}
			
		}
		return suma / brojac;
	}

	public void print() {
		System.out.println(brojIn + " - " + this.ime + " - " + this.tip);
		System.out.println("Predmeti: ");

		for (int i = 0; i < ispiti.size(); i++) {
			ispiti.get(i).print();
		}

		System.out.println();
		System.out.println("Prosecna ocena: " + prosek());
		System.out.println();

	}
}

