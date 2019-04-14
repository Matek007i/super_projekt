package dzien0704.Enumy.Zad01;


import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan", "Kowalski", Plec.MEZCZYZNA);
        Osoba osoba2 = new Osoba("John", "Smith", Plec.MEZCZYZNA);
        Osoba osoba3 = new Osoba("Anna", "Nowak", Plec.KOBIETA);
        Osoba osoba4 = new Osoba("Katarzyna", "Kowalska", Plec.KOBIETA);
        Osoba osoba5 = new Osoba("Katarzyna", "Kowalska", Plec.KOBIETA);
        Osoba osoba6 = new Osoba("Piotr", "Kowalska", Plec.KOBIETA);


        ArrayList<Osoba> arrayList = new ArrayList<>();
        arrayList.add(osoba);
        arrayList.add(osoba2);
        arrayList.add(osoba3);
        arrayList.add(osoba4);
        arrayList.add(osoba5);
        arrayList.add(osoba6);

        Set<String> strings = imionaNaAKJP(arrayList);
        System.out.println(strings);

//        ArrayList<Osoba> osobas = pobierzKobiety(arrayList);
//        System.out.println(osobas);

//        Set<Osoba> osobas1 = usunDuplikaty(arrayList);
//        System.out.println(osobas1);
/*        Set<Osoba> osobas = usunDuplikatyIMezczyzn(arrayList);
        System.out.println(osobas);*/
    }

    public static void wypiszKobiety(List<Osoba> list) {
        for (Osoba o : list) {
            if (o.getPlec() == Plec.KOBIETA) {
                System.out.println(o);
            }
        }
    }

    public static ArrayList<Osoba> pobierzKobiety(List<Osoba> list) {
        ArrayList<Osoba> osobas = new ArrayList<>();

        for (Osoba o : list) {
            if (o.getPlec() == Plec.KOBIETA) {
                osobas.add(o);
            }
        }
        return osobas;
    }

    public static Set<Osoba> usunDuplikaty(List<Osoba> list) {
        return new HashSet<>(list);
    }

    public static Set<Osoba> usunDuplikatyIMezczyzn(List<Osoba> list) {
        HashSet<Osoba> osobas = new HashSet<>();

        for (Osoba os : list) {
            if (os.getPlec() == Plec.KOBIETA) {
                osobas.add(os);
            }
        }
        return osobas;
    }

    public static List<Integer> zamienOsoby(List<Osoba> list) {
        //Anna Kowalska KOBIETA
        //4 + 8 = 12
        // KOBIETA => 12 * 2 = 24
        // mezczyzna => 12
        ArrayList<Integer> results = new ArrayList<>();   /// tworzymy nowa arrayliste dla wynikow
        for (Osoba os : list) {                                                 /// ilosc osob w liscie
            int dlImienia = os.getImie().length();                      // liczymy znaki dla imienia
            int dlNazwiska = os.getNazwisko().length();             // liczymy znaki dla nazwiska
            int wynik = dlImienia + dlNazwiska;   // dodajemy znaki imie  + nazwisko
            if (os.getPlec() == Plec.KOBIETA) {  // jesli jest to kobieta
                wynik *= 2;  // mnozymy *2
            }
            results.add(wynik); /// dodajemy wynuk do listy ktora stworzylismy w linicje 73
        }
        return results; // wyswietlamy wynik
    }

    public static Set<String> imionaNaAKJP(List<Osoba> list) {               // tworzymy set z lista imion ktore zaczynja sie na AKJP
        TreeSet<String> stringTreeSet = new TreeSet<>();        // tworzenie treesetu
        for (Osoba os : list) { // przejscie po arrayliscie
            if (os.getImie().startsWith("A") || os.getImie().startsWith("K") || os.getImie().startsWith("J") || os.getImie().startsWith("P")) {
                stringTreeSet.add(os.getImie());   /// warunki
            }
        }
        return stringTreeSet;
    }
}
