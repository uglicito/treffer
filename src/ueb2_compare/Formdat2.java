package ueb2_compare;

import java.util.*;

public class Formdat2 {
    public static void main(String[] args) {
    	Artikel_Comparable a1 = new Artikel_Comparable();
    	a1.artNr 		=0001;
    	a1.bezeichnung 	="Ding";
    	a1.preis 		=99;
    	
    	Artikel_Comparable a2 = new Artikel_Comparable();
    	a2.artNr		=0002;
    	a2.bezeichnung	="Gegegenstand";
    	a2.preis		=100;
    	
    	Artikel_Comparable a3 = new Artikel_Comparable();
    	a3.artNr		=0003;
    	a3.bezeichnung	="Nutzgut";
    	a3.preis		=102;
    	
    	ArrayList<Artikel_Comparable> al = new ArrayList<Artikel_Comparable>();
    	al.add(a1);
    	al.add(a2);
    	al.add(a3);
    	
    	//------------ Vergleich -------------------------------------------
    	
    	Collections.sort(al);
    	for(Artikel_Comparable a:al){
    		System.out.println(a.artNr);	
    	}
    	//------------ Objekte Bestellung ------------------------------------
    	Bestellung b1 = new Bestellung();
    	b1.bestellNr	=0001;
    	b1.bestelldat	=1234;
    	
    	Bestellung b2 = new Bestellung();
    	b2.bestellNr	=0002;
    	b2.bestelldat	=2345;
    	
    	Bestellung b3 = new Bestellung();
    	b3.bestellNr	=0003;
    	b3.bestelldat	=3456;
    	
    	Bestellposten p1 = new Bestellposten();
    	p1.menge		=10;
    	p1.bestellung	=b1;
    	
    	b1.bestellposten[0] = p1;
    	b2.bestellposten[0] = p1;
    	b3.bestellposten[0] = p1;
    	
    	Kunde k1 = new Kunde();
    	k1.adresse	="Hause";
    	k1.kundenNr	=0001;
    	k1.name		="name";
    		
    	ArrayList<Bestellung> bl = new ArrayList<Bestellung>();
    	bl.add(b1);
    	bl.add(b2);
    	bl.add(b3);
    	
    	HashMap<Integer, Artikel_Comparable> pl = new HashMap<Integer, Artikel_Comparable>();
    	pl.put(a1.artNr, a1);
    	pl.put(a2.artNr, a2);
    	pl.put(a3.artNr, a3);
    	
    	p1.artikel=pl.get(3);
    	System.out.println(p1.artikel.bezeichnung);
    	
    	for (Bestellung b : bl){
    		for (Bestellposten p : b.bestellposten){
    			System.out.println(p.artikel.preis*p.menge);
    		}
    	}    	
    }
}
