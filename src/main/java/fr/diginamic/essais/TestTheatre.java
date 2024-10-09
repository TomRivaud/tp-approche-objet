package fr.diginamic.essais;

import fr.diginamic.banque.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args){

        Theatre theatre01 = new Theatre("Theatre Mtp", 15);
        int i;
        for (i=0; i<7; i++){
            theatre01.Inscription(3, 50);
        }
        System.out.println("Recette : " + theatre01.moneyMade);
        System.out.println("Clients : " + theatre01.clientsRegistered);
    }
}
