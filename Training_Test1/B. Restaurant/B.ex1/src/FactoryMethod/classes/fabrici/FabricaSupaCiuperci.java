package FactoryMethod.classes.fabrici;

import FactoryMethod.classes.Supa;
import FactoryMethod.classes.SupaDeCiuperci;

public class FabricaSupaCiuperci implements Fabrica {
    @Override
    public Supa getProdus(double pret, double cantitate) {
        return new SupaDeCiuperci(pret, cantitate);
    }
}
