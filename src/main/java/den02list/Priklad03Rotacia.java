package den02list;

import java.util.ArrayList;
import java.util.List;

// ÚLOHA
public class Priklad03Rotacia {

	/*
	 * Program vymení hodnoty v poli tak, že prvú za druhú, 
	 * druhú za tretiu, tretiu za štvrtú atď.
	 * Vstup: 1, 2, 3, 4
	 * Výstup: 2, 3, 4, 1
	 */
	public static void main(String[] args) {
		List<Integer> pole = new ArrayList<>();
		
		pole.add(1);
		pole.add(2);
		pole.add(3);
		pole.add(4);
		
		System.out.println( "Pôvodné pole: " + pole );
		
		// TODO

		System.out.println( "Upravené pole: " + pole );
	}
}
