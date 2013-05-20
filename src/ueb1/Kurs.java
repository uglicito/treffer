package ueb1;

import java.util.ArrayList;
import java.util.Comparator;

public class Kurs implements Comparator<Kurs>{
	public int compare(Kurs k1, Kurs k2){
		return Integer.valueOf(k1.dauer).compareTo(k2.dauer);
	}
	
	String name;
	int dauer;
	
	//Belegung[] belegung;
	ArrayList<Belegung> bl = new ArrayList<Belegung>();
}
