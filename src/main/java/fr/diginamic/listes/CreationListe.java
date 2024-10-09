package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args){

        ArrayList<Integer> oneToHundred = new ArrayList<>();
        int i = 1;
        while (oneToHundred.size() <= 100){
            oneToHundred.add(i-1);
            System.out.println(oneToHundred.get(i-1));
            i++;
        }
    }
}
