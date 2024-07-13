package den04streams;

import java.util.ArrayList;
import java.util.Collection;

// Vysvetlenie
public class Priklad05Map {

	/*
	 * Zmeň všetky mená v zozname na veľké písmená
	 * Vstup: Jozef, Peter, Juraj, Gabriela, Ema, Natasa
	 * Výstup: JOZEF, PETER, JURAJ, GABRIELA, EMA, NATASA
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

		Collection<String> menaVelkymiPismenami = mena.stream()
				.map( meno -> meno.toUpperCase() )
				.toList();
		
		System.out.println( "Vybraný zoznam mien " + menaVelkymiPismenami );
		
		// TODO: mena, s veľkými písmenami, ktoré začínajú na "J"
	}
}
