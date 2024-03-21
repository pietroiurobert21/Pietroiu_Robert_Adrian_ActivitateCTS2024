package FactoryMethod.main;

import FactoryMethod.classes.PlataCard;
import FactoryMethod.classes.PlataContactLess;
import FactoryMethod.classes.PlataOnline;
import FactoryMethod.classes.fabrici.FabricaContactLess;
import FactoryMethod.classes.fabrici.FarbicaAbstracta;
import FactoryMethod.classes.fabrici.FarbicaPlataOnline;

public class Main {
    public static void main(String[] args) {
        FarbicaAbstracta fabrica = new FarbicaPlataOnline();
        PlataCard plata_1 = fabrica.getFunctionalitate(1234,"card de student");
        PlataCard plata_2 = fabrica.getFunctionalitate(1234,"card visa");
        System.out.println(plata_1);
        System.out.println(plata_2);

        FarbicaAbstracta farbica2 = new FabricaContactLess();
        PlataCard plata_3 = farbica2.getFunctionalitate(3214, "card visa");
        PlataCard plata_4 = farbica2.getFunctionalitate(3214, "card de student international");
        System.out.println(plata_3);
        System.out.println(plata_4);
    }
}