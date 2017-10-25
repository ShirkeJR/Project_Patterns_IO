public class PodatekProgresywny implements Podatek {
    @Override
    public double wyliczWartoscPoPodatku(double wartosc) {
        double wartosc2 = wartosc - 10000;
        if(wartosc > 10000)
            return 9820 + wartosc2 - (wartosc2 * 0.32);
        else
            return wartosc - (wartosc * 0.32);
    }
}
