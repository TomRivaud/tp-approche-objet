package fr.diginamic.maison;

public class Maison {

    public Piece[] maison = new Piece[0];

    public Piece[] ajouterPiece(Piece piece){
        //if(piece != null && piece.etage >= 0 && piece.superficie >= 0){
            int taille = maison.length;
            Piece[] maisonCopie = new Piece[maison.length + 1];
            int i;
            for (i=0; i<maisonCopie.length; i++){
                maisonCopie[i] = maison[i];
            }
            maisonCopie[maisonCopie.length-1] = piece;
        /*}
        else {
            Piece[] maisonCopie = maison;
        }*/
        return maisonCopie;
    }

    public double totalSuperficie (Piece[] piece){
        int i;
        double superficieTotale = 0;
        for (i=0; i<piece.length; i++){
            superficieTotale += piece[i].superficie;
        }
        System.out.println("Superficie totale : " + superficieTotale);
        return superficieTotale;
    }

    public double etageSuperficie (Piece[] piece, int etage){
        int i;
        double superficieEtage = 0;
        for (i=0; i<piece.length; i++){
            if(piece[i].etage == etage){
                superficieEtage += piece[i].superficie;
            }
        }
        System.out.println("Superficie de l'étage" + etage + " : " + superficieEtage);
        return superficieEtage;
    }

    public double typePieceSuperficie (Piece piece){
        int i = 0;
        double totalPiecesSuperficie = 0;
        if(piece == this.maison[i]){
            while (i< this.maison.length){
                totalPiecesSuperficie += piece.superficie;
                i++;
            }
        }
        return totalPiecesSuperficie;
    }

    public int nbPieceIdentiques (Piece piece){
        int i = 0;
        int pieceIdentiques = 0;
        if(piece == this.maison[i]){
            while (i< this.maison.length){
                pieceIdentiques++;
                i++;
            }
        }
        return pieceIdentiques;
    }


}
