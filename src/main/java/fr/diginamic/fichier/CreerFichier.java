package fr.diginamic.fichier;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

    public static void main(String[] args) throws Exception {

        Path pathRecensement = Paths.get("D:/_DevWeb/Diginamic/Java/TP_ApprocheObjet/TP/recensement.csv");
        Path newPathRecensement2 = Paths.get("D:/_DevWeb/Diginamic/Java/TP_ApprocheObjet/TP/recensement2.csv");
        List<String> linesRecensement = Files.readAllLines(pathRecensement);
        List<String> hundredLines = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ". " + linesRecensement.get(i));
            hundredLines.add(linesRecensement.get(i));
        }
        Files.createFile(newPathRecensement2);
        Files.write(newPathRecensement2, hundredLines, StandardOpenOption.APPEND);
        List<String> newLinesRecensement2 = Files.readAllLines(pathRecensement);
    }
}
