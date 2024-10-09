package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {

        Salarie salarie01 = new Salarie("Pat", "Bonin", 150);
        salarie01.getSalaire();

        Pigiste pigiste01 = new Pigiste("Louis", "Gueraud", 12, 50);
        pigiste01.getSalaire();

        Intervenant.afficherDonneesSalarie(salarie01);
        Intervenant.afficherDonneesPigiste(pigiste01);
    }
}
