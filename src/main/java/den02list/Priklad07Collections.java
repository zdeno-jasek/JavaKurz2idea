package den02list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// VYSVETLENIE
public class Priklad07Collections {

	/*
	 * Tento program iba demonštruje možnosti použitia knižnice Collections:
	 * swap				- výmena dvoch prvkov
	 * sort				- usporiadanie prvkov poľa
	 * reverse			- obrátenie prkov poľa
	 * shuffle			- náhodné výmeny prvkov v poli
	 * rotate			- posunutie prvkov poľa o nejakú hodnotu
	 */
	public static void main(String[] args) {
		List<String> mena = new ArrayList<>();
		mena.add( "Jozef" );
		mena.add("Peter");
		mena.add( "Juraj" );
		mena.add( "Gabriela" );
		mena.add( "Ema" );
		mena.add( "Natasa" );
				
		System.out.println( "Pôvodný zoznam: " + mena );
		
		// Výmena dvoch prvkov.
		Collections.swap(mena, 0, 1);
		System.out.println( "Výmena prvého a druhého prvku: " + mena );
		
		System.out.println( "Najväčší prvok: " + Collections.max( mena ) );
		System.out.println( "Najmenší prvok: " + Collections.min( mena ) );
		
		Collections.sort(mena);
		System.out.println( "Usporiadanie: " + mena );
		Collections.reverse(mena);
		System.out.println( "Naopak: " + mena );
		Collections.shuffle(mena);
		System.out.println( "Náhodne: " + mena );
		Collections.rotate(mena, -2);
		System.out.println( "Posun o -2: " + mena );
		
	}

}
