package utils;

import java.lang.Integer;

public class TestMethodeStatic {
    public static void main (String[] args){
        String chaine = "12";
        int resultStringToInt = 0;

        resultStringToInt = Integer.parseInt(chaine);
        System.out.println(resultStringToInt);


        int a = 8;
        int b = 7;

        int greatestNumber = Integer.max(a, b);
        System.out.println(greatestNumber);
    }
}
