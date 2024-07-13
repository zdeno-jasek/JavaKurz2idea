package den01bigdecimal;

import java.math.BigDecimal;

// VYSVETLENIE
public class Priklad01BigDecimal {

	/*
	 * Na počítanie s peniazmi používame vždy BigDecimal.
	 * Typ double je síce rýchlejší, ale môže obsahovať nepresné čísla.
	 * Obvykle pre "vedecké výpočty" sa používa double.
	 */
	public static void main(String[] args) {
		
		double velkeRealne = 50_000_000_000_000_000L;
		double maleRealne = 0.05;
		
		System.out.println( velkeRealne + maleRealne );
		
		BigDecimal velkeCislo = BigDecimal.valueOf( velkeRealne );
		BigDecimal maleCislo = BigDecimal.valueOf( maleRealne );
		
		BigDecimal sucet = velkeCislo.add(maleCislo);
		
		System.out.println( sucet );
		
	}
}
