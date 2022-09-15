package com.itbootcamp.bgqa.nedelja5.knjige;

public class Knjiga implements Comparable{
    private String naslov;
    private String zanr;
    private int godinaIzdanja;
    private String autor;
    private int brojProdatihKopija;


    public Knjiga(String naslov, String zanr, int godinaIzdanja, String autor, int brojProdatihKopija) {
        this.naslov = naslov;
        this.zanr = zanr;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
        this.brojProdatihKopija = brojProdatihKopija;
    }

    public Knjiga(String naslov, String zanr, int godinaIzdanja, String autor) { // constructor overload
        //System.out.println("bla bla");
        this(naslov, zanr, godinaIzdanja);
        this.autor = autor;
    }

    public Knjiga(String naslov, String zanr, int godinaIzdanja) { // constructor overload
        this.naslov = naslov;
        this.zanr = zanr;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getBrojProdatihKopija() {
        return brojProdatihKopija;
    }

    public void setBrojProdatihKopija(int brojProdatihKopija) {
        this.brojProdatihKopija = brojProdatihKopija;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslov='" + naslov + '\'' +
                ", zanr='" + zanr + '\'' +
                ", godinaIzdanja=" + godinaIzdanja +
                ", autor='" + autor + '\'' +
                ", brojProdatihKopija=" + brojProdatihKopija +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Knjiga)) {
            return false;
        }

        Knjiga knjiga = (Knjiga) object;

        return this.getAutor().equals(knjiga.getAutor()) &&
                this.getBrojProdatihKopija() == knjiga.getBrojProdatihKopija() &&
                this.getGodinaIzdanja() == knjiga.getGodinaIzdanja() &&
                this.getNaslov().equals(knjiga.getNaslov());
    }

    public static void main(String[] args) {
        Knjiga knjiga =
                new Knjiga("Hari poter", "Fantastika", 1991, "JK Rowlong", 10000);

        Knjiga knjiga2 = new Knjiga("Hari poter 15 Deo", "Fantastija", 2033, "JK ROwling");

        Knjiga knjiga3 = new Knjiga("Hari poter 15 Deo", "Fantastija", 2033);

        System.out.println(knjiga2.getBrojProdatihKopija());
        knjiga2.setBrojProdatihKopija(100);
        knjiga2.brojProdatihKopija += 1; // sad je 101

        System.out.println(knjiga3.getAutor());
    }

    @Override
    public int compareTo(Object o) {
        Knjiga knjigaKojaSePoredi = (Knjiga) o;
        return knjigaKojaSePoredi.getBrojProdatihKopija() - this.getBrojProdatihKopija();
    }
}
