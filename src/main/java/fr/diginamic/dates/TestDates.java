package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Date ajdDate = cal.getTime();
        System.out.println(ajdDate);

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");

        String ajdDateChaine = formateur.format(ajdDate);
        System.out.println(ajdDateChaine);
    }
}
