package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {

    public static void main(String[] args) {
        // Simulation du recensement : en réalité, il faudrait lire les données depuis un fichier CSV
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("11", "Île-de-France", "75", "12345", "Paris", 2140526));
        villes.add(new Ville("44", "Nouvelle-Aquitaine", "33", "54321", "Bordeaux", 254436));

        Recensement recensement = new Recensement(villes);
        Scanner scanner = new Scanner(System.in);

        int choix = 0;
        do {
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le saut de ligne

            switch (choix) {
                case 1:
                    RecherchePopulationVille rechercheVille = new RecherchePopulationVille();
                    rechercheVille.traiter(recensement, scanner);
                    break;
                case 9:
                    System.out.println("Sortie du programme.");
                    break;
                default:
                    System.out.println("Choix non valide.");
            }

        } while (choix != 9);
        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("1. Population d’une ville donnée");
        System.out.println("9. Sortir");
        System.out.print("Choisissez une option : ");
    }
}
