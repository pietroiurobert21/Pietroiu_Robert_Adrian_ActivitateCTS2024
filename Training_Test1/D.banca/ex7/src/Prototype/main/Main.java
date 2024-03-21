package Prototype.main;

import Prototype.classes.ContBancar;
import Prototype.classes.Persoana;
import Prototype.classes.Prototype;

public class Main {
    public static void main(String[] args) throws Exception {
        Persoana persoana = new Persoana(21, false, false);
        Prototype cont_1 = new ContBancar(1, persoana);

        ContBancar cont_2 = cont_1.clone();
        cont_2.setNrCont(2);

        ContBancar cont_3 = cont_2.clone();
        cont_3.setNrCont(3);

        System.out.println(cont_1);
        System.out.println(cont_2);
        System.out.println(cont_3);
    }
}