package pl.teenjavapl.obiekty;

/**
 * 
 * @author PolishCivil Obiekty to nic innego jak instancja. Obiekty mają własne
 *         przydzielone miejsce w pamiecie komputera. Jeśli mówimy o obiekcie
 *         klasy Czlowiek to mówimy o konkretnym człowieku. Czyli z jednej klasy
 *         możemy zrobić bilion człowieki.
 */
public class Czlowiek {
    String imie, nazwisko;

    // główna metoda rozruchowa dla testu i zobrazowania tego co napisałem
    public static void main(String[] args) {
	Czlowiek jan = new Czlowiek();
	jan.imie = "Jan";
	jan.nazwisko = "Kowalski";
	Czlowiek robert = new Czlowiek();
	robert.imie = "Robert";
	robert.nazwisko = "Malczewski";

	System.out.println("Obiekt jan: " + jan.imie + " " + jan.nazwisko);
	System.out.println("Obiekt robert: " + jan.imie + " " + jan.nazwisko);

	/*
	 * Nazwy obiektów piszemy z małych liter, jeśli są 2 członowe zaczynamy
	 * małą a drugi człon zaczynamy dużą. np:
	 * Czlowiek jan = new Czlowiek();
	 * Czlowiek dużyJan = new Czlowiek();
	 */

    }
}
