package fr.diginamic.chaines;

import fr.diginamic.banque.entites.Salaire;

public class ManipulationChaine {

    public static void main(String[] args){
        String chaine = "Durand;Marcel;2 523.5";

        //1
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        //2
        System.out.println("Chaine length: " + chaine.length());

        //3
        System.out.println("Index de ;: " + chaine.indexOf(';'));

        //4
        System.out.println("Nom de famille extrait: " + chaine.substring(0, chaine.indexOf(';')));

        //5
        System.out.println("Nom de famille MAJ: " + chaine.substring(0, chaine.indexOf(';')).toUpperCase());

        //6
        System.out.println("Nom de famille min: " + chaine.substring(0, chaine.indexOf(';')).toLowerCase());

        //7
        String[] arrayChaine = chaine.split(";");
        int i = 0;
        while (i<arrayChaine.length){
            System.out.println(arrayChaine[i]);
            i++;
        }

        //9
        String nom = arrayChaine[0];
        String prenom = arrayChaine[1];
        double salaire = Double.parseDouble(arrayChaine[2].replace(" ", ""));
        Salaire salaireDurand = new Salaire(nom, prenom, salaire);
        System.out.println(salaireDurand);
    }
}
