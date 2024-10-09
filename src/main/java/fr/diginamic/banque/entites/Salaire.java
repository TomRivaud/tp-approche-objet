package fr.diginamic.banque.entites;

public class Salaire {

    String nom;
    String prenom;
    double salaire;

    public Salaire(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String toString(){
        return nom + " " + prenom + " " + salaire;
    }
}
