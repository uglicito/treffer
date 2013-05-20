package UML;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    
	    Vorlesung v1 = new Vorlesung();
	    v1.vorlesungsNr	=0001;
	    v1.bezeichnung	="FM";
	    
	    Vorlesung v2 = new Vorlesung();
	    v2.vorlesungsNr =0002;
	    v2.bezeichnung	="IM";
	    
	    Student s1 = new Student();
	    s1.matrikelNr	= 0001;
	    s1.name			="Lange";
	    s1.vorname		="Hannes";
	    
	    s1.besucht = new Student_Vorlesung[10];
	    s1.besucht[0].vorlesung = v1;
	    s1.besucht[0].note		= 2;
	    s1.besucht[1].vorlesung	= v2;
	    s1.besucht[1].note		= 3;
	    
	    v1.besucht = new Student_Vorlesung[10];
	    v1.besucht[0] = s1.besucht[0];
	    
	    v2.besucht = new Student_Vorlesung[10];
	    v2.besucht[0] = s1.besucht[1];
	    
	    Professor p1 = new Professor();
	    p1.profkuerzel	="sia";
	    p1.name			="Singer";
	    
	    ArrayList<Integer> x = new ArrayList<Integer>();
	    x.add(20);
	    x.add(null);
	    
	    LinkedList<String> ll= new LinkedList<String>();
	    ll.add("Hallo");
	    ll.addLast("Ende");
	    ll.addFirst("HeHe Erster");
	    
	    for (String albert : ll){
	    	System.out.println(albert);
	    }	
    }
}
