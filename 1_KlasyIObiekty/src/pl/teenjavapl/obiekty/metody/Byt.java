package pl.teenjavapl.obiekty.metody;

/**
 * 
 * @author PolishCivil Klasa bytu, każdy byt ma swój wiek i nazwę.
 */
public class Byt {
    private String nazwa;
    public int wiek;

    /**
     * Dodaje do wieku określoną liczbę
     * 
     * @param liczba
     */
    public void dodajDoWieku(int liczba) {
	wiek += liczba;
    }

    /**
     * Zwraca dane bytu w postaci stringu(tekstu). Użycie dla szybszego
     * wypisywania do konsoli
     * 
     */
    public String getStringValue() {
	return "Byt: " + nazwa + " wiek: " + wiek;
    }

    public String getNazwa() {
	return nazwa;
    }

    public void setNazwa(String nazwa) {
	this.nazwa = nazwa;
    }

}
