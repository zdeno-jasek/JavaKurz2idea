package den03misc;

// VYSVETLENIE
public class Priklad02Logger {

	/*
	 * Programátori v Jave obvykle nepoužívajú metódu System.out.println na výpis.
	 * Častokrát je nutné vypisovať stav spracovania do takzvaného "logu".
	 * "Log" má obvykle podobu súboru, v ktorom je možné aj spätne dohľadávať
	 * a tak zisťovať, čo sa v programe kedy stalo.
	 * Log by mal preto obsahovať:
	 * 	- dátum a čas zalogovania hlášky
	 * 	- názov zdrojového kódu, ktorý hlášku zapísal
	 * 	- názov metódy, ktorá hlášku zapísala
	 *  - úroveň vážnosti hlášky (chyba, fatálna chyba, info-hláška)
	 * 	- samotné hlásenie prehľadne formátované
	 */
	public static void main(String[] args) {
		System.Logger log = System.getLogger( "Logger" );
		
		Long pocetByteov = 1223l;
		String nazov = "Trieda.java";
		log.log( System.Logger.Level.INFO, "Subor \"{0}\" ma {1} byte-ov", nazov, pocetByteov  );
		
		// TODO Zapíšte výstrahu (Warning) "Používateľ (menoPouzivatela) sa pokúsil vymazať súbor (názov súboru)"
		String menoPouzivatela = "jan.nezbednik";
		String nazovSuboru = "system.exe";
		
	}
}
