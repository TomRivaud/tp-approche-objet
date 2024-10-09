package fr.diginamic.essais;

import fr.diginamic.banque.entites.Operation;
import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args){

        //Calcul Operations
        Operations ope = new Operations();
        float resultOperations;
        resultOperations = ope.Calcul(5, 6, '-');
        System.out.println(resultOperations);
        resultOperations = ope.Calcul(1, 6, '+');
        System.out.println(resultOperations);
        resultOperations = ope.Calcul(5, 6, '*');
        System.out.println(resultOperations);
        resultOperations = ope.Calcul(15, 3, '/');
        System.out.println(resultOperations);

    }
}
