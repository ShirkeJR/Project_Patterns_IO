public class PodatekLiniowy implements Podatek {
    @Override
    public double wyliczWartoscPoPodatku(double wartosc) {
        return wartosc - (wartosc * 0.19);
    }
}
