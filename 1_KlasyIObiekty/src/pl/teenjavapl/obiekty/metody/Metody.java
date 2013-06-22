package pl.teenjavapl.obiekty.metody;

public class Metody {
    public static void main(String[] args) {
	Byt ja = new Byt();
	ja.wiek = 17;// podstawowy wiek
	ja.setNazwa("PolishCivil");// nie moge tutaj zrobic ja.nazwa = ...
				   // ponieważ nazwa w obiekcie (klasie) Byt
				   // jest prywatna więc można ją widzieć tylko
				   // w środku tej klasy, ale zrobiłem publiczną
				   // metodę która ustawia nazwę w tej klasie
	System.out.println(ja.getStringValue());// wypisuje swoje dane
	ja.dodajDoWieku(10);// dodaje do wieku 10 więc jestem już 10lat starszy
			    // xD
	System.out.println(ja.getStringValue());

    }
}
