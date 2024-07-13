package den01date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

// VYSVETLENIE
public class Priklad07RozdielDni {

	/*
	 * Program vypočíta rozdiel medzi dvomi dňami.
	 * Dokáže k jednému dňu pripočítať 2 mesiace a tri dni.
	 * 
	 * Java ponúka triedu Period, ktorá dokáže v sebe držať rozdiel medzi dvomi dátumami
	 */
	public static void main(String[] args) {
		LocalDate prvyDen = LocalDate.of(2022, Month.SEPTEMBER, 4);
		LocalDate druhyDen = LocalDate.of(2022, Month.DECEMBER, 2);

		Period rozdiel = Period.between(prvyDen, druhyDen);
		System.out.println( "Rozdiel: " + rozdiel );
		System.out.println( rozdiel.getDays() );
		System.out.println( rozdiel.getMonths() );
		
	}
}
