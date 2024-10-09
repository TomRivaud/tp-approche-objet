package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args){

        Operation operationCredit01 = new Credit("05/02/24", 23);
        Operation operationCredit02 = new Credit("03/06/24", 152);
        Operation operationCredit03 = new Credit("24/06/24", 46);
        Operation operationCredit04 = new Credit("12/08/24", 1256);
        Operation operationDebit01 = new Credit("01/01/24", -775);
        Operation operationDebit02 = new Credit("15/03/24", -120);
        Operation operationDebit03 = new Credit("26/05/24", -12);
        Operation operationDebit04 = new Credit("17/09/24", -5);

        Operation[] arrayOpe = {operationCredit01, operationCredit02, operationCredit03, operationCredit04, operationDebit01, operationDebit02, operationDebit03, operationDebit04};
    }
}
