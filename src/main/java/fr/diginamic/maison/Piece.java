package fr.diginamic.maison;

public abstract class Piece {

    double superficie;
    int etage;

    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }
}
