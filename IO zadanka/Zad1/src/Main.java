public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Ksiazka k1 = new Ksiazka(1999, 2);
        System.out.println(k1.okreslWartosc());
        Ksiazka k2 = new Ksiazka(2006, 3);
        System.out.println(k2.okreslWartosc());
        Obraz o1 = new Obraz(1800);
        System.out.println(o1.okreslWartosc());
        Obraz o2 = new Obraz(1900);
        System.out.println(o2.okreslWartosc());
        Rzezba r1 = new Rzezba(1500, 3);
        System.out.println(r1.okreslWartosc());
        Rzezba r2 = new Rzezba(900, 5);
        System.out.println(r2.okreslWartosc());


        Magazyn magazyn = Magazyn.getInstance();
        magazyn.dodajDoSpisu(k1);
        magazyn.dodajDoSpisu(k2);
        magazyn.dodajDoSpisu(o1);
        magazyn.dodajDoSpisu(o2);
        magazyn.dodajDoSpisu(r1);
        magazyn.dodajDoSpisu(r2);

        System.out.println(magazyn.pobierzWartoscMagazynuBezPodatku());
        System.out.println(magazyn.pobierzWartoscPoOPodatkowaniu(new PodatekLiniowy()));
        System.out.println(magazyn.pobierzWartoscPoOPodatkowaniu(new PodatekProgresywny()));
    }
}
