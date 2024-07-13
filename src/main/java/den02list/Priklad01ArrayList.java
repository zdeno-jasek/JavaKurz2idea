package den02list;

import java.util.ArrayList;
import java.util.List;

// VYSVETLENIE
public class Priklad01ArrayList {

	/*
	 * V Jave obvykle pracujeme s dynamickými poliami. Tie sa deklarujú pomocou zápisu
	 * List<String> zoznamStringov = new ArrayList<>();
	 * 
	 * Poskytujú tieto operácie:
	 * add 		- pridaj nový prvok do poľa
	 * remove 	- vyhoď existujúci prvok z poľa
	 * size		- vráť počet prkov v poli
	 * contains	- zisti, či pole obsahuje daný prvok
	 * get 		- vráť prvok na danej pozícii
	 * indexOf	- vráť index, na ktorom je prvok uložený
	 */
	public static void main(String[] args) {
		String[] menaStatic = { "Jozef", "Peter", "Juraj" };
		
		List<String> mena = new ArrayList<>();
		mena.add( "Jozef" );
		mena.add( "Peter");
		mena.add( "Juraj" );
		
		// Zoznam mien sa vypíše automaticky celý, netreba FOR-cyklus
		System.out.println( mena );
		
		// Obsahuje zoznam mien meno "Juraj"? - áno
		System.out.println( mena.contains( "Juraj" ) );
		
		// Aké poradové číslo má meno Juraj?
		System.out.println( mena.indexOf("Juraj"));
		
		// Vypíš meno s poradovým číslom 2
		System.out.println( mena.get(2));
		
		// Vypíš počet mien v zozname
		System.out.println( mena.size() );
		
		// Vyhoď meno Juraj zo zoznamu
		mena.remove( "Juraj" );
		System.out.println( mena );
		
	}
}
