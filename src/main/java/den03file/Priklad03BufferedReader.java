package den03file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// VYSVETLENIE
public class Priklad03BufferedReader {

	/*
	 * Príklad na načítanie obsahu súboru s názvom "vystup.txt".
	 * FileReader - umožňuje čítať súbor znak po znaku.
	 * BufferedReader - umožňuje čítať Reader po riadkoch (nie súbor)
	 */
	public static void main(String[] args) {
		
		try (
				FileReader subor = new FileReader("vystup.txt"); 
				BufferedReader reader = new BufferedReader(subor);
				) {
			String celyRiadok = reader.readLine();
			while ( celyRiadok != null ) {
				System.out.println( celyRiadok );
				celyRiadok = reader.readLine();				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println( "Koniec" );
	}
}
