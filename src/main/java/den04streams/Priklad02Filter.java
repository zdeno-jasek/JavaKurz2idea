package den04streams;

import java.util.ArrayList;
import java.util.Collection;

// ÚLOHA
public class Priklad02Filter {

	/*
	 * Vyber mená, ktoré majú dĺžku presne 5 znakov
	 * Vstup: Jozef, Peter, Juraj, Gabriela, Ema, Natasa
	 * Výstup: Jozef, Peter, Juraj
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
		
		// TODO

		System.out.println( "Vybraný zoznam mien "  );
	}
}
