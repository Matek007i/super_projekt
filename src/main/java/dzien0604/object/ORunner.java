package dzien0604.object;

public class ORunner {
    public static void main(String[] args) {
        Osoba osoba = new Osoba(15,"Jan","Kowalski");
        Osoba osoba2 = new Osoba(15,"Jan","Kowalski");

        System.out.println(osoba);
        System.out.println(osoba.equals(osoba2));
        System.out.println(osoba.equals(osoba));
        System.out.println(osoba.hashCode());
        System.out.println(osoba.getClass());
    }
}
