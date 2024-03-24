package Prototype.main;

import Prototype.classes.Rezervare;
import Prototype.classes.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        Rezervare rez_1 = new Rezervare("Mihai", 2);
        RezervareAbstracta rez_2 = rez_1.clone();
        System.out.println(rez_1);
        System.out.println(rez_2);
    }
}