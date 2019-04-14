package ZadaniaDomoweTomek.Listy.Zad01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseOrderNr1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mateusz");
        list.add("Krzystof");
        list.add("Ola");
        list.add("Ada");
        list.add("Adam");

        System.out.println("Lista: " +list);

        Collections.reverse(list);
        System.out.println("Lista odwrocona: " +list);
    }
}
