package den03file;

import java.io.FileWriter;
import java.io.IOException;

// VYSVETLENIE
public class Priklad01WriteFile {

	/*
	 * Príklad na zapísanie textu "Toto je pokus"
	 * do súboru s názvom "vystup.txt".
	 * 
	 * FileWriter - Javovská trieda, ktorá umožňuje do súboru zapisovať string pomocou metódy "write".
	 * Funguje rovnako ako System.out.println, len výpis ide do súboru.
	 */
	public static void main(String[] args) {
		/*
		 *  Pri zápise do súboru sa môžu vyskytnúť rôzne chyby
		 *  napríklad: disk je plný, chýbajúce práva na zápis
		 *  nesprávna cesta k súboru apod.
		 *  Všetky tieto chyby sú definované ako Input/Output Exception = IOException.
		 *  Musíme definovať try-catch blok, ktorý umožňuje chyby spracovať.
		 *  
		 *  Zápis do súboru musí byť vždy uzatvorený volaním metódy close().
		 *  Java však toto urobí automaticky, ak deklaráciu objektu subor
		 *  vykonáme rovno za slovíčkom "try".
		 *  Tomuto prístupu sa hovorí "try with resources".
		 */
		
		try (FileWriter subor = new FileWriter("vystup.txt")) {
			subor.write("Toto je pokus");
			// TODO: dopíšte do súboru na ďalší riadok text "Koniec súboru"
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println( "Koniec" );
	}

}
