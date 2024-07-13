package den03boxing;

// ÚLOHA
public class Priklad02Boxing {

	/*
	 * Ku každému primitívnemu typu v Jave existuje aj objektový typ, tzv. "Object Wrapper":
	 * int -> Integer
	 * long -> Long
	 * double -> Double
	 * float -> Float
	 * char -> Character
	 * 
	 * Ku každému primitívnemu typu vytvorte jeho objektový typ, priraďte do neho hodnotu
	 * primitívneho typu a vypíšte ho na obrazovku.
	 */
	public static void main(String[] args) {
		int cislo = 5;
		long dlheCislo = 12_000_001;
		double realneCislo = 5.4;
		float maleCislo = 2.3f;
		char pismeno = 'z';
		
		Integer cisloObject = cislo;
		System.out.println( "Hodnota cislo je " + cisloObject );
		// TODO
		System.out.println( "Hodnota dlheCislo je " );
		System.out.println( "Hodnota realneCislo je " );
		System.out.println( "Hodnota maleCislo je " );
		System.out.println( "Hodnota pismeno je " );
	}
}
