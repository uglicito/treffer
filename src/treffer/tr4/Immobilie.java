package treffer.tr4;


public class Immobilie implements Comparable<Immobilie>{ 

	int preis;
	String adresse;
	int id;
	int wohnflaeche;
	
	public int compareTo(Immobilie ImmoList){
    	return
    	this.adresse.compareTo(ImmoList.adresse);
    	}
}
