package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){
        Personne personne01 = new Personne("Dupont", "Jean");

        Personne personneAdr01 = new Personne("Lafondue", "Hubert", new AdressePostale(14, "Rue", 34000, "Maville"));

    }
}
