public class Ksiazka implements Przedmiot {
    private int rokWydania;
    private int numerWydania;

    public Ksiazka(int rokWydania, int numerWydania) {
        this.rokWydania = rokWydania;
        this.numerWydania = numerWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public int getNumerWydania() {
        return numerWydania;
    }

    public void setNumerWydania(int numerWydania) {
        this.numerWydania = numerWydania;
    }

    @Override
    public double okreslWartosc() {
        return (double)(2050 - rokWydania)/(double)numerWydania;
    }
}
