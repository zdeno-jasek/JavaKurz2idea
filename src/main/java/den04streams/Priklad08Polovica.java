package den04streams;

import java.util.ArrayList;
import java.util.Collection;

// ÚLOHA
public class Priklad08Polovica {

	/*
	 * Vytvor nový zoznam čísel, ktorý bude obsahovať polovičné hodnoty pôvodných čísel.
	 * Pozor! Vo výslednom zozname budú iba tie čísla, ktoré sa dajú deliť dvomi!
	 * VSTUP:  1, 20, 3, 4
	 * VYSTUP:    10,    2
	 */
	public static void main(String[] args) {
		Collection<Integer> cisla = new ArrayList<>();
		cisla.add(1);
		cisla.add(101);
		cisla.add(2);
		cisla.add(200);
		cisla.add(4);
		cisla.add(55);
		cisla.add(8);
		cisla.add(9);
				
		System.out.println( "Pôvodný zoznam: " + cisla );
		
		// TODO

		System.out.println( "Polovičky " + 0 );
	}
}
