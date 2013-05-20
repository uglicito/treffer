package treffer.tr3;

public class Konto {
	
	private int knr;
	private int kontostand;
	
	Konto(){
		knr=0;
		kontostand=0;
	}
	Konto(int knr, int kontostand){
		this.knr=knr;
		this.kontostand=kontostand;
	}
	public void print(){
		System.out.printf("Kontonr: "+knr+"%nKontostand: "+kontostand+"%n");
	}

}
