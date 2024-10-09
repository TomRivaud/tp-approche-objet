package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args){

        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);

        System.out.println(liste);
        System.out.println(liste.size());

        System.out.println(Collections.max(liste));
        liste.remove(Collections.min(liste));
        System.out.println(liste);

        for (int i = 0; i < liste.size(); i++) {
            if(liste.get(i) < 0){
                //liste.set(liste.get(i + 1), Math.abs(liste.get(i + 1)));
            }
        }
        System.out.println(liste);

    }
}
