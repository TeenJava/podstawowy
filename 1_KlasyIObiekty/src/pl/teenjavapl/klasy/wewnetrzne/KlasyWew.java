package pl.teenjavapl.klasy.wewnetrzne;

/**
 * 
 * @author PolishCivil Klasy wewnętrzne to 'klasy w klasach'. O użyciu później
 *         :D
 */
public class KlasyWew {
    public static void main(String[] args) {
	// Wew_1 w1 = null;
	// Wew_2 w2 = null;
	// Wew_3 w3 = null;
    }

    /**
     * 
     * @author PolishCivil Widzimy ją tylko w Klasie 'KlasyWew'
     */
    private class Wew_1 { // jest żaróweczka bo nigdzie jej tutaj nie używamy

    }

    /**
     * 
     * @author PolishCivil Widzimy ją w całym pakiecie gdzie się znajduje klasa
     *         'KlasyWew'
     */
    class Wew_2 {

    }

    /**
     * 
     * @author PolishCivil Widzimy ja wszedzie, praktycznie wychodzi na to samo
     *         jakbyśmy zrobili nowy plik .java
     */
    public class Wew_3 {

    }
}
