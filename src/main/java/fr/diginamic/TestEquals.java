package fr.diginamic;

import fr.diginamic.listes.Ville;

public class TestEquals {
    public static void main(String[] args) {

        Ville ville01 = new Ville("Pau", 25000);
        Ville ville02 = new Ville("Pau", 25000);

        System.out.println(ville01.equals(ville02));


        Ville ville03 = new Ville("Pau", 25000);
        Ville ville04 = new Ville("Peaux", 25000);

        System.out.println(ville03.equals(ville04));


        System.out.println(ville01 == ville02);
        System.out.println(ville03 == ville04);
    }
}
