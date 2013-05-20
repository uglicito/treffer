package treffer.tr3;

public class Main3 {
	public static void main(String[] args) {
		System.out.println("Methode Print aus Konto wird ausgegeben.");
		Konto ko1 = new Konto(123456, 1000000);
		Konto ko2 = new Konto(345678, 1500000);
		ko1.print();
		
		System.out.println("Methode Print aus Sparkonto wird ausgegeben inkl. Zins mit vererbung.");
		Sparkonto sk1 = new Sparkonto(234567, 2000000, 5);
		sk1.print();
		
		System.out.println("Array mit allen Kontoobjekten in FOR-EACH-Schleifenausgabe");
		Konto[] ka = new Konto[3];
		ka[0]=ko1;
		ka[1]=sk1;
		ka[2]=ko2;
		for(Konto a: ka){
			a.print();
		}
	}

}
