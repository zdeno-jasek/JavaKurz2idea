package den04streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

// Vysvetlenie
public class Priklad10FindFirst {

	/*
	 * Vráť prvé meno zo zoznamu, ktoré začína na P
	 * Vstup: Jozef, Peter, Pavol, ...
	 * Výstup: Peter
	 */
	public static void main(String[] args) {
		Collection<String> mena = new ArrayList<>();
		mena.add( "Jozef" );		
		mena.add( "Peter");
		mena.add( "Pavol");
		mena.add( "Juraj" );
		mena.add( "Gabriela" );
		mena.add( "Ema" );
		mena.add( "Natasa" );
				
		System.out.println( "Pôvodný zoznam: " + mena );
		
		Optional<String> prveMeno = mena.stream()
				.filter( meno -> meno.charAt(0) == 'P' )
				.findFirst();

		System.out.println( "Prvé meno v zozname " + prveMeno.orElse( "neexistuje" ) );

		// TODO Vypísať prvé trojpísmenové meno zo zoznamu (Ema)
	}
}
