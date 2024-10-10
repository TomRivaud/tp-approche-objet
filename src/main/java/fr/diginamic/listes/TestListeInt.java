package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args){

        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);

//        for (Integer number: liste) {
//
//        }
//        System.out.println(liste.size());


        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        for (Integer number: liste){
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println(max);
        System.out.println(min);

        //Il faut convertir le int en Integer pour appeler la méthode remove
        liste.remove(Integer.valueOf(min));
        for (Integer number: liste){
            System.out.println(number + " ");
        }


        for (int i = 0; i < liste.size(); i++) {
            int valeur = liste.size();
            if(valeur < 0){
                liste.set(i, -valeur);
            }
        }


//        System.out.println(liste);
//
//        System.out.println(Collections.max(liste));
//        liste.remove(Collections.min(liste));
//        System.out.println(liste);
//
//        for (int i = 0; i < liste.size(); i++) {
//            if(liste.get(i) < 0){
//                liste.set(liste.get(i + 1), Math.abs());
//            }
//        }
//        System.out.println(liste);

    }
}
