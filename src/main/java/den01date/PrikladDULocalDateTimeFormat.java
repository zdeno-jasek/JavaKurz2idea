package den01date;

import java.time.LocalDateTime;

// VYSVETLENIE
public class PrikladDULocalDateTimeFormat {

	/*
	 * LocalDateTime je trieda, ktorá umožňuje v Jave pracovať nielen s dátumom, ale aj s časom.
	 * 
	 * Pre formátovanie času je možné opäť využiť String.format: 
		'H'	Hour of the day for the 24-hour clock, formatted as two digits with a leading zero as necessary i.e. 00 - 23.
		'I'	Hour for the 12-hour clock, formatted as two digits with a leading zero as necessary, i.e. 01 - 12.
		'k'	Hour of the day for the 24-hour clock, i.e. 0 - 23.
		'l'	Hour for the 12-hour clock, i.e. 1 - 12.
		'M'	Minute within the hour formatted as two digits with a leading zero as necessary, i.e. 00 - 59.
		'S'	Seconds within the minute, formatted as two digits with a leading zero as necessary, i.e. 00 - 60 ("60" is a special value required to support leap seconds).
		'L'	Millisecond within the second formatted as three digits with leading zeros as necessary, i.e. 000 - 999.
		'N'	Nanosecond within the second, formatted as nine digits with leading zeros as necessary, i.e. 000000000 - 999999999.
		'p'	Locale-specific morning or afternoon marker in lower case, e.g."am" or "pm". Use of the conversion prefix 'T' forces this output to upper case.
		'z'	RFC 822 style numeric time zone offset from GMT, e.g. -0800. This value will be adjusted as necessary for Daylight Saving Time. For long, Long, and Date the time zone used is the default time zone for this instance of the Java virtual machine.
		'Z'	A string representing the abbreviation for the time zone. This value will be adjusted as necessary for Daylight Saving Time. For long, Long, and Date the time zone used is the default time zone for this instance of the Java virtual machine. The Formatter's locale will supersede the locale of the argument (if any).
		's'	Seconds since the beginning of the epoch starting at 1 January 1970 00:00:00 UTC, i.e. Long.MIN_VALUE/1000 to Long.MAX_VALUE/1000.
		'Q'	Milliseconds since the beginning of the epoch starting at 1 January 1970 00:00:00 UTC, i.e. Long.MIN_VALUE to Long.MAX_VALUE.

	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime datum = LocalDateTime.now();
		
		System.out.println( String.format( "Čas: %s" , datum));
		System.out.println( String.format( "Dátum: %1$td. %1$tm. %1$tY, čas: %1$tH:%1$tM:%1$tS" , datum));

		// TODO
		// čas 15 hodín 26 minút
		
		// čas 15:26:45
		
		// čas 15-26-45
		
		// 3:26 pm
		
	}
}
