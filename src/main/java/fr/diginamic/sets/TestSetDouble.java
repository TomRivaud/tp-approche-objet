package fr.diginamic.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
    public static void main(String[] args) {

        HashSet<Double> doubleSet = new HashSet<>();
        Collections.addAll(doubleSet, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);

        System.out.println(doubleSet);

        double highestNb = Double.MIN_VALUE;
        for (double newDouble: doubleSet){
            if(newDouble > highestNb){
                highestNb = newDouble;
            }
        }
        System.out.println(highestNb);

        double lowestNb = Double.MAX_VALUE;
        Iterator<Double> iteraDouble = doubleSet.iterator();
        while (iteraDouble.hasNext()){

        }


    }
}
