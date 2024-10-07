package fr.diginamic.banque.entites;

public class Compte {

    int numCompte;
    double soldeCompte;

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public Compte(int numCompte, double soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    private String name;
    public String toString(){
        return numCompte + ", " + soldeCompte;
    }

}
