package fr.diginamic.salaire;

public class Salarie extends Intervenant {

    double salaireMensuel = 1800;

    public Salarie(String nom, String prenom, double salaireMensuel){
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    @Override
    public void getSalaire() {
        System.out.println("Salaire mensuel de " + nom + " " + prenom + " : " + salaireMensuel + "€");
    }
}
