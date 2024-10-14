package fr.diginamic.fichier;

public class Commune {

    String nom;
    String codeDepartement;
    String nomRegion;
    double popTotale;

    public Commune(String nom, String codeDepartement, String nomRegion, double popTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.popTotale = popTotale;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public double getPopTotale() {
        return popTotale;
    }

    public void setPopTotale(double popTotale) {
        this.popTotale = popTotale;
    }

    @Override
    public String toString() {
        return nom + " " + codeDepartement + ", " + nomRegion + " Population: " + popTotale;
    }
}
