package den04streams;

import java.util.ArrayList;
import java.util.Collection;

// Vysvetlenie
public class Priklad01Filter {

	/*
	 * Vyber mená, ktoré sa začínajú na "J".
	 * Vstup: Jozef, Peter, Juraj, Gabriela, Ema, Natasa
	 * Výstup: Jozef, Juraj
	 * 
	 * Pre objekty typu Collection je možné zavolať metódu
	 * 		stream() - na vyrobenie prúdu prvkov zo zoznamu
	 * Nad stream-om je možné volať ďalšie metódy na spracovanie prúdu prvkov, napríklad:
	 * 		filter - na filtrovanie prvkov v zozname, t.j. ďalej v streame pokračujú iba tie prvky,
	 * 			ktoré spĺňajú filtrovaciu podmienku
	 * 		toList - výsledný prúd prvkov sa uloží do nového zoznamu
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

		Collection<String> menaZacinajuceNaJ = mena.stream()
				.filter( meno -> meno.charAt(0) == 'J' )
				.toList();
		
		System.out.println( "Vybraný zoznam mien " + menaZacinajuceNaJ );
		
		// TODO: mená, ktoré majú "a" druhé v poradí (Pavol, Natasa)
		
		// TODO: mená, ktoré obsahujú aspoň jedno "e" (Jozef, Peter, Gabriela)
	}
}
