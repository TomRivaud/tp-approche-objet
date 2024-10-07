package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

    double tauxRemun;

    public CompteTaux(int numCompte, double soldeCompte, double tauxRemun) {
        super(numCompte, soldeCompte);
        this.tauxRemun = tauxRemun;
    }

    public double getTauxRemun() {
        return tauxRemun;
    }

    public void setTauxRemun(double tauxRemun) {
        this.tauxRemun = tauxRemun;
    }

    private String remunString;
    public String toString(){
        return super.toString() + ", " + tauxRemun;
    }
}
