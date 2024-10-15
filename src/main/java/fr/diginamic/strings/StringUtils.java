package fr.diginamic.strings;

public class StringUtils {

    public static String premierLettreMaj(String nom){
        return nom.substring(0, 1).toUpperCase()+nom.substring(1);
    }

    public static String append(Object... objects){
        StringBuilder builder = new StringBuilder();
        for (Object o : objects){
            builder.append(o);}
        return builder.toString();
    }


}
