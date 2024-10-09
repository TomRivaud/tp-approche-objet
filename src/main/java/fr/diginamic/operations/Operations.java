package fr.diginamic.operations;

public class Operations {

    public float Calcul(float a, float b, char operateur){
        if(operateur == '-'){
            return a-b;
        }
        else if(operateur == '+'){
            return a+b;
        }
        else if(operateur == '/'){
            return a/b;
        }
        else if(operateur == '*'){
            return a*b;
        }
        return 0;
    }


}
