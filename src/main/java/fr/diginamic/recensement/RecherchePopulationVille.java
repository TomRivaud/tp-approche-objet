package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Entrez le nom de la ville :");
        String nomVille = scanner.nextLine();

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                System.out.println("Population de " + nomVille + " : " + ville.getPopulationTotale());
                return;
            }
        }
        System.out.println("Ville non trouvée.");
    }

}
