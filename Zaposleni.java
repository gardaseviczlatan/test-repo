
public class Zaposleni {
	private String ime;
	private String prezime;
	private int godine_staza;
	private double plata; 

	public static void main(String[] args) {
		Zaposleni z1 = new Zaposleni("Nikolina","Nikolic",12,755.5);
		Zaposleni z2 = new Zaposleni("Luka","Lakovic",12,755.5);
		Zaposleni z3 = new Zaposleni("Zlatan","Gardasevic",12,755.5);
		
		z1.ispisiZ();
		z1.provjeriUvecaj();
	}


public Zaposleni(String ime,String prezime,int godine_staza,double plata) {
	this.ime=ime;
	this.prezime=prezime;
	setGodine_staza(godine_staza);
	setPlata(plata);
}
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	this.ime = ime;
}
public String getPrezime() {
	return prezime;
}
public void setPrezime(String prezime) {
	this.prezime = prezime;
}
public int getGodine_staza() {
	return godine_staza;
}
public void setGodine_staza(int godine_staza) {
	if(godine_staza<0) {
		System.out.println("greska");
		this.godine_staza=0;
	}else {
		this.godine_staza = godine_staza;
	}
}
public double getPlata() {
	return plata;
}
public void setPlata(double plata) {
	this.plata=plata;
}
public void ispisiZ() {
	System.out.println("Ime: "+this.ime + " Prezime: "+this.prezime + " Godine staza: "+this.godine_staza);
}
public void provjeriUvecaj() {
	
	if(this.plata<800 && godine_staza>10) {
		double staraPlata=this.plata;
		double novaPlata=staraPlata*1.06;
		System.out.println("Stara plata od: "+staraPlata+" je uvecana za: "+novaPlata);
	}else {
		System.out.println("ne ispunjavate uslove za vecu platu");
	}
	
	
}
public void najvecaPlata() {
	
	
	
	
}}

