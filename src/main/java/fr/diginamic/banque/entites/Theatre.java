package fr.diginamic.banque.entites;

public class Theatre {

    String name;
    int maxCapacity;
    public int clientsRegistered;
    public double moneyMade;

    public Theatre(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public void Inscription(int nbClients, double ticketPrice) {

        if (clientsRegistered + nbClients <= maxCapacity) {
            clientsRegistered += nbClients;
            moneyMade += (ticketPrice*nbClients);
        }
        else{
            System.out.println("ERREUR : Plus de places");
        }
    }
}
