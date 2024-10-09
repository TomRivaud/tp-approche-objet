package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args){

        Maison maison01 = new Maison();

        maison01.ajouterPiece(new Cuisine(15, 0));
        maison01.ajouterPiece(new Chambre(9, 0));
        maison01.ajouterPiece(new Chambre(14, 1));
        maison01.ajouterPiece(new Salon(25, 0));
        maison01.ajouterPiece(new SalleDeBain(12, 0));
        maison01.ajouterPiece(new WC(4, 1));

        maison01.totalSuperficie(maison01.maison);
        maison01.etageSuperficie(maison01.maison, 0);

    }
}
