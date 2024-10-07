package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){
        AdressePostale a1 = new AdressePostale(14, "Rue", 34000, "Maville");

        Personne personne01 = new Personne("Dupont", "Jean");


        Personne personneAdr01 = new Personne("Lafondue", "Hubert", a1);

        personneAdr01.affichageNomPrenom();
        personneAdr01.setNom("Berut");
        personneAdr01.setPrenom("Patrick");
        personneAdr01.setAdresse(a1);
        personneAdr01.getNom();
        personneAdr01.getPrenom();
        personneAdr01.getAdresse();
    }
}
