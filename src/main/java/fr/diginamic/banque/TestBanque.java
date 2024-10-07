package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args){

        Compte compte01 = new Compte(1552, 2000);
        Compte compte02Taux = new CompteTaux(1004, 5200, 2.5);
        Compte[] compteArray = {compte01, compte02Taux};

        int i;
        for (i=0; i<compteArray.length; i++){
            System.out.println(compteArray[i]);
        }
        //System.out.println(compte01);
    }
}
