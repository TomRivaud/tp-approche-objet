package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale){
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }


    public void affichageNomPrenom(){
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    public void setNom(String nom){
        System.out.println("Ancien nom : " + nom);
        this.nom = nom;
        System.out.println("Nouveau nom : " + nom);
    }

    public void setPrenom(String prenom){
        System.out.println("Ancien prenom : " + prenom);
        this.prenom = prenom;
        System.out.println("Nouveau nom : " + prenom);
    }

    public void setAdresse(AdressePostale adr){
        System.out.println("Ancienne adresse : " + adressePostale);
        this.adressePostale = adr;
        System.out.println("Nouvelle adresse : " + adressePostale);
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public AdressePostale getAdresse(){
        return this.adressePostale;
    }
}
