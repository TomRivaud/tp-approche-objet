package entites;

public class TestAdressePostale {
    public static void main(String[] args){

        AdressePostale adr1 = new AdressePostale();
        adr1.numeroDeRue = 52;
        adr1.libelle = "Rue du Chat";
        adr1.codePostal = 12000;
        adr1.ville = "Chatville";

        AdressePostale adr2 = new AdressePostale();
        adr2.numeroDeRue = 15;
        adr2.libelle = "Rue des Mouettes";
        adr2.codePostal = 58000;
        adr2.ville = "Goelandcity";
    }
}
