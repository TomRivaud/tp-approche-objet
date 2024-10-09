package fr.diginamic.salaire;

public abstract class Intervenant {

    String nom;
    String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract void getSalaire();


    public static void afficherDonneesSalarie(Salarie salarie){
        System.out.println(salarie.nom + " " + salarie.prenom + " " + salarie.salaireMensuel);
    }

    public static void afficherDonneesPigiste(Pigiste pigiste){
        System.out.println(pigiste.nom + " " + pigiste.prenom + " " + pigiste.salaire);
    }
}
