package fr.diginamic.listes;

public class Ville implements Comparable<Ville> {

    private String nom;
    private int nbHabitants;

//    public int compareTo(Ville autre){
//        int nb = this.nom.compareTo(autre.nom);
//        return nb;
//    }

    @Override
    public int compareTo(Ville autre){
        int nb = 0;
        if(this.nbHabitants > autre.nbHabitants){
            nb = 1;
        }
        else if(this.nbHabitants < autre.nbHabitants){
            nb = -1;
        }
        return nb;
    }


    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public String toString() {
        return nom + ", " + nbHabitants + " hab.";
    }
}
