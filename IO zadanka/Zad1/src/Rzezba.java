public class Rzezba implements Przedmiot{
    private int rokWykonania;
    private double rozmiarRzezby;

    public Rzezba(int rokWykonania, double rozmiarRzezby) {
        this.rokWykonania = rokWykonania;
        this.rozmiarRzezby = rozmiarRzezby;
    }

    @Override
    public double okreslWartosc() {
        return (2020 - rokWykonania) * rozmiarRzezby * 2;
    }

    public double getRozmiarRzezby() {
        return rozmiarRzezby;
    }

    public void setRozmiarRzezby(double rozmiarRzezby) {
        this.rozmiarRzezby = rozmiarRzezby;
    }

    public int getRokWykonania() {

        return rokWykonania;
    }

    public void setRokWykonania(int rokWykonania) {
        this.rokWykonania = rokWykonania;
    }
}
