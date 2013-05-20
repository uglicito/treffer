package treffer.tr2;

import java.util.ArrayList;

public class Main2 {
	public static void main(String[] args) {
		
				int i=1;
				System.out.println("WHILE-Schleife");
				while(i<11){
					System.out.println(i);
					i++;
				}
				
				System.out.println("DO-WHILE-Schleife");
				String s = "a";
				do{
					System.out.println(s);
					s = s + "a";
				}
				while(!(s.equals("aaaaaa")));
				
				System.out.println("FOR-Schleife");
				ArrayList<Computer> cl = new ArrayList<Computer>();
				for(int a=1; a<=10; a++){
					Computer c = new Computer();
					c.ComputerID = "C" + a;
					cl.add(c);
				}
				System.out.println("FOR-EACH-Schleife");
				for(Computer comp:cl){
					System.out.println(comp.ComputerID);
				}
			}
		}