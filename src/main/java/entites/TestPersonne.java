package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){
        Personne personne01 = new Personne();
        personne01.nom = "Dupont";
        personne01.prenom = "Jean";
        personne01.adressePostale.numeroDeRue = 15;
        personne01.adressePostale.libelle = "Rue de la Poste";
        personne01.adressePostale.codePostal = 32000;
        personne01.adressePostale.ville = "Jeanville";

        Personne personne02 = new Personne();
        personne02.nom = "Lafondue";
        personne02.prenom = "Hubert";
        personne02.adressePostale.numeroDeRue = 45;
        personne02.adressePostale.libelle = "Rue du Boucher";
        personne02.adressePostale.codePostal = 17000;
        personne02.adressePostale.ville = "La Rochelle";
    }
}
