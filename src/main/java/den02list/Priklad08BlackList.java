package den02list;

import java.util.ArrayList;
import java.util.List;

// VYSVETLENIE
public class Priklad08BlackList {

	/*
	 * Program má zoznam mien a k nemu aj čiernu listinu.
	 * Zo zoznamu mien vyhodí tie, ktoré sú na čiernej listine.
	 */
	public static void main(String[] args) {
		List<String> mena = new ArrayList<>();
		mena.add( "JozEf" );
		mena.add("Peter");
		mena.add( "Juraj" );
		mena.add( "Gabriela" );
		mena.add( "Ema" );
		mena.add( "Natasa" );
		
		List<String> blackList = new ArrayList<>();
		blackList.add( "JOZEf" );
		blackList.add("PETER");
		
		List<String> blackList2 = new ArrayList<>();
		
		
		for (String blackName : blackList) {
			String search = blackName.toUpperCase();	// JOZEF
			for (String meno : mena ) {
				if ( meno.toUpperCase().equals(search) ) { // JozEf => JOZEF == JOZEF?
					blackList2.add(meno);
				}
			}
		}
		
		mena.removeAll(blackList2);

		System.out.println( mena );
		
	}
}
