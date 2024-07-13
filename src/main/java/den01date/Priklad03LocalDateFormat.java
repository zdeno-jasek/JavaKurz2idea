package den01date;

import java.time.LocalDate;

// VYSVETLENIE
public class Priklad03LocalDateFormat {

	/*
	 * Metóda String.format umožňuje ľahšie vypisovať dátum.
	 * 
	 *  Pomôcky:
		'B'	Locale-specific full month name, e.g. "January", "February".
		'b'	Locale-specific abbreviated month name, e.g. "Jan", "Feb".
		'h'	Same as 'b'.
		'A'	Locale-specific full name of the day of the week, e.g. "Sunday", "Monday"
		'a'	Locale-specific short name of the day of the week, e.g. "Sun", "Mon"
		'C'	Four-digit year divided by 100, formatted as two digits with leading zero as necessary, i.e. 00 - 99
		'Y'	Year, formatted as at least four digits with leading zeros as necessary, e.g. 0092 equals 92 CE for the Gregorian calendar.
		'y'	Last two digits of the year, formatted with leading zeros as necessary, i.e. 00 - 99.
		'j'	Day of year, formatted as three digits with leading zeros as necessary, e.g. 001 - 366 for the Gregorian calendar.
		'm'	Month, formatted as two digits with leading zeros as necessary, i.e. 01 - 13.
		'd'	Day of month, formatted as two digits with leading zeros as necessary, i.e. 01 - 31
		'e'	Day of month, formatted as two digits, i.e. 1 - 31.
		
	 */
	public static void main(String[] args) {
		// LocalDate.now() vráti aktuálny dátum
		LocalDate datum = LocalDate.now();

		System.out.println( String.format( 
				"Deň %s bol %d. deň v roku, %d. mesiac v roku (%s) a deň v týždni bol %s, %d. deň v mesiaci.", 
				datum,
				datum.getDayOfYear(),
				datum.getMonth().getValue(),
				datum.getMonth().name(),
				datum.getDayOfWeek(),
				datum.getDayOfMonth()) );
		
		// % - ideme zamieňať túto časť textu
		// 1$ - zober prvý argument z príkazu
		// t - ideme robiť s dátumom a časom
		// d/m/Y = daj deň, mesiac alebo rok
		System.out.println( String.format( "Dátum: %1$td. %1$tB roku %1$tY - čiže %1$tA" , datum ) );


	}
}
