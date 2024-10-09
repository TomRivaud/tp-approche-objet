package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {

    public static void main(String[] args) {

        //Array
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        //Ville la plus peuplée
        Ville villePlusPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
                villePlusPeuplee = ville;
            }
        }

        //Ville la moins peuplée
        Ville villeMoinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
                villeMoinsPeuplee = ville;
            }
        }
        villes.remove(villeMoinsPeuplee);
        System.out.println("Ville la moins peuplée " + villeMoinsPeuplee);


        //Modification des villes > 100k hab
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }
        System.out.println(villes);
    }
}
