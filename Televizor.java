
public class Televizor {
	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;

	public static void main(String[] args) {
		Televizor tv = new Televizor(4,"RTCG",7);
		Televizor tv2 = new Televizor(2,"Prvi",10);
		tv.ispisi();
		tv2.ispisi();
		tv2.smanjiTon();
	}


public Televizor(int brojKanala,String nazivKanala,int jacinaTona) {
	
	setBrojKanala(brojKanala);
	this.nazivKanala=nazivKanala;
	setJacinaTona(jacinaTona);
}
public int getBrojKanala() {
	return brojKanala;
}
public void setBrojKanala(int brojKanala) {
	this.brojKanala = brojKanala;
	if(brojKanala>=1) {
		this.brojKanala=brojKanala;
	}else {
		System.out.println("Broj kanala mora biti veci od 1");
		this.brojKanala=1;
	}
}
public String getNazivKanala() {
	return nazivKanala;
}
public void setNazivKanala(String nazivKanala) {
	this.nazivKanala = nazivKanala;
}
public int getJacinaTona() {
	return jacinaTona;
}
public void setJacinaTona(int jacinaTona) {
	if(jacinaTona>=0 && jacinaTona<=10) {
		this.jacinaTona = jacinaTona;
	}else {
		if(jacinaTona<0) {
			this.jacinaTona=0;
		}if(jacinaTona>10) {
			this.jacinaTona=10;
		}
	}
}
public void pojacajTon() {
	if(this.jacinaTona<10) {
		this.jacinaTona++;
		System.out.println("Jacina tona je "+this.jacinaTona);
	}else {
		System.out.println("Ton je vec na maksimum");
	}
}
public void ispisi() {
	System.out.println("Broj kanala:"+this.brojKanala + "Naziv kanala:"+this.nazivKanala + "Jacina tona:"+this.jacinaTona);
}
public void smanjiTon() {
	if(this.jacinaTona>0) {
		this.jacinaTona--;
		System.out.println("Jacina tona je "+this.jacinaTona);
	}else {
		System.out.println("Ton je vec na minimum");
	}
}}




