package den04streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Vysvetlenie
public class Priklad12Advanced {

	public static void main(String[] args) {
		List<List<String>> mena = List.of(
				List.of("Peter", "Petra"),
				List.of("Gabriel", "Gabriela", "Gabrielka"),
				List.of( "Pavol", "Pavla", "Pavlina", "Palo") );

		// flatMap - vyzbieranie všetkých prvkov z vnorených zoznamov a spojenie do jedného textu
		String zoznamMien = mena.stream()
				.flatMap( Collection::stream )
				.collect(Collectors.joining(", "));

		System.out.println( "Vsetky mena: " + zoznamMien );
	}
}
