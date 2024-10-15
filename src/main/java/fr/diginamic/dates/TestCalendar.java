package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar calPrecise = Calendar.getInstance();
        calPrecise.set(2016, 04, 19, 23, 59, 30);
        Date datePrecise = calPrecise.getTime();
        SimpleDateFormat formateurPrecise = new SimpleDateFormat("dd/MM/yyyy");
        String chainePrecise = formateurPrecise.format(datePrecise);
        System.out.println(chainePrecise);


        Calendar calJour = Calendar.getInstance();
        Date dateJour = calJour.getTime();
        SimpleDateFormat formateurJour = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String chaineJour = formateurJour.format(dateJour);
        System.out.println(chaineJour);

        Locale france = new Locale("fr", "FR");
        Locale russe = new Locale("ru", "RU");
        Locale chine = new Locale("zh", "CN");
        Locale allemand = new Locale("de", "DE");
        SimpleDateFormat formateurJourFRA = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", france);
        SimpleDateFormat formateurJourRUS = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", russe);
        SimpleDateFormat formateurJourCHN = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", chine);
        SimpleDateFormat formateurJourALL = new SimpleDateFormat("yyyy/MMMM/EEEE HH:mm:ss", allemand);
        String chaineFrance = formateurJourFRA.format(dateJour);
        String chaineRusse = formateurJourRUS.format(dateJour);
        String chaineChine = formateurJourCHN.format(dateJour);
        String chaineAllemand = formateurJourALL.format(dateJour);
        System.out.println(chaineFrance);
        System.out.println(chaineRusse);
        System.out.println(chaineChine);
        System.out.println(chaineAllemand);
    }
}
