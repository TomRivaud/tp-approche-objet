package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {

        //Calcul Moyenne
        double moyenneArray;

        CalculMoyenne calcMoy01 = new CalculMoyenne();
        calcMoy01.Ajout(50);
        moyenneArray = calcMoy01.Calcul();

        System.out.println(moyenneArray);

        CalculMoyenne calcMoy02 = new CalculMoyenne();
        calcMoy02.Ajout(12);
        moyenneArray = calcMoy02.Calcul();

        System.out.println(moyenneArray);
    }
}
