package den05class;

public class Priklad03Osoba {

	public static void main(String[] args) {
		Osoba andrej = new Osoba( "Andrej", "Krátky", "430202/113" );	// Andrej Kratky 320202/222
		andrej.setMeno( "Peter" );
		andrej.setRodneCislo( "44" );
		System.out.println( andrej );
		System.out.println( andrej.getMeno() );
	}

}
