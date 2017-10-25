public class Obraz implements Przedmiot {
    private int rokNamalowania;

    public Obraz(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    @Override
    public double okreslWartosc() {
        return (2100 - rokNamalowania) * 10;
    }

    public int getRokNamalowania() {
        return rokNamalowania;
    }

    public void setRokNamalowania(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }
}
