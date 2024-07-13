package den02list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ÚLOHA
public class Priklad09DruheNajvacsie {

	/*
	 * Vráti druhé meno podľa abecedy.
	 * Vstup: Jozef, Peter, Juraj, Gabriela, Ema, Natasa
	 * Výstup: Gabriela
	 */
	public static void main(String[] args) {
		List<String> mena = new ArrayList<>();
		mena.add( "Jozef" );		
		mena.add( "Peter");
		mena.add( "Juraj" );
		mena.add( "Gabriela" );
		mena.add( "Ema" );
		mena.add( "Natasa" );
				
		System.out.println( "Pôvodný zoznam: " + mena );
		
		// TODO
		
		System.out.println( "Prvé meno podľa abecedy je: " + "?" );
	}
}
