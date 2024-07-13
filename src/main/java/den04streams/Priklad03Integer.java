package den04streams;

import java.util.ArrayList;
import java.util.Collection;

// ÚLOHA
public class Priklad03Integer {

	/*
	 * Vyber čísla väčšie ako 10
	 */
	public static void main(String[] args) {
		Collection<Integer> cisla = new ArrayList<>();
		cisla.add(1);
		cisla.add(100);
		cisla.add(2);
		cisla.add(200);
		cisla.add(4);
		cisla.add(55);
		cisla.add(8);
		cisla.add(10);
				
		System.out.println( "Pôvodný zoznam: " + cisla );
		
		// TODO

		System.out.println( "Vybraný zoznam cisel " );
	}
}
