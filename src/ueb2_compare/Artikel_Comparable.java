package ueb2_compare;
public class Artikel_Comparable implements Comparable<Artikel_Comparable>{	
    int preis;
    int artNr;
    String bezeichnung;
    Bestellposten[] bestellposten;
    
    public int compareTo(Artikel_Comparable al){
    	return
    	Integer.valueOf(this.preis).compareTo(al.preis);
    	}
}
