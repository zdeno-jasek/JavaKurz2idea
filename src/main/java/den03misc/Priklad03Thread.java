package den03misc;

// VYSVETLENIE
public class Priklad03Thread {

	/*
	 * Java umožňuje spúšťať viac threadov súčasne.
	 * Thread (vlákno) je kus kódu, ktoré sa vykonáva paralelne s iným threadom.
	 * Nasledujúci príklad ukazuje dva thready, ktoré vypisujú čísla od 1 do 10.
	 * 
	 * Thready sa využívajú pre paralelnú prácu:
	 * 1. viacero používateľov používa tú istú aplikáciu (napr. na stránku google.com pristúpia dvaja používatelia naraz)
	 * 2. efektívne využívanie zdrojov s rôznou rýchlosťou (čítanie z databázy a súčasný zápis na disk)
	 */
	public static void main(String[] args) {
		// Príprava prvého threadu aj s FOR-cyklom pre výpis čísel od 1 do 10
		Thread t1 = new Thread(() -> 
		{
			for (int i = 0; i < 10; i++) {
				System.out.println("   " + i);
			}
		}
		);
		
		// Príprava druhého threadu aj s FOR-cyklom pre výpis čísel od 1 do 10
		Thread t2 = new Thread(() -> 
		{
			for (int i = 0; i < 10; i++) {
				System.out.println("      " + i);
			}
		}
		);
		// TODO pridať tretí thread, ktorý pôjde od 0 do 20
		
		// Spustenie oboch threadov
		t1.start();
		t2.start();
		
		// Tento text sa vypíše na začiatok
		System.out.println( "KONIEC ");
	}
}
