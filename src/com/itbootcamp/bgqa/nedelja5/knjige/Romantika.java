package com.itbootcamp.bgqa.nedelja5.knjige;

public class Romantika extends Knjiga{
    public Romantika(String naslov, String zanr, int godinaIzdanja, String autor, int brojProdatihKopija) {
        super(naslov, zanr, godinaIzdanja, autor, brojProdatihKopija);
    }

    public Romantika(String naslov, String zanr, int godinaIzdanja, String autor) {
        super(naslov, zanr, godinaIzdanja, autor);
    }

    public Romantika(String naslov, String zanr, int godinaIzdanja) {
        super(naslov, zanr, godinaIzdanja);
    }
}
