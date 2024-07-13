package den01bigdecimal;

import java.math.BigDecimal;

// VYSVETLENIE
public class Priklad02BigDecimalOperacie {

	/*
	 * BigDecimal je trieda, ktorá slúži na presné výpočty aj s veľkými číslami.
	 * Používa sa hlavne na počítanie s peniazmi, keď je nevyhnutná úplná presnosť.
	 * Typ double je pre prácu s reálnymi číslami výhodnejší, lebo práca s ním je rýchlejšia.
	 * Ale ak potrebujeme absolútnu presnosť, musíme mať BigDecimal.
	 * 
	 * Napíšte program s jednoduchými aritmetickými operáciami pre BigDecimal
	 * 
	 * Pomôcky:
	 * 	add - sčítanie
	 * 	subtract - odčítanie
	 * 	multiply - násobenie
	 * 	divide - delenie
	 */
	public static void main(String[] args) {
		BigDecimal cislo = BigDecimal.valueOf( 20_000 );
		BigDecimal druhe = BigDecimal.valueOf( 10 );
		
		System.out.println( cislo + " + " + druhe + " = " + cislo.add( druhe ) );
		System.out.println( cislo + " - " + druhe + " = " + cislo );	// TODO subtract
		System.out.println( cislo + " x " + druhe + " = " + cislo );	// TODO multiply
		System.out.println( cislo + " / " + druhe + " = " + cislo );	// TODO divide

		System.out.println( cislo + " / 1000 = " + cislo.movePointLeft(3) );
		
	}
}
