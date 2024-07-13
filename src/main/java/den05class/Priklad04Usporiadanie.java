package den05class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Priklad04Usporiadanie {

	public static void main(String[] args) {
		List<Osoba> osoby = new ArrayList<>();
		// Ctrl + Shift + O = doplnenie importov
		
		osoby.add( new Osoba( "Peter", "Dlhý", "430202/123" ) );
		osoby.add( new Osoba( "Andrej", "Bystrý", "430202/124" ) );
		osoby.add( new Osoba( "Beáta", "Široká", "430202/121" ) );
		
		System.out.println(osoby);
		
		Collections.sort(osoby);
		System.out.println(osoby);
	}

}
