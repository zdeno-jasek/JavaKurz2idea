package den04streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

// VYSVETLENIE
public class Priklad04Sum {

	/*
	 * Spočítaj prvých 100 čísel
	 * 
	 * IntStream je trieda v Jave, ktorá umožňuje generovať celé čísla
	 * ako prúd čísel.
	 * Stream ponúka metódu
	 * 		reduce - slúži na zredukovanie celého zoznamu na jedinú hodnotu (napríklad sumu, min, max apod)
	 */
	public static void main(String[] args) {
		
		OptionalInt vysledok = IntStream.range(1, 101)
			.reduce( (x,y) -> x + y );
		
		System.out.println( "Suma čísel od 1 do 100 je " + vysledok.getAsInt() );
		
		vysledok = IntStream.of( 20, 22, 55, 78, 11, 99, 4 )
				.reduce( Integer::min );

		System.out.println( "Najmenšie číslo je " + vysledok.getAsInt() );
		
		vysledok = IntStream.of( 5, 2, 4, 8, 2 )
				.reduce( (x,y) -> x * y );

		System.out.println( "Súčin čísel je " + vysledok.getAsInt() );
		
		// TODO Sčítať iba párne čísla od 1 do 100

		System.out.println( "Suma párnych čísel od 1 do 100 je " + 0 );

	}
}
