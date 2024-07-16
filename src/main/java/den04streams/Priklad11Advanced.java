package den04streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Vysvetlenie
public class Priklad11Advanced {

	public static void main(String[] args) {
		Collection<String> mena = new ArrayList<>();
		mena.add( "Jozef" );		
		mena.add( "Peter");
		mena.add( "Pavol");
		mena.add( "Juraj" );
		mena.add( "Gabriela" );
		mena.add( "Ema" );
		mena.add( "Natasa" );
				
		System.out.println( "Pôvodný zoznam: " + mena );

		// groupingBy - zoskupenie podľa prvého písmena
		Map<Character, List<String>> podlaPismena = mena.stream()
				.collect( Collectors.groupingBy(meno -> meno.charAt(0) ) );
		System.out.println( "Prvé meno v zozname " + podlaPismena );

		// distinct - vyhodenie duplicitných prvkov
		mena.add( "Pavla" );
		mena.add( "Pavla" );
		mena = mena.stream().distinct().toList();
		System.out.println( "Distinct: Pavla iba raz " + mena );

		// joining - spojenie prvkov do textu
		System.out.println( "Bol tam: " + mena.stream().collect(Collectors.joining(" a ")) );
	}
}
