package den02list;

import java.util.ArrayList;
import java.util.List;

// VYSVETLENIE
public class Priklad05ArrayCopy {

	/*
	 * Program spojí zoznam mena1 s mena2.
	 */
	public static void main(String[] args) {
		List<String> mena1 = List.of( "Jano", "Fero", "Martin" );
		List<String> mena2 = List.of( "Gabriela", "Natasa", "Ema" );
		
		List<String> mena3 = new ArrayList<>();
		mena3.addAll(mena1);
		mena3.addAll(mena2);
		
		System.out.println( mena3 );
	}
}
