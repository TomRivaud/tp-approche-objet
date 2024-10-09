package fr.diginamic.operations;

public class CalculMoyenne {

    double[] arrayDouble = {5, 2, 3};
    double[] newArray = new double[arrayDouble.length+1];

    public void Ajout(double valeurAjoutee){

        int iNewArray;
        for (iNewArray = 0; iNewArray < arrayDouble.length; iNewArray++){
            newArray[iNewArray] = arrayDouble[iNewArray];
        }
        newArray[newArray.length-1] = valeurAjoutee;
    }

    public double Calcul(){
        int i;
        double resultMoyenne = 0;
        for (i=0; i<newArray.length; i++){
            resultMoyenne += newArray[i];
        }
        resultMoyenne = resultMoyenne/ newArray.length;
        return resultMoyenne;
    }
}
