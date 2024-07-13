package den02list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// VYSVETLENIE
public class Priklad06MergeSort {

	/*
	 * Program zoberie dve usporiadané polia a spojí ich prvky dohromady tak,
	 * aby výsledkom bolo znovu usporiadané pole.
	 */
	public static void main(String[] args) {
		List<Integer> prvePole =  List.of( 10, 2, 9, 15, 28 );
		List<Integer> druhePole = List.of( 2, 40, 5, 11, 12 );
		
		List<Integer> vysledok = new ArrayList<>();
		
		// Príkaz addAll pridá všetky hodnoty z prvého poľa do druhého:
		vysledok.addAll(prvePole);
		vysledok.addAll(druhePole);

		// Príkaz sort umožňuje usporiadavať hodnoty v poli
		Collections.sort(vysledok);

		System.out.println(vysledok);
	}
}
