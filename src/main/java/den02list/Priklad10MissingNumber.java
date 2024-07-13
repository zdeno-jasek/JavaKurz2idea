package den02list;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// VYSVETLENIE
public class Priklad10MissingNumber {

	/*
	 * V Jave existuje niekoľko typov zoznamov:
	 * 
	 * Collection 	- všeobecný zoznam (bez špeciálnych očakávaní)
	 * List			- môžem pristúpiť k prvku cez index - get(index)
	 * Set			- prvky sa nesmú opakovať
	 */
	public static void main(String[] args) {
		Collection<Integer> cisla = List.of( 11, 11, 12, 12, 12 );
		System.out.println( "Collection: " + cisla );
		
		Set<Integer> cisla2 = new TreeSet<>();
		cisla2.addAll(cisla);	// v SET sa prvky neopakujú
		System.out.println( cisla2 );
	}
}
