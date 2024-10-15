package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

        StringBuilder builderNb = new StringBuilder();

        long debutStringBuilder = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            builderNb.append(i);
        }
        // Code à chronométrer
        long finStringBuilder = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (finStringBuilder - debutStringBuilder));


        String myString = "";
        long debutPlus = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            myString = myString + ("i");
        }
        long finPlus = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (finPlus - debutPlus));
    }
}
