package den03boxing;

import java.util.ArrayList;
import java.util.List;

public class Priklad01ObjectWrapper {

	/*
	 * Ku každému primitívnemu typu v Jave existuje aj objektový typ, tzv. "Object Wrapper":
	 * int -> Integer
	 * Java robí prevody medzi primitívnym typom a ObjectWrapperom automaticky.
	 */
	public static void main(String[] args) {
		int cislo = 5;
		Integer cisloObjekt = cislo;
		
		System.out.println( "Objekt cisloObjekt ma hodnotu " + cisloObjekt );
		
		cislo = cisloObjekt + 7;
		System.out.println( "Cislo ma teraz hodnotu " + cislo);
		
		List<Integer> zoznamCisel = new ArrayList<>();	// Do List-u môžem ukladať iba objekty, nie primitívne typy!
		zoznamCisel.add(cisloObjekt);
		zoznamCisel.add(cislo);		// boxing - automatický prevod na Integer
		zoznamCisel.add(33);		// boxing - automatický prevod na Integer
		System.out.println( "Cely zoznam cisel je " + zoznamCisel);
	}
}
