import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    private List<Przedmiot> przedmiotList = new ArrayList<>();

    private static Magazyn instance = null;
    private Magazyn() { }
    public static Magazyn getInstance() {
        if(instance == null) {
            instance = new Magazyn();
        }
        return instance;
    }

    public void dodajDoSpisu(Przedmiot przedmiot){
        przedmiotList.add(przedmiot);
    }
    public double pobierzWartoscPoOPodatkowaniu(Podatek podatek){
        return podatek.wyliczWartoscPoPodatku(pobierzWartoscMagazynuBezPodatku());
    }
    public double pobierzWartoscMagazynuBezPodatku(){
        double wartoscMagazynu = 0;
        for (Przedmiot przedmiot: przedmiotList) {
            wartoscMagazynu += przedmiot.okreslWartosc();
        }
        return wartoscMagazynu;
    }
}
