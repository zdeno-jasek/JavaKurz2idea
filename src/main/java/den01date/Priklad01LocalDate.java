package den01date;

import java.time.LocalDate;

// VYSVETLENIE
public class Priklad01LocalDate {

	/*
	 * Pre prácu s dátumom slúži v Jave trieda LocalDate.
	 * Trieda umožňuje definovať ľubovoľný dátum, pripočítavať a odpočítavať.
	 * Takisto je možné zistovať poradované číslo dňa v mesiaci, v týždni alebo v roku. 
	 */
	public static void main(String[] args) {
		LocalDate datum = LocalDate.of(1989, 12, 24);
		
		datum = datum.plusDays( 22 );	// pripočíta 22 dní
		System.out.println(datum);
		
		datum = datum.plusMonths( 2 ); 	// pripočíta 2 mesiace
		System.out.println(datum);

		datum = datum.plusYears( -2 );	// odpočíta 2 roky
		System.out.println(datum);

		datum.plusYears( 200 );			// neurobí nič!!!
		System.out.println(datum);
	}
}
