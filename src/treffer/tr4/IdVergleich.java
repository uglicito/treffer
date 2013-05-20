package treffer.tr4;

import java.util.Comparator;

public class IdVergleich implements Comparator<Drucker>{
	
	public int compare(Drucker d1, Drucker d2){
		return Integer.valueOf(d2.id).compareTo(d1.id);
	}

}
