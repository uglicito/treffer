package ueb1;

public class Teilnehmer implements Comparable<Teilnehmer>{
	public int compareTo(Teilnehmer tl){
		return String.valueOf(this.name).compareTo(tl.name);
	}
	
	String name;
	String vorname;
	int plz;
	String ort;
	String strasse;
	
	Belegung[] belegung;
}
