package den05class;

public class Priklad01Metoda {

	public static void main(String[] args) {
		System.out.println("Hello");
		novaMetoda();
		System.out.println( sucet( 20, 40 ) );
		System.out.println("Koniec");
	}
	
	public static int sucet(int scitanec1, int scitanec2) {
		return scitanec1 + scitanec2;
	}

	public static void novaMetoda() {
		System.out.println("Volanie novej metody");
	}

}
