package den05class;

public class Priklad02Metoda {

	public static void main(String[] args) {
		Priklad01Metoda.novaMetoda();
		novaMetoda();
		System.out.println( Priklad01Metoda.sucet( 20, 40 ) );
		System.out.println( podiel( 100, 0 ) );
	}

	public static void novaMetoda() {
		System.out.println( "Ina metoda");
	}

	private static int podiel(int delenec, int delitel) {
		// dopisat kod tak, aby pri deleni 0 nevznikla chyba, ale vratila sa 0ň
		if (delitel == 0) {
			System.out.println( "Chyba" );
			return 0;
		}
		return delenec / delitel;
	}

}
