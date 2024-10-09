package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

    int nbJourTravail;
    double remuJourna;
    double salaire;

    public Pigiste(String nom, String prenom, int nbJourTravail, double remuJourna) {
        super(nom, prenom);
        this.nbJourTravail = nbJourTravail;
        this.remuJourna = remuJourna;
        this.salaire = nbJourTravail*remuJourna;
    }

    @Override
    public void getSalaire() {
        System.out.println("Salaire de " + nom + " " + prenom + " : " + salaire + "€ pour " + nbJourTravail + " jour(s) de travail");
    }
}
