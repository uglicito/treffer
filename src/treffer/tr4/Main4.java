package treffer.tr4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		
		HashMap<String, Immobilie> ImmoMap = new HashMap<String, Immobilie>();
		
		Immobilie i1 = new Immobilie();
		i1.id = 1;
		i1.adresse = "Furtwangen Ilbenstrasse";
		i1.preis = 200;
		i1.wohnflaeche = 500;
		
		ImmoMap.put(i1.adresse, i1);

		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		try{
			Immobilie iAusgelesen = ImmoMap.get(id);
			System.out.println(iAusgelesen.id);
			System.out.println(iAusgelesen.adresse);
			System.out.println(iAusgelesen.wohnflaeche);
			System.out.println(iAusgelesen.preis);
		}catch(Exception e){
			System.out.println("Objekt nicht gefunden!");
			System.out.println(e.getMessage());
		}
		
		ArrayList<Immobilie> ImmoList = new ArrayList<Immobilie>(ImmoMap.values());
		
		Collections.sort(ImmoList);
		for(Immobilie il : ImmoList){
			System.out.println("Adresse: "+il.adresse);
		}
		
		Drucker d1 = new Drucker();
		Drucker d2 = new Drucker();
		Drucker d3 = new Drucker();
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Geben Sie die ID als Nummer ein: ");
		while(true){
			try{
				d1.id = Integer.valueOf(sc.nextLine());
				break;
			}catch(Exception e){
				System.out.println("Bitte geben Sie eine ganze Zahl ein.");
			}
		}
		System.out.println("Geben Sie die Hersteller ein: ");
		d1.herst = sc.nextLine();
		System.out.println("Geben Sie die Typ ein: ");
		d1.typ = sc.nextLine();
		sc.close();
		System.out.println("ID: "+d1.id+" Hersteller: "+d1.herst+" Typ: "+d1.typ);
		
		boolean b = true;
		do{
			try{
				System.out.println("Geben Sie die ID als Nummer ein: ");
				d2.id = Integer.valueOf(sc.nextLine());
				b = false;
			}catch(Exception e){
				System.out.println("Bitte geben Sie eine ganze Zahl ein.");
			}
		}while(b);
		System.out.println("Geben Sie den Hersteller ein: ");
		d2.herst = sc.nextLine();
		System.out.println("Geben Sie den Typ ein: ");
		d2.typ = sc.nextLine();
		System.out.println("ID: "+d2.id+" Hersteller: "+d2.herst+" Typ: "+d2.typ);

		System.out.println("Geben Sie die ID als Nummer ein: ");
		d3.id = Integer.valueOf(sc.nextLine());
		System.out.println("Geben Sie den Hersteller ein: ");
		d3.herst = sc.nextLine();
		System.out.println("Geben Sie den Typ ein: ");
		d3.typ = sc.nextLine();
		System.out.println("ID: "+d3.id+" Hersteller: "+d3.herst+" Typ: "+d3.typ);
		
		HashMap<Integer, Drucker> dHashMap = new HashMap<Integer, Drucker>();
		dHashMap.put(d1.id, d1);
		dHashMap.put(d2.id, d2);
		dHashMap.put(d3.id, d3);
		ArrayList<Drucker> dArrayList = new ArrayList<Drucker>(dHashMap.values());
		
		Collections.sort(dArrayList);
		for(Drucker dl : dArrayList){
			System.out.println("ID: "+dl.id);
		}
		Collections.sort(dArrayList, new IdVergleich());
		for(Drucker dp: dArrayList){
			System.out.println("ID "+dp.id);
		}		
	}
}
