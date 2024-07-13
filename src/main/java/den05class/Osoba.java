package den05class;

public class Osoba implements Comparable<Osoba> {
	private String meno;
	private String priezvisko;
	private String rodneCislo;
	
	/*
	 * Idem napísať konštruktor.
	 * Konštruktor je metóda, ktorej názov je rovnaký ako názov triedy.
	 * Konštruktor nikdy nemá návratovú hodnotu.
	 */
	public Osoba( String meno, String priezvisko, String rodneCislo ) {
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.rodneCislo = rodneCislo;
	}
	
	public void setMeno(String meno) {
		this.meno = meno;
	}
	
	public void setRodneCislo(String rodneCislo) {
		if ( rodneCislo.length() >= 10 ) {
			this.rodneCislo = rodneCislo;
		}
	}
	
	@Override
	public String toString() {
		return meno + " " + priezvisko + ": " + rodneCislo;
	}

	public String getMeno() {
		return meno;
	}

	public String getPriezvisko() {
		return priezvisko;
	}

	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}

	@Override
	public int compareTo(Osoba inaOsoba) {
		return rodneCislo.compareTo(inaOsoba.rodneCislo);
	}	
	
}
