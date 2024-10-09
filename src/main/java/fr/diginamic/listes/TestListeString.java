package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

    public static void main(String[] args){

        ArrayList<String> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");


        for (int i = 0; i < listeVilles.size(); i++) {
            listeVilles.set(i, listeVilles.get(i).toUpperCase());
        }
        System.out.println(listeVilles);


        String result = "";
        for (String ville : listeVilles) {
            if (ville.length() > result.length()) {
                result = ville;
            }
        }
        System.out.println(result);


        Iterator<String> iterator = listeVilles.iterator();
        while (iterator.hasNext()){
            String myListe = iterator.next();
            if(myListe.startsWith("N")){
                iterator.remove();
            }
        }
        System.out.println(listeVilles);
    }
}
