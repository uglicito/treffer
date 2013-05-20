package ueb1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
//--------< A: Kursverwaltung >------------------
		Kurs k1 	= new Kurs();
		k1.name 	= "Innovationsmanagment";
		k1.dauer 	= 6;
		Kurs k2 = new Kurs();
		k2.name		= "Rechnungswesen";
		k2.dauer	= 12;
		Teilnehmer t1 = new Teilnehmer();
		t1.name		="fu";
		t1.vorname	="wa";
		t1.ort		="Furtwangen";
		t1.plz		=78120;
		t1.strasse	="Robert Gerwig Platz 7";	
		Teilnehmer t2 = new Teilnehmer();
		t2.name		="to";
		t2.vorname	="bi";
		t2.ort		="Furtwangen";
		t2.plz		=78120;
		t2.strasse	="Schoenwaldgasse 25";
		Teilnehmer t3 = new Teilnehmer();
		t3.name		="tao";
		t3.vorname	="mao";
		t3.ort		="Gaengelstadt";
		t3.plz		=15042;
		t3.strasse	="Mobbingflucht 3";
		Belegung b1 = new Belegung();
		b1.note = 1.4;
		b1.kurs = k1;
		b1.teilnehmer=	t1;
		k1.bl.add(b1);
		Belegung b2 = new Belegung();
		b2.note = 1.3;
		b2.kurs = k2;
		b2.teilnehmer=	t1;
		k2.bl.add(b2);
		Belegung b3 = new Belegung();
		b3.note = 1.7;
		b3.kurs = k1;
		b3.teilnehmer=	t2;
		k1.bl.add(b3);
		Belegung b4 = new Belegung();
		b4.note = 2.0;
		b4.kurs = k2;
		b4.teilnehmer=	t2;
		k2.bl.add(b4);
		Belegung b5 = new Belegung();
		b5.note = 2.3;
		b5.kurs = k1;
		b5.teilnehmer=	t3;
		k1.bl.add(b5);
		Belegung b6 = new Belegung();       
		b6.note = 2.7;
		b6.kurs = k2;
		b6.teilnehmer=	t3;
		k2.bl.add(b6);
//--------------------------< B: HashMaps >-----------------------------------
		HashMap<String, Teilnehmer> tm = new HashMap<String, Teilnehmer>();
		tm.put(t1.name + t1.vorname, t1);
		tm.put(t2.name + t2.vorname, t2);
		tm.put(t3.name + t3.vorname, t3);
		HashMap<String, Kurs> km = new HashMap<String, Kurs>();
		km.put(k1.name, k1);
		km.put(k2.name, k2);
		System.out.println("cd: Teilnehmer finden und wenn nicht verfügbar melden");
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Kursnamen ein: ");
			try{
				String kName = sc.nextLine();
				System.out.println("Kursdauer: "+km.get(kName).dauer);
			}
			catch(Exception e){
				System.out.println("Element in der Liste nicht gefunden.");
				System.out.println(e.getMessage());
			}
		System.out.println("Bitte geben Sie den Nachnamen und Vornamen ein: ");
		try{
				String tName = sc.nextLine();
				System.out.println("Strasse: "+tm.get(tName).strasse);
			}	
			catch(Exception e){
				System.out.println("Element in der Liste nicht gefunden.");
				System.out.println(e.getMessage());
			}
		sc.close();
//----- -< HashMap in ArrayList >--------------------
		ArrayList<Teilnehmer> tl = new ArrayList<Teilnehmer>(tm.values());
		ArrayList<Kurs> kl = new ArrayList<Kurs>(km.values());
//-------< Sortierung Kurse nach Dauer und Teilnehmer nach Namen >----
//-----------------< Comparable >---------------
		System.out.println("e: Kursnamen sortiert");
		Collections.sort(tl);
		for(Kurs k : kl){
			System.out.println(k.name);
		}
//------------------< Comperator >--------------
		System.out.println("f: Kurse aufsteigend sortiert");
		Collections.sort(kl, new Kurs());
		for(Kurs k : kl){
			System.out.println(+k.dauer);
		}
		System.out.println("g: Kurse absteigend sortiert");
		Collections.sort(kl, Collections.reverseOrder(new Kurs()));
		for(Kurs k : kl){
			System.out.println(+k.dauer);
		}
		System.out.println("h: Durchschnittsnoten der Kurse");
		double sum = 0.0;
		for(Kurs k: kl){
			System.out.println(k.name);
			for(Belegung b: k.bl){
				sum = sum + b.note;
			}
		System.out.println("im Schnitt: "+sum/k.bl.size());
		sum=0;
		}
	}
}
