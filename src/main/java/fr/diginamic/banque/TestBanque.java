package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args){

        Compte compte01 = new Compte(1552, 2000);
        System.out.println(compte01);
    }
}
