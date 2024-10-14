package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {

        ArrayList<Commune> villesListe = new ArrayList<>();

        Path pathRecensement = Paths.get("D:/_DevWeb/Diginamic/Java/TP_ApprocheObjet/TP/recensement.csv");
        System.out.println(pathRecensement);
        List<String> linesRecensement = Files.readAllLines(pathRecensement);


        String entete = linesRecensement.get(0);
        System.out.println(entete);

        for (int i = 1; i < linesRecensement.size(); i++) {
            String ligne = linesRecensement.get(i);

            String[] cell = ligne.split(";");

            String nom = cell[6];
            String codeDepartement = cell[2];
            String nomRegion = cell[0];
            String newStrPopTot = cell[9].replace(" ", "");
            int populationTotale = Integer.parseInt(newStrPopTot);

            Commune ville = new Commune(nom, codeDepartement, nomRegion, populationTotale);

            villesListe.add(ville);
        }


        Path pathRecensement25000 = Paths.get("D:/_DevWeb/Diginamic/Java/TP_ApprocheObjet/TP/recensementHab25000.csv");

        List<String> villeListe25000 = new ArrayList<>();

        for (Commune commune : villesListe) {
            if(commune.getPopTotale()>=25000){
                String ligneSortie = commune.getNom()+ ";" + commune.getCodeDepartement()+ ";" + commune.getNomRegion() + ";" + commune.getPopTotale();
                villeListe25000.add(ligneSortie);
            }
        }
        Files.createFile(pathRecensement25000);
        Files.write(pathRecensement25000, villeListe25000);



        for (int i = 1; i < villesListe.size(); i++) {
            if(villesListe.get(i).popTotale > 25000){
                //villeListe25000.add(villesListe.get(i));
            }
        }
    }
}
