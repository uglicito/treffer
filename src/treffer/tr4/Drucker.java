package treffer.tr4;

public class Drucker implements Comparable<Drucker>{
	public int compareTo(Drucker dArrayList){
		return Integer.valueOf(this.id).compareTo(dArrayList.id);
	}
	int id;
	String typ;
	String herst;	
}
