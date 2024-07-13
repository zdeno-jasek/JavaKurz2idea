package den03file;

import java.io.FileReader;
import java.io.IOException;

// ÚLOHA
public class Priklad02FileReader {

	/*
	 * Príklad na načítanie obsahu súboru s názvom "vystup.txt".
	 * FileReader - Javovská trieda, ktorá umožňuje čítať vstupný súbor znak po znaku.
	 * Metóda read vráti buď jeden znak, alebo -1, ak bol už celý súbor prečítaný.
	 */
	public static void main(String[] args) {
		
		try (
				FileReader subor = new FileReader("vystup.txt"); 
				) {
			int input = subor.read();
			// TODO Vypisovať znaky na konzolu, kým input nie je -1
			System.out.println( (char) input );
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println( "Koniec" );
	}
}
