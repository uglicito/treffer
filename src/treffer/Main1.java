package treffer;

import java.util.*;

public class Main1 {
	public static void main(String[] args) {

		// Objekterzeugung Object der Klasse Mitarbeiter
		Mitarbeiter m1 = new Mitarbeiter();
		m1.PersNr = 0001;
		m1.name = "Hannes";
		Mitarbeiter m2 = new Mitarbeiter();
		m2.PersNr = 0002;
		m2.name = "Margrit";

		// Arrayerzeugung
		Mitarbeiter[] ml = new Mitarbeiter[2];
		ml[0] = m1; // Objektablage in Array
		ml[1] = m2;
		System.out.println("Array: "); // Array auslesen mit
										// VarName[index].attribut
		System.out.println(ml[0].name + " " + ml[0].PersNr);
		System.out.println(ml[1].name + " " + ml[1].PersNr);

		// ArrayList
		ArrayList<Mitarbeiter> mla = new ArrayList<Mitarbeiter>();
		mla.add(m1); // Objekt in Arraylist hinzufügen mit add
		mla.add(m2);
		System.out.println("ArrayList: "); // Arraylist auslesen mit

		System.out.println(mla.get(0).PersNr + " " + mla.get(0).name);// VarName.get(index).attribut
		System.out.println(mla.get(1).PersNr + " " + mla.get(1).name);

		// HashMap
		HashMap<Integer, Mitarbeiter> mlHash = new HashMap<Integer, Mitarbeiter>();
		mlHash.put(m1.PersNr, m1); // Objekt in Hashmap ablegen
		// Attributverknüpfung
		mlHash.put(m2.PersNr, m2);
		System.out.println("ArrayList: ");
		System.out.println(mlHash.get(1).name + " " + mlHash.get(1).name); //
		System.out.println(mlHash.get(2).PersNr + " " + mlHash.get(2).name);
		System.out
				.printf("%nIn einer Endlos WHILE-Schleife sollen ganze positive Zahlen ausgegeben werden %nausser die 10 und >20 sollen die Schleife beenden.%n");
		int i = 0;
		while (true) {
			i++;
			if (i == 10) {
				continue;
			}
			if (i > 20) {
				break;
			}
			System.out.println(i);
		}

	}
}
