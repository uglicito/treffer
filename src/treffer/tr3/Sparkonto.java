package treffer.tr3;

public class Sparkonto extends Konto{
	
	private int zins;
	
	Sparkonto(){
		super();
		zins=0;
	}
	Sparkonto(int knr, int kontonummer, int zins){
		super(knr, kontonummer);
		this.zins=zins;
	}
	public void print(){
		super.print();
		System.out.println("Zinssatz: "+zins);
	}
}
