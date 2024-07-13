package den02list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// DOMÁCA ÚLOHA
public class PrikladDUMena {
	
	/*
	 * Program má zoznam mien a zoznam priezvisk. Jeho úlohou je vyrobiť plné pomenovanie (meno+priezvisko)
	 * pre nového človeka.
	 * Výstup: Peter Krátky
	 */
	public static void main(String[] args) {
		List<String> mena = new ArrayList<>();
		mena.addAll( List.of( "Jozef", "Juraj", "Peter", "Andrej" ) );
		
		List<String> priezviska = new ArrayList<>();
		priezviska.addAll( List.of( "Široký", "Dlhý", "Bystrozraký", "Krátky", "Úzky", "Ďalekozraký" ) );
		
		String nahodneMeno = "?";		// TODO
		String nahodnePriezvisko = "?";	// TODO

		System.out.println( String.format( "Vymyslel som meno %s %s. Pekné, že?", nahodneMeno, nahodnePriezvisko));
	}

}
