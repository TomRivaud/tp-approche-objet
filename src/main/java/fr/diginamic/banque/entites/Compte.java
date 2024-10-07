package fr.diginamic.banque.entites;

public class Compte {

    int numCompte;
    int soldeCompte;

    public Compte(int numCompte, int soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    private String name;
    public String toString(){
        return numCompte + ", " + soldeCompte;
    }

}
